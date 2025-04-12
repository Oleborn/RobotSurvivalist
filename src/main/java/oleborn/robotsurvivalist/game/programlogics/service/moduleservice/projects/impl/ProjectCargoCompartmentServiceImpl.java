package oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.impl;

import oleborn.robotsurvivalist.game.gamedictionary.robotdictionary.textrobotdictionary.DescriptionCargoCompartment;
import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectCargoCompartment;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.impl.ParentDependencyService;
import oleborn.robotsurvivalist.game.programlogics.service.moduleservice.projects.ProjectCargoCompartmentService;

import java.time.ZonedDateTime;

public class ProjectCargoCompartmentServiceImpl extends ParentDependencyService implements ProjectCargoCompartmentService {
    @Override
    public void createDefault() {
        ProjectCargoCompartment compartment = new ProjectCargoCompartment();
        compartment.setModel(DescriptionCargoCompartment.DEFAULT_CARGO_COMPARTMENT.getName());
        compartment.setDescription(DescriptionCargoCompartment.DEFAULT_CARGO_COMPARTMENT.getDescription());
        compartment.setMass(20);
        compartment.setDurability(10);
        compartment.setOccupiedSpace(300);
        compartment.setMainPrice(1000);
        compartment.setCreationDate(ZonedDateTime.now());

        compartment.setCapacity(100);

        projectCargoCompartmentRepository.save(compartment);

    }
}
