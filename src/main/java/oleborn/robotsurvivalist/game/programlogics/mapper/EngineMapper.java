package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.EngineDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.DefenseEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Engine;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectDefenseEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectEngine;
import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface EngineMapper {

    Engine toEntity(EngineDto dto);

    EngineDto toDto(Engine entity);

    Engine addOwner(ProjectEngine projectEngine, UUID robotId);
}
