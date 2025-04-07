package oleborn.robotsurvivalist.game.programlogics.model.dto.module;

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
@Table(name = "engins")
public class Engine {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer mass;
    private Integer durability;
    private Integer occupiedCapacity;
    private Integer price;
    private Double speed;
    private Integer fuelConsumption;
    private String description;
}
