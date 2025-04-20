package oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project_mining_equipment")
public class ProjectMiningEquipment extends ParentModule {

    private boolean minedOfMaterial;
    private boolean minedOfMetal;
    private boolean minedOfWater;

    //скорость добычи ед объема в минуту
    private Integer speedOfMiningMaterial;
    private Integer speedOfMiningMetal;
    private Integer speedOfMiningWater;
}
