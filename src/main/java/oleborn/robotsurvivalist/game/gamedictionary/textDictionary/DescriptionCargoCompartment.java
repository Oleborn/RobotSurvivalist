package oleborn.robotsurvivalist.game.gamedictionary.textDictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionCargoCompartment {

    DEFAULT_CARGO_COMPARTMENT("""
            Стандартный грузовой отсек начального уровня, из стартового набора любого робота. Ничего не стоит. 
            Имеет 100 единиц объема для перевозки.
            """);

    private final String description;

}
