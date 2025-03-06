package oleborn.robotsurvivalist.bot.updatehandler;

import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.utils.historydictionary.TextMessages;
import oleborn.robotsurvivalist.utils.UtilsMethods;
import oleborn.robotsurvivalist.bot.outputMethods.OutputsMethods;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;


@Component
@RequiredArgsConstructor
public class MessagesHandler implements Handler {

    private final OutputsMethods outputsMethods;
    private final CommandHandler commandHandler;

    @Override
    public void handleUpdate(Update update) {
        if (update.getMessage().getText().startsWith("/")) {
            commandHandler.handleUpdate(update);
        } else {
            outputsMethods.outputMessage(
                    UtilsMethods.searchId(update),
                    TextMessages.IN_CONSOLE_TEXT.getText()
            );
        }
    }
}
