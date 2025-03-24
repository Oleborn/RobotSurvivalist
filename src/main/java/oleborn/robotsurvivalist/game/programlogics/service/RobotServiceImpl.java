package oleborn.robotsurvivalist.game.programlogics.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.modulerobot.*;
import oleborn.robotsurvivalist.game.programlogics.mapper.RobotMapper;
import oleborn.robotsurvivalist.game.programlogics.model.dto.RobotEntityDto;
import oleborn.robotsurvivalist.game.programlogics.repository.RobotRepository;
import oleborn.robotsurvivalist.utils.UtilsMethods;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RobotServiceImpl implements RobotService {

    private final RobotRepository repository;
    private final RobotMapper robotMapper;

    @Override
    public void createRobot(Update update, RobotEntityDto robotEntityDto) {

    }

    @Override
    public List<RobotEntityDto> loadRobotsForOperator(Update update) {
        return robotMapper.toDtos(repository.findByOperatorId(UtilsMethods.searchId(update)));
    }

    @Override
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
    public RobotEntityDto createDefaultRobot(Update update) {
        return new RobotEntityDto(
                        null,
                        update.getCallbackQuery().getFrom().getId(),
                        "Default", //сделать норм имя и описание
                        "Default",
                        ZonedDateTime.now(),
                        ZonedDateTime.now(),
                        0,
                        0,
                        sumWeight(ControlCenter.DEFAULT, CommunicationAntenna.DEFAULT, Engine.DEFAULT_ENGINE,CargoCompartment.DEFAULT,
                                FuelTanks.DEFAULT_FUEL_TANKS, 50, 0),
                        sumCapacity(ControlCenter.DEFAULT, CommunicationAntenna.DEFAULT, Engine.DEFAULT_ENGINE,CargoCompartment.DEFAULT,
                                FuelTanks.DEFAULT_FUEL_TANKS),
                        sumDurability(ControlCenter.DEFAULT, CommunicationAntenna.DEFAULT, Engine.DEFAULT_ENGINE,CargoCompartment.DEFAULT,
                                FuelTanks.DEFAULT_FUEL_TANKS, Chassis.DEFAULT_WHEELS_CHASSIS),
                        50,
                        ControlCenter.DEFAULT,
                CommunicationAntenna.DEFAULT,
                Engine.DEFAULT_ENGINE,
                CargoCompartment.DEFAULT,
                Chassis.DEFAULT_WHEELS_CHASSIS,
                FuelTanks.DEFAULT_FUEL_TANKS,
                List.of(MainCarriageModules.DEFAULT_MANIPULATOR),
                List.of(),
                1
                );
    }

    private int sumWeight(
            ControlCenter controlCenter,
            CommunicationAntenna communicationAntenna,
            Engine engine,
            CargoCompartment compartment,
            FuelTanks fuelTanks,
            int quantityFuel,
            int massStorage
            ) {
        return controlCenter.getMass()
               +communicationAntenna.getMass()
                +engine.getMass()
                +compartment.getWeightWithoutLoad()
                +fuelTanks.getMassWithoutFuel()
                +quantityFuel
               +massStorage;
    }

    private int sumCapacity(ControlCenter controlCenter,
                            CommunicationAntenna communicationAntenna,
                            Engine engine,
                            CargoCompartment compartment,
                            FuelTanks fuelTanks) {
        return controlCenter.getOccupiedCapacity()
                +communicationAntenna.getOccupiedCapacity()
                +engine.getOccupiedCapacity()
                +compartment.getOccupiedCapacity()
               +fuelTanks.getOccupiedCapacity();
    }

    private int sumDurability(ControlCenter controlCenter,
                              CommunicationAntenna communicationAntenna,
                              Engine engine,
                              CargoCompartment compartment,
                              FuelTanks fuelTanks,
                              Chassis chassis) {
        return controlCenter.getDurability()
               +communicationAntenna.getDurability()
                +engine.getDurability()
                +compartment.getDurability()
                +fuelTanks.getDurability()
                +chassis.getDurability();
    }

}
