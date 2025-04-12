package oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.impl;

import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionCommunicationAntenna;
import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionControlCenter;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectControlCenter;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.impl.ParentDependencyService;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.ProjectControlCenterService;

import java.time.ZonedDateTime;

public class ProjectControlCenterServiceImpl extends ParentDependencyService implements ProjectControlCenterService {
    @Override
    public void createDefault() {
        ProjectControlCenter controlCenter = new ProjectControlCenter();
        controlCenter.setModel(DescriptionControlCenter.DEFAULT_CONTROL_CENTER.getName());
        controlCenter.setDescription(DescriptionControlCenter.DEFAULT_CONTROL_CENTER.getDescription());
        controlCenter.setMass(20);
        controlCenter.setDurability(10);
        controlCenter.setOccupiedSpace(20);
        controlCenter.setMainPrice(1000);
        controlCenter.setCreationDate(ZonedDateTime.now());

        controlCenter.setCountOfWrittenCommands(3);

        projectControlCenterRepository.save(controlCenter);

    }
}
