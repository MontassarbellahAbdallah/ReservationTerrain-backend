package com.terrain.reservationTerrain.service;

import com.terrain.reservationTerrain.entity.Client;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    ResponseEntity<Object> ajouterClient(Client client);
    Client modifierClient(Client client);
    void supprimerClient(Long id);
    List<Client> afficherClient();
    Optional<Client> afficherClientById(Long id);

    ResponseEntity<?> confirmationEmail(String confirmationToken) ;
}
