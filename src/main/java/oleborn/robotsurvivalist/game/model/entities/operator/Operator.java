package oleborn.robotsurvivalist.game.model.entities.operator;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oleborn.robotsurvivalist.game.gamedictionary.mapdictionary.basedictionary.Technology;
import oleborn.robotsurvivalist.game.model.entities.robot.RobotEntity;

import java.time.ZonedDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "operators")
public class Operator {

    //Статические данные
    @Id
    private Long id;
    private String login;

    @Column(name = "created_date")
    private ZonedDateTime createdDate;

    //технические данные
    @Column(name = "last_modification_date")
    private ZonedDateTime lastModificationDate;

    //изменяемые данные
    @Column(name = "money")
    private Long countMoney;

    @OneToMany(mappedBy = "operator")
    private List<RobotEntity> robots;

    @ElementCollection
    @CollectionTable(name = "operator_technologies", joinColumns = @JoinColumn(name = "operator_id"))
    @Column(name = "technology")
    private List<Technology> researchTechnologies;

    @Column(name = "reputation")
    private int reputation;

}
