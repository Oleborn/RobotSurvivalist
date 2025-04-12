package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.CommunicationAntennaDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.CargoCompartment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.CommunicationAntenna;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectCargoCompartment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectCommunicationAntenna;
import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface CommunicationAntennaMapper {

    CommunicationAntenna toEntity(CommunicationAntennaDto dto);

    CommunicationAntennaDto toDto(CommunicationAntenna entity);

    CommunicationAntenna addOwner(ProjectCommunicationAntenna antenna, UUID robotId);
}
