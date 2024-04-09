package com.terrain.reservationTerrain.service;

import com.terrain.reservationTerrain.entity.Terrain;
import com.terrain.reservationTerrain.repository.TerrainRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class TerrainServiceImpl implements TerrainService{
    @Autowired
    TerrainRepository terrainRepository;
    @Override
    public Terrain ajouterTerrain(Terrain terrain) {
        return terrainRepository.save(terrain);
    }
    @Override
    public Terrain modifierTerrain(Terrain terrain) {
        return terrainRepository.save(terrain);
    }
    @Override
    public void supprimerTerrain(Long id) {
        terrainRepository.deleteById(id);
    }
    @Override
    public List<Terrain> afficherTerrain() {
        return terrainRepository.findAll();
    }
    @Override
    public Optional<Terrain> afficherTerrainById(Long id) {
        return terrainRepository.findById(id);
    }
}
