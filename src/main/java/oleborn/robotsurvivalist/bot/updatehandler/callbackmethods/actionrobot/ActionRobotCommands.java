package oleborn.robotsurvivalist.bot.updatehandler.callbackmethods.actionrobot;

import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.bot.outputMethods.OutputsMethods;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.robotconsole.ConsoleRobot;
import oleborn.robotsurvivalist.game.programlogics.model.dto.RobotEntityDto;
import oleborn.robotsurvivalist.game.programlogics.service.OperatorService;
import oleborn.robotsurvivalist.game.programlogics.service.RobotService;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ActionRobotCommands {

    private final OutputsMethods outputsMethods;
    private final OperatorService operatorService;
    private final RobotService robotService;

    public void robotCommandQBC(Update update, long id) {

        if (update.getCallbackQuery().getData().startsWith("robot_model"))
            choiceRobot(update, id);
    }

    private void choiceRobot(Update update, long id) {

        //robot_model_550e8400-e29b-41d4-a716-446655440000
        String robotModel = update.getCallbackQuery().getData();
        String uuid = robotModel.substring(robotModel.lastIndexOf("_") + 1); // Берём подстроку после последнего "_"
        operatorService.setupActiveRobot(update, UUID.fromString(uuid));
        RobotEntityDto robot = robotService.findRobotByUUID(UUID.fromString(uuid));
        outputsMethods.outputMessage(
                id,
                ConsoleRobot.START_CONSOLE_MSG_1S.getText().formatted(robot.nameModel())
        );

        outputsMethods.outputMessage(
                id,
                ConsoleRobot.CONSOLE_1S_8D.getText().formatted(
                        robot.nameModel(),
                        robot.XCoordinate(), robot.YCoordinate(),
                        robot.currentFuel(), robot.fuelTanks().getFuelCapacity(),
                        robot.currentDurability(), robot.sumDurability(),
                        robot.currentMassStorage(), robot.compartment().getOccupiedCapacity()
                )
        );

    }
}

