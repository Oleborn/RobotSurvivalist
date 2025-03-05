package oleborn.robotsurvivalist.game.gamedictionary.textDictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionEngine {

    DEFAULT_ENGINE("""
            Стандартная двигатель начального уровня, из стартового набора любого робота. Ничего не стоит. 
            Позволяет преодолеть клетку карты за 5 минут.
            
            Характеристики:
            - Масса - %n кг.
            - Прочность - %n ед.
            - Занимаемый объем - %n ед.
            - Скорость - %d клетки в минуту.
            """);

    private final String description;

}
