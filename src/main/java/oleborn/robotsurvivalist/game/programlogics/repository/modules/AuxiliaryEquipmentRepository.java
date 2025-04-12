package oleborn.robotsurvivalist.game.programlogics.repository.modules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.AuxiliaryEquipment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuxiliaryEquipmentRepository extends JpaRepository<AuxiliaryEquipment, UUID> {
}
