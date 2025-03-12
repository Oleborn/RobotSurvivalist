package oleborn.robotsurvivalist.game.programlogics.mapper;

import oleborn.robotsurvivalist.game.programlogics.model.dto.OperatorDto;
import oleborn.robotsurvivalist.game.programlogics.model.dto.RobotEntityDto;
import oleborn.robotsurvivalist.game.programlogics.model.entities.operator.Operator;
import oleborn.robotsurvivalist.game.programlogics.model.entities.robot.RobotEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface OperatorMapper {


    OperatorDto toDto(Operator operator);

    Operator fromDto(OperatorDto operatorDto);

}
