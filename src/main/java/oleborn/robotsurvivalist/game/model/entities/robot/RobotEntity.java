package oleborn.robotsurvivalist.game.model.entities.robot;

import lombok.*;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.modulerobot.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RobotEntity {

    // Персонализация
    private UUID uuid;
    private Long OperatorId;
    private String nameModel;
    private String descriptionModel;
    private ZonedDateTime creationDate;

    //Текущие, изменяемые свойства
    private Integer[][] coordinates;
    private Integer sumWeight;
    private Integer sumCapacity;
    private Integer sumDurability;
    private Integer countFuel;

    //Модули
    private ControlCenter controlCenter;
    private CommunicationAntenna antenna;
    private Engine engine;
    private CargoCompartment compartment;
    private Chassis chassis;
    private FuelTanks fuelTanks;

    //Модули взаимодействия
    private List<MainCarriageModules> mainCarriageModulesList;
    private List<AuxiliaryCarriageModules> auxiliaryCarriageModulesList;

}
