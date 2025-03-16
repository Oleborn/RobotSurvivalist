package oleborn.robotsurvivalist.game.programlogics.model.dto;

import lombok.Builder;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.modulerobot.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Builder
public record RobotEntityDto(
        UUID uuid,
        long operatorId,
        String nameModel,
        String descriptionModel,
        ZonedDateTime creationDate,
        ZonedDateTime modificationDate,
        int XCoordinate,
        int YCoordinate,
        int sumWeight,
        int sumCapacity,
        int sumDurability,
        int countFuel,
        ControlCenter controlCenter,
        CommunicationAntenna antenna,
        Engine engine,
        CargoCompartment compartment,
        Chassis chassis,
        FuelTanks fuelTanks,
        List<MainCarriageModules> mainCarriageModulesList,
        List<AuxiliaryCarriageModules> auxiliaryCarriageModulesList,
        long cellMapId
) {
}
