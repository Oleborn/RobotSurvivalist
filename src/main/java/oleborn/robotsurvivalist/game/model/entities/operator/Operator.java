package oleborn.robotsurvivalist.game.model.entities.operator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oleborn.robotsurvivalist.game.gamedictionary.Technology;
import oleborn.robotsurvivalist.game.model.entities.robot.RobotEntity;

import java.time.ZonedDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Operator {

    //Статические данные
    private Long id;
    private ZonedDateTime createdDateTime;

    //технические данные
    private ZonedDateTime modificationDate;

    //изменяемые данные
    private Long countMoney;
    private List<RobotEntity> robots;
    private List<Technology> researchTechnologies;
    private int reputation;



}
