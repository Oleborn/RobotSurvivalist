package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionChassis {

    DEFAULT_WHEELS_CHASSIS(
            "Default",
           """
           Стандартное колесное шасси начального уровня, из стартового набора любого робота. Ничего не стоит. 
            
           Характеристики:
                - Максимально поддерживаемый вес - 200 кг
                - Прочность - 50 ед
                - Занимаемый объем - 400 ед
                - Максимально возможная скорость - 0.2 клетки в минуту
                - Способность держаться на воде - нет
                - Количество основных лафетов - 1
                - Количество вспомогательных лафетов - 0
            """);

    private final String name;
    private final String description;

}
