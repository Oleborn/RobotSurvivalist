package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.EngineDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Engine;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EngineMapper {

    Engine toEntity(EngineDto dto);

    EngineDto toDto(Engine entity);
}
