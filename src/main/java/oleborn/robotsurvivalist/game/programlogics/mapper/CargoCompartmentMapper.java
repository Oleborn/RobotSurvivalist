package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.CargoCompartmentDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.AuxiliaryEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.CargoCompartment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectAuxiliaryEquipment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectCargoCompartment;
import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface CargoCompartmentMapper {

    CargoCompartment toEntity(CargoCompartmentDto dto);

    CargoCompartmentDto toDto(CargoCompartment entity);

    CargoCompartment addOwner(ProjectCargoCompartment compartment, UUID robotId);
}
