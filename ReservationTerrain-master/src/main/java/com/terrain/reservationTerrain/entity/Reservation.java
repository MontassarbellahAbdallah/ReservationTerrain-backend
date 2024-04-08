package com.terrain.reservationTerrain.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;

import java.util.Date;


@Entity
@Data

public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_reservation;
    private Long id_user;
    private Long id_terrain;
    private Date date_debut ;
    private Date date_fin ;
    private String status ;

    public Reservation(Long id_reservation, Long id_user, Long id_terrain, Date date_debut, Date date_fin, String status) {
        this.id_reservation = id_reservation;
        this.id_user = id_user;
        this.id_terrain = id_terrain;
        this.date_debut = date_debut;
        this.date_fin = date_fin;
        this.status = status;
    }

    public Reservation() {

    }

    public Long getId_reservation() {
        return id_reservation;
    }

    public void setId_reservation(Long id_reservation) {
        this.id_reservation = id_reservation;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public Long getId_terrain() {
        return id_terrain;
    }

    public void setId_terrain(Long id_terrain) {
        this.id_terrain = id_terrain;
    }

    public Date getDate_debut() {
        return date_debut;
    }

    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }

    public Date getDate_fin() {
        return date_fin;
    }

    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
