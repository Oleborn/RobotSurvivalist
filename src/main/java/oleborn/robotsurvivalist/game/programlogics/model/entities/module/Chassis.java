package oleborn.robotsurvivalist.game.programlogics.model.entities.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectChassis;
import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "chassis")
public class Chassis extends ProjectChassis {

    @OneToOne(mappedBy = "chassis")
    private RobotEntity robot;

}
