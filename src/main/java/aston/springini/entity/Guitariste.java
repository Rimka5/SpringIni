package aston.springini.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

/**
 * Classe artiste de type guitariste implement Musicien
 * @author roumaissa
 */
@Entity
public class Guitariste implements Musicien{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column(name = "nom")
    @Size(max=50)
    private String nom;
    /*
    * @OneToOne(targetEntity = Guitare.class)
    @JoinColumn(name = "guitare_id")
    private Instrument guitare;
    * */
    @OneToOne
    @JoinColumn(name = "guitare_id")
    private Guitare guitare;

    public Guitariste(Long id, String nom, Instrument guitare) {
        this.id = id;
        this.nom = nom;
        this.guitare = (Guitare) guitare;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public void jouer() {
        System.out.println(getNom()+ "joue : "+ getGuitare());
    }

    public Guitariste() {
    }

    public Guitariste(String nom, Instrument guitare) {
        this.nom = nom;
        this.guitare = (Guitare)guitare;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getGuitare() {
        return guitare;
    }

    public void setGuitare(Instrument guitare) {
        this.guitare = (Guitare)guitare;
    }
}
