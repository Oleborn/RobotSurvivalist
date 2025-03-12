package oleborn.robotsurvivalist.game.programlogics.repository;

import oleborn.robotsurvivalist.game.programlogics.model.entities.operator.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OperatorRepository extends JpaRepository<Operator, Long> {
}
