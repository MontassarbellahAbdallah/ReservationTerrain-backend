package com.terrain.reservationTerrain.service;

import com.terrain.reservationTerrain.beans.ReserverRQ;
import com.terrain.reservationTerrain.entity.Client;
import com.terrain.reservationTerrain.entity.Terrain;
import com.terrain.reservationTerrain.entity.Reserver;
import com.terrain.reservationTerrain.repository.ReserverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ReserverServiceImpl implements ReserverService{
    @Autowired
    ReserverRepository reserverRepository;
    @Autowired
    TerrainService terrainService;
    @Autowired
    ClientService clientService;
    @Override
    public Reserver ajouterReservation(ReserverRQ reserverRQ) {
        Optional<Terrain> terrains = terrainService.afficherTerrainById(reserverRQ.getIdTerrain());
        Optional<Client> client = clientService.afficherClientById(reserverRQ.getIdClient());
        if (terrains.isPresent() && client.isPresent()) {
            Reserver reservation = new Reserver();
            reservation.setTerrain(terrains.get());
            reservation.setClient(client.get());
            return reserverRepository.save(reservation);}
        else{
            return null;}
    }
    @Override
    public List<Reserver> listeReservation() { return reserverRepository.findAll(); }
    @Override
    public List<Reserver> listeTerrainsByClient(Long id) {
        return reserverRepository.findByClientId(id);
    }
}
