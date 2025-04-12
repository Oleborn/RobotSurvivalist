package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.MiningEquipmentDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.MiningEquipment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MiningEquipmentMapper {

    MiningEquipment toEntity(MiningEquipmentDto dto);

    MiningEquipmentDto toDto(MiningEquipment entity);

}
