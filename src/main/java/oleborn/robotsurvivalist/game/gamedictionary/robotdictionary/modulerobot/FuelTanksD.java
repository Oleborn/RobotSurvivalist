package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.modulerobot;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionFuelTanks;

@Getter
@RequiredArgsConstructor
public enum FuelTanksD {

    DEFAULT_FUEL_TANKS(20,
            50,
            50,
            50,
            0,
            DescriptionFuelTanks.DEFAULT_FUEL_TANKS
    );

    private final Integer massWithoutFuel;
    private final Integer fuelCapacity;
    private final Integer durability;
    private final Integer occupiedCapacity;
    private final Integer price;
    private final DescriptionFuelTanks description;

}
