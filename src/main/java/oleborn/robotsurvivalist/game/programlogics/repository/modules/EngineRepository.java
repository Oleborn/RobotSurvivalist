package oleborn.robotsurvivalist.game.programlogics.repository.modules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Engine;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EngineRepository extends JpaRepository<Engine, UUID> {
}
