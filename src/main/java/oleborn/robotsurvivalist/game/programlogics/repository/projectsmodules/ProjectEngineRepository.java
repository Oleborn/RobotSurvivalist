package oleborn.robotsurvivalist.game.programlogics.repository.projectsmodules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules.ProjectEngine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjectEngineRepository extends JpaRepository<ProjectEngine, UUID> {
}
