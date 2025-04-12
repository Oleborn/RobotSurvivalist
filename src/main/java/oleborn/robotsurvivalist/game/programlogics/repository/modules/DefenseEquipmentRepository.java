package oleborn.robotsurvivalist.game.programlogics.repository.modules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.DefenseEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DefenseEquipmentRepository extends JpaRepository<DefenseEquipment, UUID> {
}
