package com.terrain.reservationTerrain.restController;

import com.terrain.reservationTerrain.entity.Terrain;
import com.terrain.reservationTerrain.service.TerrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/Terrain")

public class TerrainRestController {
    @Autowired
    TerrainService terrainService;
    @RequestMapping(method = RequestMethod.POST )
    public Terrain ajoutTerrain(@RequestBody Terrain terrain){
        return terrainService.ajouterTerrain(terrain);

    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Terrain> afficherTerrain(){
        return terrainService.afficherTerrain();
    }
    @RequestMapping(method = RequestMethod.DELETE,value="/{id}")
    public void deleteTerrain(@PathVariable("id")Long id){
        terrainService.supprimerTerrain(id);
    }
    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public Terrain modifierTerrain(@RequestBody Terrain terrain, @PathVariable("id")Long id){
        return terrainService.modifierTerrain(terrain);
    }
    @RequestMapping(method = RequestMethod.GET,value ="/{id}")
    public Optional<Terrain> afficherTerrainbyid(@PathVariable("id")Long id){
        Optional<Terrain> terrainid=terrainService.afficherTerrainById(id);
        return terrainid;
    }
}

