package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.OperatorDto;
import oleborn.robotsurvivalist.game.programlogics.model.dto.RobotEntityDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.operator.Operator;
import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface RobotMapper {

    List<RobotEntityDto> toDtos(List<RobotEntity> robotEntities);

    RobotEntityDto toDto(RobotEntity robot);
}
