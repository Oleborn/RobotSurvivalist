package oleborn.robotsurvivalist.game.programlogics.model.entities.robot;

import jakarta.persistence.*;
import lombok.*;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.*;

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
    @OneToOne(cascade = CascadeType.ALL)
    private ControlCenter controlCenter;

    @OneToOne(cascade = CascadeType.ALL)
    private CommunicationAntenna antenna;

    @OneToOne(cascade = CascadeType.ALL)
    private Engine engine;

    @OneToOne(cascade = CascadeType.ALL)
    private CargoCompartment compartment;

    @OneToOne(cascade = CascadeType.ALL)
    private Chassis chassis;

    @OneToOne(cascade = CascadeType.ALL)
    private FuelTanks fuelTanks;

    //Модули взаимодействия
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "main_carriage.id")
    private List<MainCarriage> mainCarriageModulesList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "auxiliary_carriage.id")
    private List<AuxiliaryCarriage> auxiliaryCarriageModulesList;

    @Column(name = "cellmap_id")
    private Long cellMapId;

}
