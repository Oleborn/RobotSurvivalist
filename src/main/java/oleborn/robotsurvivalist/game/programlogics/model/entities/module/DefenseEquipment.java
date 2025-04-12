package oleborn.robotsurvivalist.game.programlogics.model.entities.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectDefenseEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "defense_equipment")
public class DefenseEquipment extends ProjectDefenseEquipment {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "robot_uuid")
    private RobotEntity robot;
}
