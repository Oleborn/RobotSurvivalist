package oleborn.robotsurvivalist.bot.updatehandler.callbackmethods;

import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.bot.outputMethods.OutputsMethods;
import oleborn.robotsurvivalist.bot.updatehandler.Handler;
import oleborn.robotsurvivalist.bot.updatehandler.callbackmethods.actionrobot.ActionRobotCommands;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.console.CentralConsoleDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.manufacture.WorkshopDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.office.OperatorsOfficeDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.scientistsroom.ScientistsRoomDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.store.WarehouseDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.cabins.PersonalQuartersDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.cabins.RobotConnectionTerminalDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.centalcorridor.CentralCorridorDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.historygame.CentralHistoryGame;
import oleborn.robotsurvivalist.game.gamedictionary.operatordictionary.OperatorMoveStatus;
import oleborn.robotsurvivalist.game.programlogics.service.OperatorService;
import oleborn.robotsurvivalist.utils.UtilsMethods;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;


@Component
@RequiredArgsConstructor
public class CallbackQueryHandler implements Handler {

    private final OutputsMethods outputsMethods;
    private final OperatorService operatorService;
    private final ActionRobotCommands actionRobotCommands;

    @Override
    public void handleUpdate(Update update) {

        long id = UtilsMethods.searchId(update);

        if (update.getCallbackQuery().getData().startsWith("go_to")) {
            processingOfMoveInBase(update, id);
        }
        if (update.getCallbackQuery().getData().startsWith("robot")) {
            actionRobotCommands.robotCommandQBC(update, id);
        }


        switch (update.getCallbackQuery().getData()) {
            case "next_history_1" -> {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.BRIEFING_GAME_START1.getText(),
                        CentralHistoryGame.BRIEFING_GAME_START1.getKeyboard());
            }
            case "next_history_2" -> {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.BRIEFING_GAME_START2.getText(),
                        CentralHistoryGame.BRIEFING_GAME_START2.getKeyboard());
            }
            case "next_history_3" -> {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.BRIEFING_GAME_START3.getText(),
                        CentralHistoryGame.BRIEFING_GAME_START3.getKeyboard());
            }
            case "next_history_4" -> {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.BRIEFING_GAME_START4.getText(),
                        CentralHistoryGame.BRIEFING_GAME_START4.getKeyboard());
            }
            case "next_history_5" -> {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.BRIEFING_GAME_START5.getText(),
                        CentralHistoryGame.BRIEFING_GAME_START5.getKeyboard());

                operatorService.saveOperator(update);
            }


//            case "start_robot" -> {
//                outputsMethods.outputMessage(
//                        UtilsMethods.searchId(update),
//                        CentralHistoryGame.ROBOT_FIRST_STARTED.getText(),
//                        CentralHistoryGame.ROBOT_FIRST_STARTED.getKeyboard());
//            }
//            case "start_game" -> {
//                OperatorDto operator = operatorService.saveOperator(update);
//                RobotEntityDto robot = operator.robots().getFirst();
//                outputsMethods.outputMessage(
//                        UtilsMethods.searchId(update),
//                        ActionsMessages.FIRST_RUN_ROBOT.getMessage().formatted(
//                             robot.nameModel(),
//                             robot.descriptionModel(),
//                             robot.XCoordinate(),
//                             robot.YCoordinate(),
//                             robot.sumWeight(),
//                             robot.chassis().getSupportedWeight(),
//                             robot.sumCapacity(),
//                             robot.chassis().getOccupiedCapacity(),
//                             robot.sumDurability(),
//                                robot.currentFuel(),
//                                robot.fuelTanks().getFuelCapacity(),
//                                robot.controlCenter().name(),
//                                robot.antenna().name(),
//                                robot.engine().name(),
//                                robot.compartment().name(),
//                                robot.fuelTanks().name(),
//                                robot.chassis().name(),
//                                robot.chassis().getCountOfMainCarriages(),
//                                robot.mainCarriageModulesList().getFirst()
//                        ),
//                        new ReplyKeyboardBuilder()
//                                .addButton(" ").addButton("пойти на север").addButton(" ")
//                                .nextRow()
//                                .addButton("Пойти на запад").addButton(" ").addButton("Пойти на восток")
//                                .nextRow()
//                                .addButton(" ").addButton("пойти на юг").addButton(" ")
//                                .build());
//            }
        }
    }

    private void processingOfMoveInBase(Update update, long id) {
        switch (update.getCallbackQuery().getData()) {
            case "go_to_corridor" -> {
                outputsMethods.outputMessage(
                        id,
                        CentralCorridorDictionary.getRandomDictionary(),
                        CentralCorridorDictionary.DESCRIPTION_1.getButtons()
                );
                operatorService.setupStatus(update, OperatorMoveStatus.IN_CENTRAL_CORRIDOR);
            }
            case "go_to_cabin" -> {
                outputsMethods.outputMessage(
                        id,
                        PersonalQuartersDictionary.getRandomDictionary(),
                        PersonalQuartersDictionary.DESCRIPTION_1.getButtons()
                );
                operatorService.setupStatus(update, OperatorMoveStatus.IN_PERSONAL_QUARTERS);
            }
            case "go_to_store" -> {
                outputsMethods.outputMessage(
                        id,
                        WarehouseDictionary.getRandomDictionary(),
                        WarehouseDictionary.DESCRIPTION_1.getButtons()
                );
                operatorService.setupStatus(update, OperatorMoveStatus.IN_STORE);
            }
            case "go_to_console" -> {
                outputsMethods.outputMessage(
                        id,
                        CentralConsoleDictionary.getRandomDictionary(),
                        CentralConsoleDictionary.DESCRIPTION_1.getButtons()
                );
                operatorService.setupStatus(update, OperatorMoveStatus.IN_CONSOLE);
            }
            case "go_to_manufacture" -> {
                outputsMethods.outputMessage(
                        id,
                        WorkshopDictionary.getRandomDictionary(),
                        WorkshopDictionary.DESCRIPTION_1.getButtons()
                );
                operatorService.setupStatus(update, OperatorMoveStatus.IN_MANUFACTURE);
            }
            case "go_to_office" -> {
                outputsMethods.outputMessage(
                        id,
                        OperatorsOfficeDictionary.getRandomDictionary(),
                        OperatorsOfficeDictionary.DESCRIPTION_1.getButtons()
                );
                operatorService.setupStatus(update, OperatorMoveStatus.IN_OFFICE);
            }
            case "go_to_scientistroom" -> {
                outputsMethods.outputMessage(
                        id,
                        ScientistsRoomDictionary.getRandomDictionary(),
                        ScientistsRoomDictionary.DESCRIPTION_1.getButtons()
                );
                operatorService.setupStatus(update, OperatorMoveStatus.IN_SCIENTIST);
            }
            case "go_to_terminal" -> {
                outputsMethods.outputMessage(
                        id,
                        RobotConnectionTerminalDictionary.getRandomDictionary().formatted(RobotConnectionTerminalDictionary.commandGetRobots),
                        RobotConnectionTerminalDictionary.DESCRIPTION_1.getButtons()
                );
                operatorService.setupStatus(update, OperatorMoveStatus.IN_TERMINAL);
            }
        }
    }
}
