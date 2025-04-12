package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.ChassisDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Chassis;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChassisMapper {

    Chassis toEntity(ChassisDto dto);

    ChassisDto toDto(Chassis entity);
}
