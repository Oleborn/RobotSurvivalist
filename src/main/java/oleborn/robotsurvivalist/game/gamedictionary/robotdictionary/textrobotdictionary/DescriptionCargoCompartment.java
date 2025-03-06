package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionCargoCompartment {

    DEFAULT_CARGO_COMPARTMENT("""
            Стандартный грузовой отсек начального уровня, из стартового набора любого робота. Ничего не стоит. 

            Характеристики:
                - Масса без груза - 10 кг
                - Максимальная масса с грузом - 100 кг
                - Прочность - 10 ед
                - Занимаемый объем - 300 ед
                - Вместимость - 100 единиц объема
            """);

    private final String description;

}
