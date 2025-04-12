package oleborn.robotsurvivalist.game.programlogics.model.entities.module;

import jakarta.persistence.*;
import lombok.*;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectChassis;


import java.util.UUID;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "chassis")
public class Chassis extends ProjectChassis {

    @Column(name = "robot_id")
    private UUID robotId;

}
