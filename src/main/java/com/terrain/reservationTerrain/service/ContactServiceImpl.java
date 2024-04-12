package com.terrain.reservationTerrain.service;

import com.terrain.reservationTerrain.entity.Contact;
import com.terrain.reservationTerrain.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ContactServiceImpl implements ContactService{
    @Autowired
    ContactRepository contactRepository;
    @Override
    public Contact ajouterContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Override
    public void supprimerContact(Long id) {
        contactRepository.deleteById(id);

    }

    @Override
    public List<Contact> afficherContact() {
        return contactRepository.findAll();
    }
}
