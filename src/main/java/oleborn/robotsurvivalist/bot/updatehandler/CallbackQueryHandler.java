package oleborn.robotsurvivalist.bot.updatehandler;

import jakarta.annotation.Resource;
import oleborn.robotsurvivalist.bot.outputMethods.InlineKeyboardBuilder;
import oleborn.robotsurvivalist.bot.outputMethods.OutputsMethods;
import oleborn.robotsurvivalist.game.gamedictionary.historygame.CentralHistoryGame;
import oleborn.robotsurvivalist.utils.UtilsMethods;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class CallbackQueryHandler implements Handler {

    @Resource
    private OutputsMethods outputsMethods;

    @Override
    public void handleUpdate(Update update) {

        switch (update.getCallbackQuery().getData()) {
            case "next_history_1" -> {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.BRIEFING_GAME_START1.getText(),
                        new InlineKeyboardBuilder()
                                .addButton("Дальше", "next_history_2")
                                .build());
            }
            case "next_history_2" -> {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.BRIEFING_GAME_START2.getText(),
                        new InlineKeyboardBuilder()
                                .addButton("Дальше", "next_history_3")
                                .build());
            }
            case "next_history_3" -> {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.BRIEFING_GAME_START3.getText(),
                        new InlineKeyboardBuilder()
                                .addButton("Дальше", "next_history_4")
                                .build());
            }
            case "next_history_4" -> {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.BRIEFING_GAME_START4.getText(),
                        new InlineKeyboardBuilder()
                                .addButton("Дальше", "next_history_5")
                                .build());
            }
            case "next_history_5" -> {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.BRIEFING_GAME_START5.getText(),
                        new InlineKeyboardBuilder()
                                .addButton("Запустить робота", "start_robot")
                                .build());
            }
            case "start_robot" -> {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.ROBOT_STARTED.getText(),
                        new InlineKeyboardBuilder()
                                .addButton("Начать игру", "start_game")
                                .build());
            }
        }
    }
}
