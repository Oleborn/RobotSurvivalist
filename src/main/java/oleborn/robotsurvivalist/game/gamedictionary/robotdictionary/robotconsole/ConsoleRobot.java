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
            
            Выберите к которому хотите подключиться:
            """),

    START_CONSOLE_MSG_1S("""
            <code>Добро пожаловать в панель управления v0.1!
            
            Связь с роботом модели %s настроена.</code>
            """),

    CONSOLE_1S_8D("""
            <code>Общая информация о роботе:</code>
            
            🤖 <b>Модель:</b> %s
            📍 <b>Местонахождение:</b> сектор [ %d - %d ]
            ⚡️ <b>Топливо:</b> [ %d / %d ]
            🛠 <b>Прочность:</b>  [ %d / %d ]
            📦 <b>Груз:</b>  [ %d / %d ]
            """),

    CONSOLE_COMMANDS("""
            ----------------------------------------
            <code>Доступны команды:</code>
            - Просканировать местность - /scanning
            
            ----------------------------------------
            <code>Направление движения:</code>
            """);

    private final String text;
    private final InlineKeyboardMarkup buttons = new InlineKeyboardBuilder()
            .addButton("Получить информацию о роботах", "robot_connect")
            .nextRow()
            .addButton("Выйти в общий коридор", "go_to_corridor")
            .build();

    public static InlineKeyboardMarkup createCommandToMoved(int x, int y) {
        return new InlineKeyboardBuilder()
                .addButton("↖️", "go").addButton("⬆", "go").addButton("↗️", "go")
                .nextRow()
                .addButton("⬅", "go").addButton("\uD83D\uDC63", "123").addButton("➡", "go")
                .nextRow()
                .addButton("↙️", "go").addButton("⬇", "go").addButton("↘️", "go")
                .build();
    }
}
