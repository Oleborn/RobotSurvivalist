package oleborn.robotsurvivalist.bot;

import jakarta.annotation.Resource;
import oleborn.robotsurvivalist.bot.updatehandler.UpdateHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

@Configuration
public class Bot extends TelegramLongPollingBot {


    @Value("${taskbot.name-bot}")
    private String nameBot;

    @Value("${taskbot.bot-token}")
    private String botToken;

    @Resource
    @Lazy
    private UpdateHandler updateHandler;


    @Override
    public String getBotUsername() {
        return nameBot;
    }

    @Override
    public String getBotToken() {
        return botToken;
    }

    @Override
    public void onUpdateReceived(Update update) {

        updateHandler.handler(update);

    }

}
