package oleborn.robotsurvivalist.game.programlogics.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.operatordictionary.OperatorMoveStatus;
import oleborn.robotsurvivalist.game.programlogics.mapper.OperatorMapper;
import oleborn.robotsurvivalist.game.programlogics.model.dto.OperatorDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.operator.Operator;
import oleborn.robotsurvivalist.game.programlogics.repository.OperatorRepository;
import oleborn.robotsurvivalist.utils.UtilsMethods;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Transactional
public class OperatorService {

    private final OperatorRepository operatorRepository;
    private final OperatorMapper operatorMapper;
    private final RobotServiceImpl robotService;

    public Optional<Operator> findById(Update update) {
        return operatorRepository.findById(UtilsMethods.searchId(update));
    }

    public OperatorDto saveOperator(Update update) {
        Optional<Operator> byId = findById(update);
        if (byId.isEmpty()) {
            OperatorDto startOperator = createStartOperator(update);
            return operatorMapper.toDto(operatorRepository.save(operatorMapper.fromDto(startOperator)));
        }
        return null;
    }

    public void setupStatus(Update update, OperatorMoveStatus status) {
        Optional<Operator> byId = findById(update);
        if (byId.isPresent()) {
            Operator operator = byId.get();
            operator.setMoveStatus(status);
            Operator save = operatorRepository.save(operator);
            System.out.println("Operator saved: " + save);
        }
    }

    public void setupActiveRobot(Update update, UUID robotUuid) {
        Optional<Operator> byId = findById(update);
        if (byId.isPresent()) {
            Operator operator = byId.get();
            operator.setActiveRobot(robotUuid);
            Operator save = operatorRepository.save(operator);
            System.out.println("Operator saved: " + save);
        }
    }

    private OperatorDto createStartOperator(Update update) {
        robotService.saveDefaultRobot(update);
        return new OperatorDto(
                update.getCallbackQuery().getFrom().getId(),
                update.getCallbackQuery().getFrom().getUserName(),
                OperatorMoveStatus.IN_CENTRAL_CORRIDOR,
                ZonedDateTime.now(),
                ZonedDateTime.now(),
                1000L,
                List.of(),
                List.of(),
                0,
                null
        );
    }



}
