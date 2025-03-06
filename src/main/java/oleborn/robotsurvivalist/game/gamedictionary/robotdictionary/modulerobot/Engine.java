package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.modulerobot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionEngine;

@Getter
@RequiredArgsConstructor
public enum Engine {

    DEFAULT_ENGINE(40,
            25,
            100,
            0,
            0.2,
            5,
            DescriptionEngine.DEFAULT_ENGINE
    );

    private final Integer mass;
    private final Integer durability;
    private final Integer occupiedCapacity;
    private final Integer price;
    private final Double speed;
    private final Integer fuelConsumption;
    private final DescriptionEngine description;
}
