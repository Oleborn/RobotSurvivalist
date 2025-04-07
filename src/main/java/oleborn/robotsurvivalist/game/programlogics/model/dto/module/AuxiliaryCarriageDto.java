package oleborn.robotsurvivalist.game.programlogics.model.dto.module;

public record AuxiliaryCarriageDto
        (
                Integer mass,
                Integer durability,
                Integer occupiedCapacity,
                Integer maxLiftWeight,
                Integer damage,
                String description
        ) {
}

