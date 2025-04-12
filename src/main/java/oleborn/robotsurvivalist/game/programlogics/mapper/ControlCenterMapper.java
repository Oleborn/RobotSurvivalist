package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.ControlCenterDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.ControlCenter;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ControlCenterMapper {

    ControlCenter toEntity(ControlCenterDto dto);

    ControlCenterDto toDto(ControlCenter entity);
}
