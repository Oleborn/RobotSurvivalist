package oleborn.robotsurvivalist.game.programlogics.model.entities.robot;

import jakarta.persistence.*;
import lombok.*;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.modulerobot.*;
import oleborn.robotsurvivalist.game.programlogics.model.entities.map.CellMap;
import oleborn.robotsurvivalist.game.programlogics.model.entities.operator.Operator;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "robots")
@ToString
public class RobotEntity {

    // Персонализация
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID uuid;

    private Long operatorId;

    @Column(name = "name_model")
    private String nameModel;

    @Column(name = "description")
    private String descriptionModel;

    @Column(name = "creation_date")
    private ZonedDateTime creationDate;

    //технические данные
    @Column(name = "modification_date")
    private ZonedDateTime modificationDate;

    //Текущие, изменяемые свойства
    @Column(name = "x_coord")
    private Integer XCoordinate;

    @Column(name = "y_coord")
    private Integer YCoordinate;

    private Integer sumWeight;
    private Integer sumCapacity;
    private Integer sumDurability;
    private Integer countFuel;

    //Модули
    @Enumerated(EnumType.STRING)
    private ControlCenter controlCenter;

    @Enumerated(EnumType.STRING)
    private CommunicationAntenna antenna;

    @Enumerated(EnumType.STRING)
    private Engine engine;

    @Enumerated(EnumType.STRING)
    private CargoCompartment compartment;

    @Enumerated(EnumType.STRING)
    private Chassis chassis;

    @Enumerated(EnumType.STRING)
    private FuelTanks fuelTanks;

    //Модули взаимодействия
    @ElementCollection
    @CollectionTable(name = "robot_main_carriage", joinColumns = @JoinColumn(name = "robot_uuid"))
    @Column(name = "main_carriage_modules")
    @Enumerated(EnumType.STRING)
    private List<MainCarriageModules> mainCarriageModulesList;

    @ElementCollection
    @CollectionTable(name = "robot_auxiliary_carriage", joinColumns = @JoinColumn(name = "robot_uuid"))
    @Column(name = "auxiliary_carriage_modules")
    @Enumerated(EnumType.STRING)
    private List<AuxiliaryCarriageModules> auxiliaryCarriageModulesList;

    @Column(name = "cellmap_id")
    private Long cellMapId;

}
