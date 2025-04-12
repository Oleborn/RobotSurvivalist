package oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto;

import oleborn.robotsurvivalist.game.programlogics.model.dto.RobotEntityDto;

import java.time.ZonedDateTime;
import java.util.UUID;

public record CommunicationAntennaDto(
        UUID id,
        String model,
        String description,
        Integer mass,
        Integer durability,
        Integer occupiedSpace,
        Integer mainPrice,
        ZonedDateTime creationDate,
        ZonedDateTime modificationDate,

        Integer viewingRadius,
        Integer communicationRange,

        RobotEntityDto robot
) {
}
