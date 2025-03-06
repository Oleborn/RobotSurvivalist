package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.modulerobot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionControlCenter;

@Getter
@RequiredArgsConstructor
public enum ControlCenter {

    DEFAULT(20,
            10,
            20,
            0,
            3,
            DescriptionControlCenter.DEFAULT_CONTROL_CENTER
    );

    private final Integer mass;
    private final Integer durability;
    private final Integer occupiedCapacity;
    private final Integer price;
    private final Integer countOfWrittenCommands;
    private final DescriptionControlCenter description;


}
