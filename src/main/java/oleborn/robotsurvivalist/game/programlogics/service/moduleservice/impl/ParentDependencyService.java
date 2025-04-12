package oleborn.robotsurvivalist.game.programlogics.service.moduleservice.impl;

import jakarta.annotation.Resource;
import oleborn.robotsurvivalist.game.programlogics.mapper.*;
import oleborn.robotsurvivalist.game.programlogics.repository.modules.*;
import oleborn.robotsurvivalist.game.programlogics.repository.projectsmodules.*;
import org.springframework.stereotype.Service;

@Service
public class ParentDependencyService {

    @Resource
    protected ChassisRepository chassisRepository;

    @Resource
    protected ProjectChassisRepository projectChassisRepository;

    @Resource
    protected ChassisMapper chassisMapper;

    @Resource
    protected CargoCompartmentRepository cargoCompartmentRepository;

    @Resource
    protected ProjectCargoCompartmentRepository projectCargoCompartmentRepository;

    @Resource
    protected CargoCompartmentMapper cargoCompartmentMapper;

    @Resource
    protected CommunicationAntennaRepository communicationAntennaRepository;

    @Resource
    protected ProjectCommunicationAntennaRepository projectCommunicationAntennaRepository;

    @Resource
    protected CommunicationAntennaMapper communicationAntennaMapper;

    @Resource
    protected ControlCenterRepository controlCenterRepository;

    @Resource
    protected ProjectControlCenterRepository projectControlCenterRepository;

    @Resource
    protected ControlCenterMapper controlCenterMapper;

    @Resource
    protected EngineRepository engineRepository;

    @Resource
    protected ProjectEngineRepository projectEngineRepository;

    @Resource
    protected EngineMapper engineMapper;

    @Resource
    protected FuelTanksRepository fuelTanksRepository;

    @Resource
    protected ProjectFuelTanksRepository projectFuelTanksRepository;

    @Resource
    protected FuelTanksMapper fuelTanksMapper;

    @Resource
    protected MiningEquipmentRepository miningEquipmentRepository;

    @Resource
    protected ProjectMiningEquipmentRepository projectMiningEquipmentRepository;

    @Resource
    protected MiningEquipmentMapper miningEquipmentMapper;

    @Resource
    protected OffensiveEquipmentRepository offensiveEquipmentRepository;

    @Resource
    protected ProjectOffensiveEquipmentRepository projectOffensiveEquipmentRepository;

    @Resource
    protected OffensiveEquipmentMapper offensiveEquipmentMapper;

    @Resource
    protected DefenseEquipmentRepository defenseEquipmentRepository;

    @Resource
    protected ProjectDefenseEquipmentRepository projectDefenseEquipmentRepository;

    @Resource
    protected DefenseEquipmentMapper defenseEquipmentMapper;

    @Resource
    protected AuxiliaryEquipmentRepository auxiliaryEquipmentRepository;

    @Resource
    protected ProjectAuxiliaryEquipmentRepository projectAuxiliaryEquipmentRepository;

    @Resource
    protected AuxiliaryEquipmentMapper auxiliaryEquipmentMapper;


}
