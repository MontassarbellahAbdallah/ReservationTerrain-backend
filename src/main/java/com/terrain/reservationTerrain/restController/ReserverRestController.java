package com.terrain.reservationTerrain.restController;

import com.terrain.reservationTerrain.beans.ReserverRQ;
import com.terrain.reservationTerrain.entity.Terrain;
import com.terrain.reservationTerrain.entity.Reserver;
import com.terrain.reservationTerrain.service.ReserverService;
import com.terrain.reservationTerrain.service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/Reserver")
public class ReserverRestController {
    @Autowired
    ReserverService reserverService;
    @Autowired
    TerrainService terrainService;
    @RequestMapping(method = RequestMethod.POST )
    public Reserver ajoutReservation(@RequestBody ReserverRQ reserverRQ){
        return reserverService.ajouterReservation(reserverRQ);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Reserver> afficherReservation(){
        return reserverService.listeReservation();
    }
    @RequestMapping(method = RequestMethod.GET,value ="/{id}")
    public Optional<Terrain> afficherbyid(@PathVariable("id")Long id){
        Optional<Terrain> terrainid=terrainService.afficherTerrainById(id);
        return terrainid;
    }
}
