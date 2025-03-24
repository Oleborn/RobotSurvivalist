package oleborn.robotsurvivalist.bot.updatehandler.callbackmethods.actionrobot;

import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.bot.outputMethods.OutputsMethods;
import oleborn.robotsurvivalist.game.programlogics.service.OperatorService;
import oleborn.robotsurvivalist.game.programlogics.service.RobotServiceImpl;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
@RequiredArgsConstructor
public class ActionRobotCommands {

    private final OutputsMethods outputsMethods;
    private final OperatorService operatorService;
    private final RobotServiceImpl robotService;

    public void robotCommand(Update update, long id) {
        switch (update.getCallbackQuery().getData()) {
            case "robot_connect"->{

            }


        }
    }
}
