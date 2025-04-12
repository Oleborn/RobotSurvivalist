package oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules;

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
@Table(name = "project_control_centers")
public class ProjectControlCenter extends ParentModule {

    //Количество запоминаемых команд
    @Column(name = "count_of_written_commands")
    private Integer countOfWrittenCommands;

}
