package oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto;

import java.time.ZonedDateTime;
import java.util.UUID;

public record AuxiliaryEquipmentDto(
        UUID id,
        String model,
        String description,
        Integer mass,
        Integer durability,
        Integer occupiedSpace,
        Integer mainPrice,
        ZonedDateTime creationDate,
        ZonedDateTime modificationDate
) {
}
