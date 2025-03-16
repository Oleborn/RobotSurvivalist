package oleborn.robotsurvivalist.game.programlogics.repository;

import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface RobotRepository extends JpaRepository<RobotEntity, UUID> {

    List<RobotEntity> findByOperatorId(Long operatorId);

}
