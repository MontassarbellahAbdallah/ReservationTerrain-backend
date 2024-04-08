package com.terrain.reservationTerrain.restController;

import com.terrain.reservationTerrain.entity.Admin;
import com.terrain.reservationTerrain.entity.Reservation;
import com.terrain.reservationTerrain.entity.User;
import com.terrain.reservationTerrain.service.AdminService;
import com.terrain.reservationTerrain.service.ReservationService;
import com.terrain.reservationTerrain.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("ALL")
@CrossOrigin("*")
@RestController
@RequestMapping("/Reservation")
public class UserRestController {
    @Autowired
    ReservationService reservationService;
    //ajouter reservation
    @RequestMapping(method = RequestMethod.POST, value = "/reservation")
    public void ajouterRservation(@RequestBody Reservation newreservation)
    {
        reservationService.ajouterReservation(newreservation);
    }


}
