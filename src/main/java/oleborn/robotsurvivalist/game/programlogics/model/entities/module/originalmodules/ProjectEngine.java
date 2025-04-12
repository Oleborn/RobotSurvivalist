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
@Table(name = "project_engins")
public class ProjectEngine extends ParentModule {

    //Скорость двигателя клетка в минуту
    @Column(name = "speed")
    private Integer speed;

    //Расход топлива единиц на клетку
    @Column(name = "fuel_consumption")
    private Integer fuelConsumption;
}
