package com.terrain.reservationTerrain.repository;

import com.terrain.reservationTerrain.entity.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TerrainRepository extends JpaRepository<Terrain, Long> {
}
