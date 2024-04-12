package com.terrain.reservationTerrain.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Terrain {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String nomt;
    @NotBlank
    private String typeSport;
    @NotBlank
    private String localisation;
    @NotNull
    private String dispo;
    @Lob
    private String image;
    @NotBlank
    private  Float prix;
}
