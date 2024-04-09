package com.terrain.reservationTerrain.service;

import com.terrain.reservationTerrain.entity.Terrain;
import java.util.List;
import java.util.Optional;

public interface TerrainService {
    Terrain ajouterTerrain(Terrain terrain);
    Terrain modifierTerrain(Terrain terrain);
    void supprimerTerrain(Long id);
    List<Terrain> afficherTerrain();
    Optional<Terrain> afficherTerrainById(Long id);


}
