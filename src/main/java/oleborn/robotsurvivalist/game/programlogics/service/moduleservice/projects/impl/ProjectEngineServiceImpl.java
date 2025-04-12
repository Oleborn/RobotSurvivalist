package oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.impl;

import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionCommunicationAntenna;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionEngine;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectEngine;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.impl.ParentDependencyService;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.ProjectEngineService;

import java.time.ZonedDateTime;

public class ProjectEngineServiceImpl extends ParentDependencyService implements ProjectEngineService {
    @Override
    public void createDefault() {
        ProjectEngine engine = new ProjectEngine();
        engine.setModel(DescriptionEngine.DEFAULT_ENGINE.getName());
        engine.setDescription(DescriptionEngine.DEFAULT_ENGINE.getDescription());
        engine.setMass(40);
        engine.setDurability(25);
        engine.setOccupiedSpace(100);
        engine.setMainPrice(1000);
        engine.setCreationDate(ZonedDateTime.now());

        engine.setSpeed(1);
        engine.setFuelConsumption(5);

        projectEngineRepository.save(engine);

    }
}
