package oleborn.robotsurvivalist.bot.updatehandler;

import jakarta.annotation.Resource;
import oleborn.robotsurvivalist.bot.outputMethods.OutputsMethods;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.objects.Update;

@Component
public class CallbackQueryHandler implements Handler {

    @Resource
    private OutputsMethods outputsMethods;

    @Override
    public void handleUpdate(Update update) {



    }
}
