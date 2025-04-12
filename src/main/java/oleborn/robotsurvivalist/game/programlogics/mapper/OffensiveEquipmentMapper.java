package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.OffensiveEquipmentDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Engine;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.OffensiveEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectEngine;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectOffensiveEquipment;
import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface OffensiveEquipmentMapper {

    OffensiveEquipment toEntity(OffensiveEquipmentDto dto);

    OffensiveEquipmentDto toDto(OffensiveEquipment entity);

    OffensiveEquipment addOwner(ProjectOffensiveEquipment projectOffensiveEquipment, UUID robotId);

}
