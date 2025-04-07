package oleborn.robotsurvivalist.game.programlogics.model.dto.module;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "control_centers")
public class ControlCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Integer mass;
    private Integer durability;
    private Integer occupiedCapacity;
    private Integer price;
    private Integer countOfWrittenCommands;
    private String description;
}
