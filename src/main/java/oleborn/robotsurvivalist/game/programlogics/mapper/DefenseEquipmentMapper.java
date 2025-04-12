package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.DefenseEquipmentDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.ControlCenter;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.DefenseEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectCommunicationAntenna;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectDefenseEquipment;
import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface DefenseEquipmentMapper {

    DefenseEquipment toEntity(DefenseEquipmentDto dto);

    DefenseEquipmentDto toDto(DefenseEquipment entity);

    DefenseEquipment addOwner(ProjectDefenseEquipment defenseEquipment, UUID robotId);
}
