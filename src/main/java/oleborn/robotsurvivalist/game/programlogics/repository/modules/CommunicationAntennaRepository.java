package oleborn.robotsurvivalist.game.programlogics.repository.modules;

import oleborn.robotsurvivalist.game.programlogics.model.entities.module.CommunicationAntenna;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CommunicationAntennaRepository extends JpaRepository<CommunicationAntenna, UUID> {
}
