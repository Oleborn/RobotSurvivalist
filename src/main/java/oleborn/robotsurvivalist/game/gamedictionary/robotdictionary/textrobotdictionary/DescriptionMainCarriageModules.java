package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionMainCarriageModules {

    DEFAULT_MANIPULATOR("""
            Стандартная манипулятор начального уровня, из стартового набора любого робота. Ничего не стоит. 
            
            Характеристики:
                - Масса - 5кг
                - Прочность - 10 ед
                - Занимаемый объем - 20 ед
                - Максимально поднимаемый вес объекта - 3 кг
                - Наносимый урон, при использовании как оружие - 3
            """);

    private final String description;

}
