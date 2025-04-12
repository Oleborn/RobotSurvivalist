package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.CommunicationAntennaDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.CommunicationAntenna;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CommunicationAntennaMapper {

    CommunicationAntenna toEntity(CommunicationAntennaDto dto);

    CommunicationAntennaDto toDto(CommunicationAntenna entity);
}
