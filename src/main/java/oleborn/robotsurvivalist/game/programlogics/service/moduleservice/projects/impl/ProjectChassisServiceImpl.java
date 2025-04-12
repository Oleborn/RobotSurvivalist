package oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.impl;

import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionChassis;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Chassis;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectChassis;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.impl.ParentDependencyService;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.ProjectChassisService;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;

@Service
public class ProjectChassisServiceImpl extends ParentDependencyService implements ProjectChassisService {

    @Override
    public void createDefault() {
        ProjectChassis chassis = new Chassis();
        chassis.setModel(DescriptionChassis.DEFAULT_WHEELS_CHASSIS.getName());
        chassis.setDescription(DescriptionChassis.DEFAULT_WHEELS_CHASSIS.getDescription());
        chassis.setMass(50);
        chassis.setDurability(100);
        chassis.setOccupiedSpace(500);
        chassis.setMainPrice(1000);
        chassis.setCreationDate(ZonedDateTime.now());

        chassis.setSupportedWeight(400);
        chassis.setMaxSpeed(5);
        chassis.setAbilityToFloat(false);
        chassis.setCountOfMiningEquipment(1);
        chassis.setCountOfAuxiliaryEquipment(0);
        chassis.setCountOfDefenseEquipment(0);
        chassis.setCountOfOffensiveEquipment(1);

        projectChassisRepository.save(chassis);
    }
}
