package oleborn.robotsurvivalist.game.gamedictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.textDictionary.DescriptionEngine;

@Getter
@RequiredArgsConstructor
public enum EngineModule {

    DEFAULT_ENGINE(40,
            25,
            100,
            0.2,
            DescriptionEngine.DEFAULT_ENGINE
    );

    private final Integer mass;
    private final Integer durability;
    private final Integer occupiedCapacity;
    private final Double speed;
    private final DescriptionEngine description;
}
