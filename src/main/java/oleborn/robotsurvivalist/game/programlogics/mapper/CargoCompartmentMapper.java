package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.CargoCompartmentDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.CargoCompartment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CargoCompartmentMapper {

    CargoCompartment toEntity(CargoCompartmentDto dto);

    CargoCompartmentDto toDto(CargoCompartment entity);
}
