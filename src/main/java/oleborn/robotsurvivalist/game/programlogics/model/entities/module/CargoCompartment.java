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
@Table(name = "cargo_compartments")
public class CargoCompartment {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer weightWithoutLoad;
    private Integer maximumLadenWeight;
    private Integer durability;
    private Integer occupiedCapacity;
    private Integer capacity;
    private Integer price;
    private String description;

}
