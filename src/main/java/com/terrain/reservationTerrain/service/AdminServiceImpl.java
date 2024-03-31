package com.terrain.reservationTerrain.service;

import com.terrain.reservationTerrain.entity.Admin;
import com.terrain.reservationTerrain.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AdminServiceImpl implements AdminService{
    @Autowired
    AdminRepository adminRepository;

    @Override
    public Admin ajouterAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public Admin modifierAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void supprimerAdmin(Long id) {
        adminRepository.deleteById(id);
    }

    @Override
    public List<Admin> afficherAdmin() {
        return adminRepository.findAll();
    }

    @Override
    public Optional<Admin> affchierAdminById(Long id) {
        return adminRepository.findById(id);
    }
}
