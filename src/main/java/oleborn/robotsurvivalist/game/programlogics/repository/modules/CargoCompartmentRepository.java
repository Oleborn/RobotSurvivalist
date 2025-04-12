package oleborn.robotsurvivalist.game.programlogics.repository.modules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.CargoCompartment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CargoCompartmentRepository extends JpaRepository<CargoCompartment, UUID> {
}
