package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.MiningEquipmentDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Engine;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.MiningEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectEngine;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectMiningEquipment;
import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface MiningEquipmentMapper {

    MiningEquipment toEntity(MiningEquipmentDto dto);

    MiningEquipmentDto toDto(MiningEquipment entity);

    MiningEquipment addOwner(ProjectMiningEquipment miningEquipment, UUID robotId);

}
