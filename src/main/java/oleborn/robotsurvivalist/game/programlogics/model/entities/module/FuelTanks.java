package oleborn.robotsurvivalist.game.programlogics.model.entities.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectFuelTanks;
import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fuel_tanks")
public class FuelTanks extends ProjectFuelTanks {

    @OneToOne(mappedBy = "fuelTanks")
    private RobotEntity robot;

}
