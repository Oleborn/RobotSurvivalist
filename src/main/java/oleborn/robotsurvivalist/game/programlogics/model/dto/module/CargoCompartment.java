package oleborn.robotsurvivalist.game.programlogics.model.dto.module;

import java.util.UUID;

public record CargoCompartmentDto
    private UUID id;
    private Integer weightWithoutLoad;
    private Integer maximumLadenWeight;
    private Integer durability;
    private Integer occupiedCapacity;
    private Integer capacity;
    private Integer price;
    private String description;


