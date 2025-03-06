package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.modulerobot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionMainCarriageModules;

@Getter
@RequiredArgsConstructor
public enum MainCarriageModules {

    DEFAULT_MANIPULATOR(
            5,
            10,
            20,
            3,
            3,
            DescriptionMainCarriageModules.DEFAULT_MANIPULATOR
    );

    private final Integer mass;
    private final Integer durability;
    private final Integer occupiedCapacity;
    private final Integer maxLiftWeight;
    private final Integer damage;
    private final DescriptionMainCarriageModules description;

}
