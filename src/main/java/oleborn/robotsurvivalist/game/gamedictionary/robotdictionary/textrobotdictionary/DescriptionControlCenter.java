package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionControlCenter {

    DEFAULT_CONTROL_CENTER(
            "Default",
            """
            Стандартный модуль управления начального уровня, из стартового набора любого робота. Ничего не стоит. 
            
            Характеристики:
                - Масса - 20кг
                - Прочность - 10 ед
                - Занимаемый объем - 20 ед
                - Объем записываемых команд - 1 
            """);

    private final String name;
    private final String description;

}
