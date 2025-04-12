package oleborn.robotsurvivalist.game.programlogics.service.moduleservice.instance.impl;

import oleborn.robotsurvivalist.game.programlogics.model.dto.innerdto.ChassisDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Chassis;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectChassis;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.impl.ParentDependencyService;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.instance.ChassisService;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ChassisServiceImpl extends ParentDependencyService implements ChassisService {

    @Override
    public ChassisDto setInRobot(String model, UUID idRobot) {
        ProjectChassis projectChassis = projectChassisRepository.findByModel(model).orElseThrow(); //TODO добавить ошибки
        Chassis chassis = chassisMapper.addOwner(projectChassis, idRobot);
        Chassis saved = chassisRepository.save(chassis);

        return chassisMapper.toDto(saved);
    }
}
