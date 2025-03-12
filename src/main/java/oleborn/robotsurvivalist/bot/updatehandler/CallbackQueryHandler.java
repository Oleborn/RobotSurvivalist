package oleborn.robotsurvivalist.bot.updatehandler;

import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.bot.outputMethods.InlineKeyboardBuilder;
import oleborn.robotsurvivalist.bot.outputMethods.OutputsMethods;
import oleborn.robotsurvivalist.game.gamedictionary.gameactionmessages.ActionsMessages;
import oleborn.robotsurvivalist.game.gamedictionary.historygame.CentralHistoryGame;
import oleborn.robotsurvivalist.game.programlogics.model.dto.OperatorDto;
import oleborn.robotsurvivalist.game.programlogics.model.dto.RobotEntityDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.operator.Operator;
import oleborn.robotsurvivalist.game.programlogics.service.OperatorService;
import oleborn.robotsurvivalist.utils.UtilsMethods;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class CallbackQueryHandler implements Handler {

    private final OutputsMethods outputsMethods;
    private final OperatorService operatorService;

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
            case "start_game" -> {
                OperatorDto operator = operatorService.saveOperator(update);
                RobotEntityDto robot = operator.robots().getFirst();
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        ActionsMessages.FIRST_RUN_ROBOT.getMessage().formatted(
                             robot.nameModel(),
                             robot.descriptionModel(),
                             robot.XCoordinate(),
                             robot.YCoordinate(),
                             robot.sumWeight(),
                             robot.chassis().getSupportedWeight(),
                             robot.sumCapacity(),
                             robot.chassis().getOccupiedCapacity(),
                             robot.sumDurability(),
                                robot.countFuel(),
                                robot.fuelTanks().getFuelCapacity(),
                                robot.controlCenter().name(),
                                robot.antenna().name(),
                                robot.engine().name(),
                                robot.compartment().name(),
                                robot.fuelTanks().name(),
                                robot.chassis().name(),
                                robot.chassis().getCountOfMainCarriages(),
                                robot.mainCarriageModulesList().getFirst()
                        ),
                        new InlineKeyboardBuilder()
                                .addButton("Запустить робота", "start_robot")
                                .build());

            }
        }
    }
}
