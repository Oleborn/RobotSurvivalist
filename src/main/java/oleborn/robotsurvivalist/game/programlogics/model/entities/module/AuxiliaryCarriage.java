package oleborn.robotsurvivalist.game.programlogics.model.entities.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "auxiliary_carriage")
public class AuxiliaryCarriage {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer mass;
    private Integer durability;
    private Integer occupiedCapacity;
    private Integer maxLiftWeight;
    private Integer damage;
    private String description;

    @ManyToOne // модуль может быть без робота
    @JoinColumn(name = "robot_id")
    private RobotEntity robot;  // может быть null
}
