package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.ControlCenterDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.CommunicationAntenna;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.ControlCenter;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectCommunicationAntenna;
import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface ControlCenterMapper {

    ControlCenter toEntity(ControlCenterDto dto);

    ControlCenterDto toDto(ControlCenter entity);

    ControlCenter addOwner(ProjectCommunicationAntenna antenna, UUID robotId);
}
