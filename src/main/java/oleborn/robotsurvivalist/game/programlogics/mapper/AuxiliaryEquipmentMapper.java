package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.AuxiliaryEquipmentDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.AuxiliaryEquipment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuxiliaryEquipmentMapper {

    AuxiliaryEquipment toEntity(AuxiliaryEquipmentDto dto);

    AuxiliaryEquipmentDto toDto(AuxiliaryEquipment entity);

}
