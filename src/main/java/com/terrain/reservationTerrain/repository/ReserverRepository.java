package com.terrain.reservationTerrain.repository;

import com.terrain.reservationTerrain.entity.Reserver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReserverRepository extends JpaRepository<Reserver, Long> {
    List<Reserver> findByClientId(Long id);
}
