package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.FuelTanksDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Engine;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.FuelTanks;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectEngine;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectFuelTanks;
import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface FuelTanksMapper {
    FuelTanks toEntity(FuelTanksDto dto);

    FuelTanksDto toDto(FuelTanks entity);

    FuelTanks addOwner(ProjectFuelTanks projectFuelTanks, UUID robotId);

}
