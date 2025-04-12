package oleborn.robotsurvivalist.game.programlogics.service.moduleservice.instance;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.ChassisDto;

import java.util.UUID;

public interface ChassisService {

    ChassisDto setInRobot(String model, UUID idRobot);

}
