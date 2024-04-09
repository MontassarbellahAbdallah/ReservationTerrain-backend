package com.terrain.reservationTerrain.repository;

import com.terrain.reservationTerrain.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findClientByEmail(String email);
    Client findByEmail(String email);
}