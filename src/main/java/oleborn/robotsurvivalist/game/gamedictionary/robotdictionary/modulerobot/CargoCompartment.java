package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.modulerobot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionCargoCompartment;

@Getter
@RequiredArgsConstructor
public enum CargoCompartment {

    DEFAULT(10,
            100,
            10,
            300,
            100,
            0,
            DescriptionCargoCompartment.DEFAULT_CARGO_COMPARTMENT
    );

    private final Integer weightWithoutLoad;
    private final Integer maximumLadenWeight;
    private final Integer durability;
    private final Integer occupiedCapacity;
    private final Integer capacity;
    private final Integer price;
    private final DescriptionCargoCompartment description;

}
