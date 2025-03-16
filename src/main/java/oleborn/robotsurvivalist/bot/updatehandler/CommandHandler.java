package oleborn.robotsurvivalist.bot.updatehandler;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import oleborn.robotsurvivalist.bot.outputMethods.InlineKeyboardBuilder;
import oleborn.robotsurvivalist.bot.outputMethods.OutputsMethods;
import oleborn.robotsurvivalist.game.gamedictionary.historygame.CentralHistoryGame;
import oleborn.robotsurvivalist.utils.UtilsMethods;
import oleborn.robotsurvivalist.utils.historydictionary.TextMessages;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@RequiredArgsConstructor
public class CommandHandler implements Handler {

    private final OutputsMethods outputsMethods;

    @Override
    @SneakyThrows
    public void handleUpdate(Update update) {
        if(update.getMessage().getText().equals("/start")) {
            outputsMethods.outputMessage(
                    //нужно проверять есть ли такой игрок в бд
                    UtilsMethods.searchId(update),
                    CentralHistoryGame.START_GAME_HISTORY.getText(),
                    CentralHistoryGame.START_GAME_HISTORY.getKeyboard()
            );
        }
    }
}
