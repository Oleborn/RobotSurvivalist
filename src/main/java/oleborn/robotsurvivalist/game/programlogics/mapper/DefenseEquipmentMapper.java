package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.DefenseEquipmentDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.DefenseEquipment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface DefenseEquipmentMapper {

    DefenseEquipment toEntity(DefenseEquipmentDto dto);

    DefenseEquipmentDto toDto(DefenseEquipment entity);
}
