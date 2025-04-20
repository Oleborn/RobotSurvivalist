package oleborn.robotsurvivalist.game.programlogics.model.entities.operator;

import jakarta.persistence.*;
import lombok.*;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.scientistsroom.Technology;
import oleborn.robotsurvivalist.game.gamedictionary.operatordictionary.OperatorMoveStatus;
import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "operators")
@ToString
public class Operator {

    //Статические данные
    @Id
    private Long id;
    private String login;

    private OperatorMoveStatus moveStatus;

    @Column(name = "created_date")
    private ZonedDateTime createdDate;

    //технические данные
    @Column(name = "last_modification_date")
    private ZonedDateTime lastModificationDate;

    //изменяемые данные
    @Column(name = "money")
    private Long countMoney;

    @OneToMany(mappedBy = "operatorId")
    private List<RobotEntity> robots;

    @ElementCollection
    @CollectionTable(name = "operator_technologies", joinColumns = @JoinColumn(name = "operator_id"))
    @Column(name = "technology")
    private List<Technology> researchTechnologies;

    @Column(name = "reputation")
    private Integer reputation;

    @Column(name = "active_robot")
    private UUID activeRobot;

}
