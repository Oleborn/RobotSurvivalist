package oleborn.robotsurvivalist.bot.updatehandler;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import oleborn.robotsurvivalist.bot.outputMethods.OutputsMethods;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.console.CentralConsoleDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.manufacture.WorkshopDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.office.OperatorsOfficeDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.scientistsroom.ScientistsRoomDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.admroom.store.WarehouseDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.cabins.PersonalQuartersDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.cabins.RobotConnectionTerminalDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.basedictionary.centalcorridor.CentralCorridorDictionary;
import oleborn.robotsurvivalist.game.gamedictionary.historygame.CentralHistoryGame;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.robotconsole.ConsoleRobot;
import oleborn.robotsurvivalist.game.programlogics.model.dto.RobotEntityDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.operator.Operator;
import oleborn.robotsurvivalist.game.programlogics.service.OperatorService;
import oleborn.robotsurvivalist.game.programlogics.service.RobotService;
import oleborn.robotsurvivalist.utils.UtilsMethods;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CommandHandler implements Handler {

    private final OutputsMethods outputsMethods;
    private final OperatorService operatorService;
    private final RobotService robotService;

    @Override
    @SneakyThrows
    public void handleUpdate(Update update) {
        if (update.getMessage().getText().equals("/start")) {
            Optional<Operator> byId = operatorService.findById(update);

            if (byId.isEmpty()) {
                outputsMethods.outputMessage(
                        UtilsMethods.searchId(update),
                        CentralHistoryGame.START_GAME_HISTORY.getText(),
                        CentralHistoryGame.START_GAME_HISTORY.getKeyboard()
                );
            }else {
                returnMessageToPosition(byId.get());
            }
        }

        if (update.getMessage().getText().equals("/my_robots")) {
            if (robotService.loadRobotsForOperator(update).isEmpty()) {
                robotService.saveDefaultRobot(update);
            }

            List<RobotEntityDto> robotEntityDtosAfter = robotService.loadRobotsForOperator(update);

            outputsMethods.outputMessage(
                    UtilsMethods.searchId(update),
                    ConsoleRobot.CHOOSING_A_ROBOT_1D.getText().formatted(robotEntityDtosAfter.size()),
                    outputsMethods.createButtonInColumnToRobotEntityDto(
                            robotEntityDtosAfter,
                            "Робот модели: ",
                            "robot_model"
                    )
            );
        }
    }

    private void returnMessageToPosition(Operator operator) {
        switch (operator.getMoveStatus()) {
            case IN_TERMINAL -> {
                outputsMethods.outputMessage(
                        operator.getId(),
                        RobotConnectionTerminalDictionary.getRandomDictionary().formatted(RobotConnectionTerminalDictionary.commandGetRobots),
                        RobotConnectionTerminalDictionary.DESCRIPTION_1.getButtons()
                );
            }
            case IN_CONSOLE -> {
                outputsMethods.outputMessage(
                        operator.getId(),
                        CentralConsoleDictionary.getRandomDictionary(),
                        CentralConsoleDictionary.DESCRIPTION_1.getButtons()
                );
            }
            case IN_OFFICE -> {
                outputsMethods.outputMessage(
                        operator.getId(),
                        OperatorsOfficeDictionary.getRandomDictionary(),
                        OperatorsOfficeDictionary.DESCRIPTION_1.getButtons()
                );
            }
            case IN_STORE -> {
                outputsMethods.outputMessage(
                        operator.getId(),
                        WarehouseDictionary.getRandomDictionary(),
                        WarehouseDictionary.DESCRIPTION_1.getButtons()
                );
            }
            case IN_WORKSHOP -> {}
            case IN_SCIENTIST -> {
                outputsMethods.outputMessage(
                        operator.getId(),
                        ScientistsRoomDictionary.getRandomDictionary(),
                        ScientistsRoomDictionary.DESCRIPTION_1.getButtons()
                );
            }
            case IN_WAREHOUSE -> {}
            case IN_MANUFACTURE -> {
                outputsMethods.outputMessage(
                        operator.getId(),
                        WorkshopDictionary.getRandomDictionary(),
                        WorkshopDictionary.DESCRIPTION_1.getButtons()
                );
            }
            case IN_CENTRAL_CORRIDOR -> {
                outputsMethods.outputMessage(
                        operator.getId(),
                        CentralCorridorDictionary.getRandomDictionary(),
                        CentralCorridorDictionary.DESCRIPTION_1.getButtons()
                );
            }
            case IN_PERSONAL_QUARTERS -> {
                outputsMethods.outputMessage(
                        operator.getId(),
                        PersonalQuartersDictionary.getRandomDictionary(),
                        PersonalQuartersDictionary.DESCRIPTION_1.getButtons()
                );
            }
        }

    }
}
