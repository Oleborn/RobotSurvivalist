package oleborn.robotsurvivalist.game.programlogics.model.dto;

import lombok.Builder;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.scientistsroom.Technology;
import oleborn.robotsurvivalist.game.gamedictionary.operatordictionary.OperatorMoveStatus;

import java.time.ZonedDateTime;
import java.util.List;

@Builder
public record OperatorDto(
        Long id,
        String login,
        OperatorMoveStatus moveStatus,
        ZonedDateTime createdDate,
        ZonedDateTime lastModificationDate,
        Long countMoney,
        List<RobotEntityDto> robots,
        List<Technology> researchTechnologies,
        int reputation
) {
}


