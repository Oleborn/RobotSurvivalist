package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.FuelTanksDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.FuelTanks;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FuelTanksMapper {
    FuelTanks toEntity(FuelTanksDto dto);

    FuelTanksDto toDto(FuelTanks entity);

}
