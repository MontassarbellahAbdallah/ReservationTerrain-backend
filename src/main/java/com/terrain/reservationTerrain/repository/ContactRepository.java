package com.terrain.reservationTerrain.repository;

import com.terrain.reservationTerrain.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
