package oleborn.robotsurvivalist.game.programlogics.repository.projectsmodules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectCargoCompartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectCargoCompartmentRepository extends JpaRepository<ProjectCargoCompartment, UUID> {
}
