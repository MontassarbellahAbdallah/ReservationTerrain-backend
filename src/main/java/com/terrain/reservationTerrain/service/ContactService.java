package com.terrain.reservationTerrain.service;

import com.terrain.reservationTerrain.entity.Contact;


import java.util.List;

public interface ContactService {
    Contact ajouterContact(Contact contact);
    void supprimerContact(Long id);
    List<Contact> afficherContact();
}
