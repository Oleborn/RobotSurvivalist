package oleborn.robotsurvivalist.game.programlogics.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.modulerobot.*;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionChassis;
import oleborn.robotsurvivalist.game.programlogics.mapper.RobotMapper;
import oleborn.robotsurvivalist.game.programlogics.model.dto.RobotEntityDto;
import oleborn.robotsurvivalist.game.programlogics.repository.RobotRepository;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.instance.ChassisService;
import oleborn.robotsurvivalist.utils.UtilsMethods;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RobotServiceImpl implements RobotService {

    private final RobotRepository repository;
    private final RobotMapper robotMapper;
    private final ChassisService chassisService;

    @Override
    public void createRobot(Update update, RobotEntityDto robotEntityDto) {

    }

    @Override
    @Transactional
    public List<RobotEntityDto> loadRobotsForOperator(Update update) {
        return robotMapper.toDtos(repository.findByOperatorId(UtilsMethods.searchId(update)));
    }

    @Override
    @Transactional
    public RobotEntityDto findRobotByUUID(UUID uuid) {
        return robotMapper.toDto(repository.findById(uuid).orElse(null));
    }

    @Override
    public void updateRobot(RobotEntityDto robot) {

    }

    @Override
    public void deleteRobot(Update update) {
        repository.removeByOperatorId(UtilsMethods.searchId(update));
    }

    @Override
    public void saveRobot(RobotEntityDto robotEntityDto) {
        repository.save(robotMapper.toEntity(robotEntityDto));
    }

    @Transactional
    public void saveDefaultRobot(Update update) {
        int sumWeight = sumWeight(ControlCenterD.DEFAULT, CommunicationAntennaD.DEFAULT, EngineD.DEFAULT_ENGINE, CargoCompartmentD.DEFAULT,
                FuelTanksD.DEFAULT_FUEL_TANKS, 50, 0);

        int sumCapacity = sumCapacity(ControlCenterD.DEFAULT, CommunicationAntennaD.DEFAULT, EngineD.DEFAULT_ENGINE, CargoCompartmentD.DEFAULT,
                FuelTanksD.DEFAULT_FUEL_TANKS);

        int sumDurability = sumDurability(ControlCenterD.DEFAULT, CommunicationAntennaD.DEFAULT, EngineD.DEFAULT_ENGINE, CargoCompartmentD.DEFAULT,
                FuelTanksD.DEFAULT_FUEL_TANKS, ChassisD.DEFAULT_WHEELS_CHASSIS);

        UUID defaultRobotUuid = UUID.randomUUID();

        //засетить загрузку дефолтного робота
        saveRobot(RobotEntityDto.builder()
                .uuid(defaultRobotUuid)
                .chassis(chassisService.setInRobot(DescriptionChassis.DEFAULT_WHEELS_CHASSIS.getName(), defaultRobotUuid))
                .build());
    }

    private int sumWeight(


            ControlCenterD controlCenter,
            CommunicationAntennaD communicationAntenna,
            EngineD engine,
            CargoCompartmentD compartment,
            FuelTanksD fuelTanks,
            int quantityFuel,
            int massStorage
    ) {
        return controlCenter.getMass()
               + communicationAntenna.getMass()
               + engine.getMass()
               + compartment.getWeightWithoutLoad()
               + fuelTanks.getMassWithoutFuel()
               + quantityFuel
               + massStorage;
    }

    private int sumCapacity(ControlCenterD controlCenter,
                            CommunicationAntennaD communicationAntenna,
                            EngineD engine,
                            CargoCompartmentD compartment,
                            FuelTanksD fuelTanks) {
        return controlCenter.getOccupiedCapacity()
               + communicationAntenna.getOccupiedCapacity()
               + engine.getOccupiedCapacity()
               + compartment.getOccupiedCapacity()
               + fuelTanks.getOccupiedCapacity();
    }

    private int sumDurability(ControlCenterD controlCenter,
                              CommunicationAntennaD communicationAntenna,
                              EngineD engine,
                              CargoCompartmentD compartment,
                              FuelTanksD fuelTanks,
                              ChassisD chassis) {
        return controlCenter.getDurability()
               + communicationAntenna.getDurability()
               + engine.getDurability()
               + compartment.getDurability()
               + fuelTanks.getDurability()
               + chassis.getDurability();
    }

}
