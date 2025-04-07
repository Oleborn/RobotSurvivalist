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
@Table(name = "main_carriage")
public class MainCarriage {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer mass;
    private Integer durability;
    private Integer occupiedCapacity;
    private Integer maxLiftWeight;
    private Integer damage;
    private String description;
}
