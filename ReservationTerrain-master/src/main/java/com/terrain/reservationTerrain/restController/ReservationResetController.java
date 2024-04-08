package com.terrain.reservationTerrain.restController;

import com.terrain.reservationTerrain.entity.Reservation;
import com.terrain.reservationTerrain.service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ReservationResetController {

    @Autowired
    private ReservationService reservationService;
    //ajoutReservation
    @CrossOrigin
    @RequestMapping(method=RequestMethod.POST, value= "/reservation")
    public void ajouterReservation(@RequestBody Reservation reservation) {
        reservationService.ajouterReservation(reservation);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.DELETE, value= "/reservation/{id_reservation}")
    public void supprimerReservation(@PathVariable Long id_reservation) {
        reservationService.supprimerReservation(id_reservation);
    }

    @CrossOrigin
    @RequestMapping(method=RequestMethod.PUT,value="/reservation/{id_reservation}")
    public void modifierReservation(@RequestBody Reservation updatedRes, @PathVariable Long id_reservation) {

        reservationService.modifierReservation(updatedRes,id_reservation);
    }

    @CrossOrigin
    @RequestMapping("/reservation")
    public java.util.List<Reservation> afficherReservation() {

        return reservationService.afficherReservation();

    }

    @CrossOrigin
    @RequestMapping("/reservation/{id_reservation}")
    public Optional<Reservation> afficherReservationById(@PathVariable Long id_reservation) {

        return reservationService.afficherReservationById(id_reservation);
    }
}
