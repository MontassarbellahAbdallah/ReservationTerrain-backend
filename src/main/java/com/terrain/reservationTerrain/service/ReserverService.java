package com.terrain.reservationTerrain.service;

import com.terrain.reservationTerrain.beans.ReserverRQ;
import com.terrain.reservationTerrain.entity.Reserver;

import java.util.List;

public interface ReserverService {
    Reserver ajouterReservation(ReserverRQ reserverRQ);
    List<Reserver> listeReservation();
    List<Reserver> listeTerrainsByClient(Long id);
}
