package oleborn.robotsurvivalist.game.model.entities;

import lombok.*;
import oleborn.robotsurvivalist.game.gamedictionary.*;

import java.util.List;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RobotEntity {

    // Персонализация
    private UUID uuid;
    private Long ownerId;
    private String nameModel;
    private String descriptionModel;

    //Текущие, изменяемые свойства
    private Integer[][] coordinates;
    private Integer sumWeight;
    private Integer sumCapacity;
    private Integer sumDurability;

    //Модули
    private ControlCenter controlCenter;
    private CommunicationAntenna antenna;
    private EngineModule engine;
    private CargoCompartment compartment;
    private Chassis chassis;

    //Модули взаимодействия
    private List<MainCarriageModules> mainCarriageModulesList;
    private List<AuxiliaryCarriageModules> auxiliaryCarriageModulesList;

}
