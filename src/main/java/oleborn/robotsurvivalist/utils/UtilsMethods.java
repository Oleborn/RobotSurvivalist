package oleborn.robotsurvivalist.utils;

import org.telegram.telegrambots.meta.api.objects.Update;

public class UtilsMethods {

    public static long searchId(Update update) {
        if (update.hasMessage()) {
            return update.getMessage().getFrom().getId();
        } else if (update.hasCallbackQuery()) {
            return update.getCallbackQuery().getFrom().getId();
        }
        return 0;
    }

}
