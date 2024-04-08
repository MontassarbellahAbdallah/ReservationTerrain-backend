package com.terrain.reservationTerrain.repository;

import com.terrain.reservationTerrain.entity.Admin;
import com.terrain.reservationTerrain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{
}
