package oleborn.robotsurvivalist.game.programlogics.model.entities.robot;

import jakarta.persistence.*;
import lombok.*;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.*;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.MiningEquipment;

import java.time.ZonedDateTime;
import java.util.List;
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
    private UUID uuid;

    @Column(name = "operator_id")
    private Long operatorId;

    @Column(name = "name")
    private String name;

    @Column(name = "creation_date")
    private ZonedDateTime creationDate;

    //технические данные
    @Column(name = "modification_date")
    private ZonedDateTime modificationDate;

    //Текущие, изменяемые свойства
    @Column(name = "x_coord")
    private Integer xCoordinate;

    @Column(name = "y_coord")
    private Integer yCoordinate;

    private Integer sumWeight;
    private Integer sumCapacity;
    private Integer sumDurability;

    private Integer currentFuel;
    private Integer currentDurability;
    private Integer currentMassStorage;

    //Модули
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "robot")
    private ControlCenter controlCenter;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "robot")
    private CommunicationAntenna antenna;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "robot")
    private Engine engine;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "robot")
    private CargoCompartment compartment;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "robot")
    private Chassis chassis;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "robot")
    private FuelTanks fuelTanks;

    //Модули взаимодействия
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "robot")
    private List<OffensiveEquipment> offensiveEquipmentList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "robot")
    private List<AuxiliaryEquipment> auxiliaryEquipmentList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "robot")
    private List<MiningEquipment> miningEquipmentList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "robot")
    private List<DefenseEquipment> defenseEquipmentList;

    @Column(name = "cellmap_id")
    private Long cellMapId;

}
