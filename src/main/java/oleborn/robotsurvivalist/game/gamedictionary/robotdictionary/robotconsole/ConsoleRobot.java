package oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.robotconsole;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.bot.outputMethods.InlineKeyboardBuilder;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

@Getter
@RequiredArgsConstructor
public enum ConsoleRobot {

    CHOOSING_A_ROBOT_1D("""
            У вас в наличии %d робот(а/ов).
            
            Выберите к которому хотите подключиться.
            """),

    START_CONSOLE_MSG_1S("""
            Добро пожаловать в панель управления v0.1!
            
            Связь с роботом модели %s настроена и стабильна.
            """),

    CONSOLE_1S_8D("""
            Общая информация о роботе:
            
            🤖 Модель: %s
            📍 Местонахождение: квадрат [ %d / %d ]
            ⚡️ Топливо: [ %d / %d ]
            🛠 Прочность:  [ %d / %d ]
            📦 Груз:  [ %d / %d ]
            """);

    private final String text;
    private final InlineKeyboardMarkup buttons = new InlineKeyboardBuilder()
            .addButton("Получить информацию о роботах", "robot_connect")
            .nextRow()
            .addButton("Выйти в общий коридор", "go_to_corridor")
            .build();

}
