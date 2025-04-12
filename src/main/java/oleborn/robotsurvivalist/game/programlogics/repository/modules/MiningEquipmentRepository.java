package oleborn.robotsurvivalist.game.programlogics.repository.modules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.MiningEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MiningEquipmentRepository extends JpaRepository<MiningEquipment, UUID> {
}
