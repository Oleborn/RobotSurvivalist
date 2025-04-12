package oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project_fuel_tanks")
public class ProjectFuelTanks extends ParentModule {

    //вмещает топлива в единицах объема
    @Column(name = "fuel_capacity")
    private Integer fuelCapacity;
}
