package com.terrain.reservationTerrain.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Reserver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Terrain terrain;
    @ManyToOne
    private Client client;
}