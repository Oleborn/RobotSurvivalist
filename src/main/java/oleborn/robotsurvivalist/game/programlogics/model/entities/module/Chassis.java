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
@Table(name = "chassis")
public class Chassis {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer supportedWeight;
    private Integer durability;
    private Integer occupiedCapacity;
    private Double maxSpeed;
    private Boolean abilityToFloat;
    private Integer countOfMainCarriages;
    private Integer countOfAuxiliaryCarriages;
    private Integer price;
    private String description;

}
