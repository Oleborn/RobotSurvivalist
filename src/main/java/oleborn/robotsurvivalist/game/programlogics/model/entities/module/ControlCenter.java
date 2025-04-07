package oleborn.robotsurvivalist.game.programlogics.model.entities.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;

import java.util.UUID;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "control_centers")
public class ControlCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer mass;
    private Integer durability;
    private Integer occupiedCapacity;
    private Integer price;
    private Integer countOfWrittenCommands;
    private String description;

    @OneToOne(fetch = FetchType.LAZY)  // ленивая загрузка
    @JoinColumn(name = "robot_id")      // создаст столбец robot_id
    private RobotEntity robot;          // null, если не привязан
}
