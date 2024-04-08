package com.terrain.reservationTerrain.repository;

import com.terrain.reservationTerrain.entity.Reservation;
import org.springframework.data.repository.CrudRepository;


public  interface ReservationRepository extends CrudRepository<Reservation,String> {
}
