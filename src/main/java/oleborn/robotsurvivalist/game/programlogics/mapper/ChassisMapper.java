package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.ChassisDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Chassis;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectChassis;
import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface ChassisMapper {

    Chassis toEntity(ChassisDto dto);

    ChassisDto toDto(Chassis entity);

    Chassis addOwner(ProjectChassis chassis, UUID robotId);
}
