package oleborn.robotsurvivalist.game.programlogics.model.entities.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectCommunicationAntenna;
import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "antenna")
public class CommunicationAntenna extends ProjectCommunicationAntenna {

    @OneToOne(mappedBy = "antenna")
    private RobotEntity robot;

}
