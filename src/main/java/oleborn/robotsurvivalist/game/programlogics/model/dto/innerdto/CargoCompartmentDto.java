package oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto;

import oleborn.robotsurvivalist.game.programlogics.model.dto.RobotEntityDto;

import java.time.ZonedDateTime;
import java.util.UUID;

public record CargoCompartmentDto(
        UUID id,
        String model,
        String description,
        Integer mass,
        Integer durability,
        Integer occupiedSpace,
        Integer mainPrice,
        ZonedDateTime creationDate,
        ZonedDateTime modificationDate,

        Integer capacity,

        RobotEntityDto robot

) {
}
