package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionCommunicationAntenna {

    DEFAULT_ANTENNA("""
            Стандартная антенна начального уровня, из стартового набора любого робота. Ничего не стоит. 
            
            Характеристики:
                - Масса - 10кг
                - Прочность - 10 ед
                - Занимаемый объем - 10 ед
                - Дальность связи - 3 клетки
            """);

    private final String description;

}
