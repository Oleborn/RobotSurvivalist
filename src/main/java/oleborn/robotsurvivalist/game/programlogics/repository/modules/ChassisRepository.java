package oleborn.robotsurvivalist.game.programlogics.repository.modules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.Chassis;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ChassisRepository extends JpaRepository<Chassis, UUID> {
}
