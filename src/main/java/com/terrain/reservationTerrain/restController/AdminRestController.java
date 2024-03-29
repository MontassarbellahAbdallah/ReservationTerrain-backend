package com.terrain.reservationTerrain.restController;

import com.terrain.reservationTerrain.entity.Admin;
import com.terrain.reservationTerrain.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/Admin")
public class AdminRestController {
    @Autowired
    AdminService adminService;
    @RequestMapping(method = RequestMethod.POST)
    public Admin ajoutAdmin(@RequestBody Admin admin){
        return adminService.ajouterAdmin(admin);
    }
}
