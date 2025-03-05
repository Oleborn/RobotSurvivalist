package oleborn.robotsurvivalist.game.gamedictionary.textDictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionControlCenter {

    DEFAULT_CONTROL_CENTER("""
            Стандартный модуль управления начального уровня, из стартового набора любого робота. Ничего не стоит. 
            Имеет встроенную память на 3 команды.            
            """);

    private final String description;

}
