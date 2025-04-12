package oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.impl;

import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionCommunicationAntenna;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectCommunicationAntenna;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.impl.ParentDependencyService;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.ProjectCommunicationAntennaService;

import java.time.ZonedDateTime;

public class ProjectCommunicationAntennaServiceImpl extends ParentDependencyService implements ProjectCommunicationAntennaService {

    @Override
    public void createDefault() {
        ProjectCommunicationAntenna antenna = new ProjectCommunicationAntenna();
        antenna.setModel(DescriptionCommunicationAntenna.DEFAULT_ANTENNA.getName());
        antenna.setDescription(DescriptionCommunicationAntenna.DEFAULT_ANTENNA.getDescription());
        antenna.setMass(10);
        antenna.setDurability(10);
        antenna.setOccupiedSpace(10);
        antenna.setMainPrice(1000);
        antenna.setCreationDate(ZonedDateTime.now());

        antenna.setCommunicationRange(3);

        projectCommunicationAntennaRepository.save(antenna);
    }
}
