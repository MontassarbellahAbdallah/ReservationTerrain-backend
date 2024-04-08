package com.terrain.reservationTerrain.service;

import com.terrain.reservationTerrain.entity.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation modifierReservation(Reservation reservation, Long id_reservation);
    void supprimerReservation(Long id_reservation);
    List<Reservation>afficherReservation();
    Optional<Reservation>afficherReservationById(Long id_reservation);

}
