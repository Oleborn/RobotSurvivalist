package oleborn.robotsurvivalist.game.programlogics.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.programlogics.mapper.OperatorMapper;
import oleborn.robotsurvivalist.game.programlogics.model.dto.OperatorDto;
import oleborn.robotsurvivalist.game.programlogics.model.dto.RobotEntityDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.operator.Operator;
import oleborn.robotsurvivalist.game.programlogics.repository.OperatorRepository;
import oleborn.robotsurvivalist.game.programlogics.repository.RobotRepository;
import oleborn.robotsurvivalist.utils.UtilsMethods;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class OperatorService {

    private final OperatorRepository operatorRepository;
    private final OperatorMapper operatorMapper;
    private final RobotService robotService;

    public OperatorDto saveOperator(Update update) {
        Optional<Operator> byId = operatorRepository.findById(UtilsMethods.searchId(update));
        if (byId.isEmpty()) {
            OperatorDto startOperator = createStartOperator(update);
            return operatorMapper.toDto(operatorRepository.save(operatorMapper.fromDto(startOperator)));
        }
        return null;

    }

    private OperatorDto createStartOperator(Update update) {
        return new OperatorDto(
                update.getCallbackQuery().getFrom().getId(),
                update.getCallbackQuery().getFrom().getUserName(),
                ZonedDateTime.now(),
                ZonedDateTime.now(),
                1000L,
                List.of(robotService.createDefaultRobot(update)),
                List.of(),
                0
        );
    }

}
