package oleborn.robotsurvivalist.game.programlogics.model.entities.module.originalmodules;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "project_chassis")
public class ProjectChassis extends ParentModule {

    //максимальный поддерживаемый вес
    @Column(name = "supported_weight")
    private Integer supportedWeight;

    //максимальная скорость
    @Column(name = "max_speed")
    private Integer maxSpeed;

    //возможность плавать
    @Column(name = "ability_to_float")
    private Boolean abilityToFloat;

    //количество устанавливаемого основного оборудования
    @Column(name = "count_mining equipment")
    private Integer countOfMiningEquipment;

    //количество устанавливаемого вспомогательного оборудования
    @Column(name = "count_auxiliary equipment")
    private Integer countOfAuxiliaryEquipment;

    //количество устанавливаемого вспомогательного оборудования
    @Column(name = "count_defense equipment")
    private Integer countOfDefenseEquipment;

    //количество устанавливаемого вспомогательного оборудования
    @Column(name = "count_offensive equipment")
    private Integer countOfOffensiveEquipment;
}
