package oleborn.robotsurvivalist.game.gamedictionary.basedictionary.centalcorridor;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import oleborn.robotsurvivalist.bot.outputMethods.InlineKeyboardBuilder;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;

import java.util.concurrent.ThreadLocalRandom;

@Getter
@RequiredArgsConstructor
public enum CentralCorridorDictionary {

    DESCRIPTION_1("Ты в центральном коридоре. Воздух здесь тяжёлый, пропитанный запахом пота, машинного масла и дешёвого пайка. Люди снуют туда-сюда, кто-то торгуется, кто-то кричит, а вдалеке слышен плач ребёнка."),

    DESCRIPTION_2("Ты в центральном коридоре. Здесь никогда не бывает тихо: визг ржавых тележек, бормотание уставших рабочих, детские крики и ссоры на повышенных тонах. На полу валяется мусор, а стены покрыты следами копоти и старых объявлений."),

    DESCRIPTION_3("Ты в центральном коридоре. Над головой мерцает лампа, издавая раздражающее жужжание. Люди двигаются быстрыми, рваными шагами, избегая зрительного контакта. По углам копошатся дети, выискивая что-то ценное в грудах мусора."),

    DESCRIPTION_4("Ты в центральном коридоре. Здесь всегда кто-то есть: усталые добытчики, грязные механики, торговцы с пустыми глазами. Из-за перегородки доносится звук драки, но никому нет дела. Пол устлан грязными тряпками, сквозняк несёт запах ржавчины и старой плесени."),

    DESCRIPTION_5("Ты в центральном коридоре. Глухие удары инструментов издалека, чей-то грубый смех, запах горелого металла и протухшей воды. Здесь жизнь не останавливается ни на секунду, даже если тебе кажется, что она уже давно мертва."),

    DESCRIPTION_6("Ты в центральном коридоре. Лампы под потолком дрожат, отбрасывая длинные, рваные тени. Кто-то проскользнул мимо, сжимая в руках грязный мешок. На стене новые надписи — угрозы, предложения обмена, чьи-то отчаянные молитвы."),

    DESCRIPTION_7("Ты в центральном коридоре. Гул голосов и топот ног заполняют пространство. В воздухе витают запахи машинного масла, дыма и плохо вычищенных отходов. Мимо пробегает мальчишка, прижимая к себе что-то украденное."),

    DESCRIPTION_8("Ты в центральном коридоре. Путь преграждает тележка с металлоломом, рядом старик в грязной форме что-то втолковывает молодому парню. Дети снуют между ног взрослых, ловко уклоняясь от ударов и пинков."),

    DESCRIPTION_9("Ты в центральном коридоре. Здесь всегда людно, но никто не обращает друг на друга внимания. Пол усеян остатками пайков, в углу кто-то кашляет, а из-за угла доносится низкий, опасный шёпот."),

    DESCRIPTION_10("Ты в центральном коридоре. Шум, грязь и запахи свалены здесь в один гниющий комок. Вдалеке двое спорят, торговец размахивает руками, доказывая свою правоту. Дети смеются, проскальзывая между ними — для них это всего лишь ещё один день на базе.");

    private final String text;
    private final InlineKeyboardMarkup buttons = new InlineKeyboardBuilder()
            .addButton("Пройти в свой отсек", "go_to_cabin")
            .nextRow()
            .addButton("Пройти на склад", "go_to_store")
            .nextRow()
            .addButton("Пройти к общей консоли", "go_to_console")
            .nextRow()
            .addButton("Пройти в мастерскую", "go_to_manufacture")
            .nextRow()
            .addButton("Пройти в офис операторов", "go_to_office")
            .nextRow()
            .addButton("Пройти в отсек ученых", "go_to_scientistroom")
            .build();

    private static final CentralCorridorDictionary[] VALUES = CentralCorridorDictionary.values();

    public static String getRandomDictionary() {
        int randomIndex = ThreadLocalRandom.current().nextInt(VALUES.length);
        return VALUES[randomIndex].getText();
    }
}

