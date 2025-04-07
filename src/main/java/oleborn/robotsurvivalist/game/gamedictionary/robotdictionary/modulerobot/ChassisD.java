package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.modulerobot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionChassis;

@Getter
@RequiredArgsConstructor
public enum ChassisD {

    DEFAULT_WHEELS_CHASSIS(
            200,
            50,
            500,
            0.2,
            false,
            1,
            0,
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
    private final Integer price;
    private final DescriptionChassis description;



}
