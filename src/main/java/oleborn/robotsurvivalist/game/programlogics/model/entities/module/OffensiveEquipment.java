package oleborn.robotsurvivalist.game.programlogics.model.entities.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectOffensiveEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "offensive_equipment")
public class OffensiveEquipment extends ProjectOffensiveEquipment {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "robot_uuid")
    private RobotEntity robot;
}
