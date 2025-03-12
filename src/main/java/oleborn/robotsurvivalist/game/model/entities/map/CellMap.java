package oleborn.robotsurvivalist.game.model.entities.map;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import oleborn.robotsurvivalist.game.gamedictionary.mapdictionary.buildingdictionary.Building;
import oleborn.robotsurvivalist.game.gamedictionary.mapdictionary.materialsdictionary.Materials;
import oleborn.robotsurvivalist.game.gamedictionary.mapdictionary.resourcesdictionary.Resource;
import oleborn.robotsurvivalist.game.model.entities.enemy.interfaces.Enemy;
import oleborn.robotsurvivalist.game.model.entities.robot.RobotEntity;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "map_cells")
public class CellMap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "x_coord")
    private Integer XCoordinate;

    @Column(name = "y_coord")
    private Integer YCoordinate;

    //Сущности на карте
//    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
//    private List<List<Enemy>> enemies;

    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private List<RobotEntity> robots;

    //Объекты на карте
    @ElementCollection
    @CollectionTable(name = "map_materials", joinColumns = @JoinColumn(name = "cell_map_id"))
    @Column(name = "materials")
    private List<Materials> materials;

    @ElementCollection
    @CollectionTable(name = "map_resources", joinColumns = @JoinColumn(name = "cell_map_id"))
    @Column(name = "resources")
    private List<Resource> resources;

    @ElementCollection
    @CollectionTable(name = "map_buildings", joinColumns = @JoinColumn(name = "cell_map_id"))
    @Column(name = "buildings")
    private List<Building> buildings;

}
