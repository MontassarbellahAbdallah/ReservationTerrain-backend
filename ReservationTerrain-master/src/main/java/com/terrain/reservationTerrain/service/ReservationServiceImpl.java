package com.terrain.reservationTerrain.service;


import com.terrain.reservationTerrain.entity.Reservation;
import com.terrain.reservationTerrain.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService{

    @Autowired
    ReservationRepository reservationRepository;
    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation modifierReservation(Reservation updatedRes, Long id_reservation) {
        return reservationRepository.save(updatedRes);
    }

    @Override
    public void supprimerReservation(Long id_reservation) {
        reservationRepository.deleteById(String.valueOf(id_reservation));
    }

    @Override
    public List<Reservation> afficherReservation() {
        ArrayList<Reservation> allReservation = new ArrayList<>();
        reservationRepository.findAll().forEach(allReservation::add);

        return allReservation;
    }

    @Override
    public Optional<Reservation> afficherReservationById(Long id_reservation) {
        return reservationRepository.findById(String.valueOf(id_reservation));
    }


}
