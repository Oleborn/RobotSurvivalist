package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionAuxiliaryCarriageModules {

    DEFAULT_ANTENNA("""
            Стандартная антенна начального уровня, из стартового набора любого робота. Ничего не стоит. 
            Позволяет управлять робот на расстоянии не превышающем 3 клетки карты.
            """);

    private final String description;

}
