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
@Table(name = "project_cargo_compartments")
public class ProjectCargoCompartment extends ParentModule {

    //Вместимость грузового отсека в единицах объема
    @Column(name = "capacity")
    private Integer capacity;

}
