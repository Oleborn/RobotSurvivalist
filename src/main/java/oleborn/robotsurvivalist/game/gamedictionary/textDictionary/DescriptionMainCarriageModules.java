package oleborn.robotsurvivalist.game.gamedictionary.textDictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionMainCarriageModules {

    DEFAULT_MANIPULATOR("""
            Стандартная манипулятор начального уровня, из стартового набора любого робота. Ничего не стоит. 
            Позволяет поднимать не более 3 кг за раз.
            """);

    private final String description;

}
