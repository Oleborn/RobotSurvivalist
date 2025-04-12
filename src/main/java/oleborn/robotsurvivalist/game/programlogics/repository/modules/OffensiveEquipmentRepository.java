package oleborn.robotsurvivalist.game.programlogics.repository.modules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.OffensiveEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface OffensiveEquipmentRepository extends JpaRepository<OffensiveEquipment, UUID> {
}
