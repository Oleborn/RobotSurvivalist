package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.robotconsole;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ConsoleRobot {

    CONSOLE("""
            🤖 Робот: %s
            📍 Местоположение: %s
            ⚡️ Топливо: 
            🛠 Прочность:  
            📦 Груз:  
            """);

    private final String text;

}
