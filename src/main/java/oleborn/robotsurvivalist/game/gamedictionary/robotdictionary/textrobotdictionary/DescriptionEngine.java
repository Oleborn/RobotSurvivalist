package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionEngine {

    DEFAULT_ENGINE(
            "Default",
            """
            Стандартная двигатель начального уровня, из стартового набора любого робота. Ничего не стоит. 
            Позволяет преодолеть клетку карты за 5 минут.
            
            Характеристики:
                - Масса - 40кг
                - Прочность - 25 ед
                - Занимаемый объем - 100 ед
                - Скорость - 0.2 клетки в минуту
                - Расход топлива - 5 ед на клетку.
            """);

    private final String name;
    private final String description;

}
