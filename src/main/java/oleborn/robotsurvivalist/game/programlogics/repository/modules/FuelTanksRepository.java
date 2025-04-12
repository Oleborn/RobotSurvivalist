package oleborn.robotsurvivalist.game.programlogics.repository.modules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.FuelTanks;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FuelTanksRepository extends JpaRepository<FuelTanks, UUID> {
}
