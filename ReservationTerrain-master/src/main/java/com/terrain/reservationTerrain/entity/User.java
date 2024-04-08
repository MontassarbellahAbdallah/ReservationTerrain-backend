package com.terrain.reservationTerrain.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
@Data
public class User {
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id_user;

    @Setter
    @Getter
    @Column(nullable = false,length = 20)
    private String nom;

    @Column(nullable = false,length = 20)
    private String prenom;

    @Setter
    @Column(nullable = false, unique = true, length = 45)
    private String email;

    @Setter
    @Getter
    @Column(nullable = false,length = 64)
    private String mdp;
    public User() {
        super();

    }

    public User(Long id_user, String nom, String prenom, String email, String mdp) {
        this.id_user = id_user;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
    }


    public void setPreom(String nom) {
        this.nom = nom;
    }

    public String getPreom() {
        return nom;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
