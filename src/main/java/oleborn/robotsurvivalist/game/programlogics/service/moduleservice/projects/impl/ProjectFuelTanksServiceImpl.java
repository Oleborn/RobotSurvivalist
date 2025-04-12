package oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.impl;

import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionFuelTanks;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectFuelTanks;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.impl.ParentDependencyService;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.ProjectFuelTanksService;

import java.time.ZonedDateTime;

public class ProjectFuelTanksServiceImpl extends ParentDependencyService implements ProjectFuelTanksService {
    @Override
    public void createDefault() {
        ProjectFuelTanks fuelTanks = new ProjectFuelTanks();
        fuelTanks.setModel(DescriptionFuelTanks.DEFAULT_FUEL_TANKS.getName());
        fuelTanks.setDescription(DescriptionFuelTanks.DEFAULT_FUEL_TANKS.getDescription());
        fuelTanks.setMass(20);
        fuelTanks.setDurability(50);
        fuelTanks.setOccupiedSpace(50);
        fuelTanks.setMainPrice(1000);
        fuelTanks.setCreationDate(ZonedDateTime.now());

        fuelTanks.setFuelCapacity(50);

        projectFuelTanksRepository.save(fuelTanks);

    }
}
