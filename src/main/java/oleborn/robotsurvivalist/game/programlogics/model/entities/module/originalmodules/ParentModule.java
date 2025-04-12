package oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.ZonedDateTime;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
public abstract class ParentModule {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "model", unique = true, nullable = false)
    private String model;

    @Column(name = "description")
    private String description;

    @Column(name = "mass")
    private Integer mass;

    @Column(name = "durability")
    private Integer durability;

    @Column(name = "occupied_space")
    private Integer occupiedSpace;

    @Column(name = "main_price")
    private Integer mainPrice;

    @Column(name = "creation_date")
    private ZonedDateTime creationDate;

    @Column(name = "modification_date")
    private ZonedDateTime modificationDate;

}
