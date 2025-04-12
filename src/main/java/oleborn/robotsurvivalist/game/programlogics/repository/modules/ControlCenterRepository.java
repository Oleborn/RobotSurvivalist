package oleborn.robotsurvivalist.game.programlogics.repository.modules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.ControlCenter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ControlCenterRepository extends JpaRepository<ControlCenter, UUID> {
}
