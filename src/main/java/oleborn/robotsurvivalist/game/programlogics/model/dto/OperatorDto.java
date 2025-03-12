package oleborn.robotsurvivalist.game.programlogics.model.dto;

import lombok.Builder;
import oleborn.robotsurvivalist.game.gamedictionary.mapdictionary.basedictionary.Technology;

import java.time.ZonedDateTime;
import java.util.List;

@Builder
public record OperatorDto(
        Long id,
        String login,
        ZonedDateTime createdDate,
        ZonedDateTime lastModificationDate,
        Long countMoney,
        List<RobotEntityDto> robots,
        List<Technology> researchTechnologies,
        int reputation
) {
}


