package oleborn.robotsurvivalist.game.gamedictionary.gameactionmessages;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ActionsMessages {

    FIRST_RUN_ROBOT("""
            <code>«Первый запуск робота.</code>» 
            
            <code>«Все системы активны»</code>
            
            Ваш робот:
            Модель: %s
            Описание модели: %s
            Находится в квадрате: %d, %d
            
            Суммарный вес модулей/доступный вес шасси: %d/%d
            Суммарно занятое модулями пространство/доступное пространство на шасси: %d/%d
            Суммарная прочность робота: %d
            Количество топлива/максимальное количество от топливного бака: %d/%d
            
            Модели установленных модулей:
            - Центр управления: %s
            - Антенна связи: %s
            - Двигатель: %s
            - Грузовой отсек: %s
            - Топливный бак: %s
            - Шасси: %s
            
            Количество стандартных разъемов для основного оборудования: %d
            Установлено: %s
                   
            """);

    private final String message;

}
