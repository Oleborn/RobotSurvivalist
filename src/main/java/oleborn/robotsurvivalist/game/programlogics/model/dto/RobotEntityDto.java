package oleborn.robotsurvivalist.game.programlogics.model.dto;

import lombok.Builder;
import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;

@Builder(toBuilder = true)
public record RobotEntityDto(
        UUID uuid,
        long operatorId,
        String name,
        ZonedDateTime creationDate,
        ZonedDateTime modificationDate,
        int XCoordinate,
        int YCoordinate,
        int sumWeight,
        int sumCapacity,
        int sumDurability,
        int currentFuel,
        int currentDurability,
        int currentMassStorage,
        ControlCenterDto controlCenter,
        CommunicationAntennaDto antenna,
        EngineDto engine,
        CargoCompartmentDto compartment,
        ChassisDto chassis,
        FuelTanksDto fuelTanks,

        List<OffensiveEquipmentDto> offensiveEquipmentList,
        List<AuxiliaryEquipmentDto> auxiliaryEquipmentList,
        List<MiningEquipmentDto> miningEquipmentList,
        List<DefenseEquipmentDto> defenseEquipmentList,

        long cellMapId
) {
}
