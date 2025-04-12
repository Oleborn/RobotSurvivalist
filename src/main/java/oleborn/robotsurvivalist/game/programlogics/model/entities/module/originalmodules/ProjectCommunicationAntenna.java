package oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project_antenns")
public class ProjectCommunicationAntenna extends ParentModule {

    //радиус обзора в клетках, дальше не видно
    @Column(name = "viewing_radius")
    private Integer viewingRadius;

    //радиус взаимодействия с базой, при превышении робот теряет управление
    @Column(name = "communication_range")
    private Integer communicationRange;

}
