package oleborn.robotsurvivalist.game.programlogics.model.entities.module;

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
@Table(name = "fuel_tanks")
public class FuelTanks {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer massWithoutFuel;
    private Integer fuelCapacity;
    private Integer durability;
    private Integer occupiedCapacity;
    private Integer price;
    private String description;

}
