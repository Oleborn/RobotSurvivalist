package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionFuelTanks {

    DEFAULT_FUEL_TANKS(
            "Default",
            """
            Стандартная модель баков для топлива начального уровня, из стартового набора любого робота. Ничего не стоит. 
            
            Характеристики:
                - Масса без топлива - 20 кг
                - Максимальная вместимость топлива -  50 ед.
                - Прочность - 50 ед
                - Занимаемый объем - 50 ед
            """);

    private final String name;
    private final String description;

}
