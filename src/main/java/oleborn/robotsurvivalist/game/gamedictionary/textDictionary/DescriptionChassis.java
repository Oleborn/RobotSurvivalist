package oleborn.robotsurvivalist.game.gamedictionary.textDictionary;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum DescriptionChassis {

    DEFAULT_WHEELS_CHASSIS("""
            Стандартное колесное шасси начального уровня, из стартового набора любого робота. Ничего не стоит. 
            Позволяет навешивать модули общим весом не более 150 кг. Не плавает.
            """);

    private final String description;

}
