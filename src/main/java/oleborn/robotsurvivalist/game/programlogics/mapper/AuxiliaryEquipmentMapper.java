package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.AuxiliaryEquipmentDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.AuxiliaryEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Chassis;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectAuxiliaryEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectChassis;
import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface AuxiliaryEquipmentMapper {

    AuxiliaryEquipment toEntity(AuxiliaryEquipmentDto dto);

    AuxiliaryEquipmentDto toDto(AuxiliaryEquipment entity);

    AuxiliaryEquipment addOwner(ProjectAuxiliaryEquipment auxiliaryEquipment, UUID robotId);

}
