package com.terrain.reservationTerrain.restController;

import com.terrain.reservationTerrain.entity.Admin;
import com.terrain.reservationTerrain.repository.AdminRepository;
import com.terrain.reservationTerrain.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Meta;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController
@RequestMapping("/Admin")
public class AdminRestController {
    @Autowired
    AdminRepository adminRepository;
    private BCryptPasswordEncoder bCryptPasswordEncoder=new BCryptPasswordEncoder();
    @Autowired
    AdminService adminService;
    @RequestMapping(method = RequestMethod.POST)
    public Admin ajoutAdmin(@RequestBody Admin admin){
        admin.setMdp(this.bCryptPasswordEncoder.encode(admin.getMdp()));
        Admin saveUser= adminRepository.save(admin);
        return adminService.ajouterAdmin(admin);
    }
    @RequestMapping(method = RequestMethod.PUT,value ="/{id}")
    public Admin modifierAdmin(@RequestBody Admin admin, @PathVariable("id")Long id){
        admin.setMdp(this.bCryptPasswordEncoder.encode(admin.getMdp()));
        Admin saveuser= adminRepository.save(admin);
        return adminService.modifierAdmin(admin);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Admin> afficherAdmin(){
        return adminService.afficherAdmin();
    }
    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public Optional<Admin> afficherAdminById(@PathVariable("id")Long id){
        return adminService.affchierAdminById(id);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public void supprimerAdmin(@PathVariable("id")Long id){
        adminService.supprimerAdmin(id);
    }


}
