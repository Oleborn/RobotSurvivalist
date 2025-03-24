package oleborn.robotsurvivalist.game.programlogics.service;

import oleborn.robotsurvivalist.game.programlogics.model.dto.RobotEntityDto;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.List;
import java.util.UUID;


public interface RobotService {

    void createRobot(Update update, RobotEntityDto robotEntityDto);

    List<RobotEntityDto> loadRobotsForOperator(Update update);

    RobotEntityDto findRobotByUUID(UUID uuid);

    void updateRobot(RobotEntityDto robot);

    void deleteRobot(Update update);

    void saveRobot(RobotEntityDto robotEntityDto);

    RobotEntityDto createDefaultRobot(Update update);

}
