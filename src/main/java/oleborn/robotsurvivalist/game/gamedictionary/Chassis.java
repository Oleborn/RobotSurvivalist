package oleborn.robotsurvivalist.game.gamedictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.textDictionary.DescriptionChassis;

import java.util.List;

@Getter
@RequiredArgsConstructor
public enum Chassis {

    DEFAULT_WHEELS_CHASSIS(
            150,
            50,
            400,
            0.2,
            false,
            1,
            0,
            DescriptionChassis.DEFAULT_WHEELS_CHASSIS
    );

    private final Integer supportedWeight;
    private final Integer durability;
    private final Integer occupiedCapacity;
    private final Double maxSpeed;
    private final Boolean abilityToFloat;
    private final Integer countOfMainCarriages;
    private final Integer countOfAuxiliaryCarriages;
    private final DescriptionChassis description;



}
