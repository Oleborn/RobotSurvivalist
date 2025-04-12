package oleborn.robotsurvivalist.game.programlogics.model.entities.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectAuxiliaryEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "auxiliary_equipment")
public class AuxiliaryEquipment extends ProjectAuxiliaryEquipment {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "robot_uuid")
    private RobotEntity robot;
}
