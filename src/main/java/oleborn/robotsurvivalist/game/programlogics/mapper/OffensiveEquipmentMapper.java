package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.OffensiveEquipmentDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.OffensiveEquipment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OffensiveEquipmentMapper {

    OffensiveEquipment toEntity(OffensiveEquipmentDto dto);

    OffensiveEquipmentDto toDto(OffensiveEquipment entity);

}
