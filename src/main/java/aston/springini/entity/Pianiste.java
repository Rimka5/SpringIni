package aston.springini.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import org.springframework.lang.NonNull;

@Entity
public class Pianiste implements Musicien{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nom",nullable = false)
    @Size(max=50)
    private String nom;
    @OneToOne
    @JoinColumn(name = "piano_id")
    private Piano piano;

    public Pianiste() {
    }

    public Pianiste(Long id, String nom, Piano piano) {
        this.id = id;
        this.nom = nom;
        this.piano = piano;
    }

    public Pianiste(String nom, Piano piano) {
        this.nom = nom;
        this.piano = piano;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public Piano getPiano() {
        return piano;
    }

    public void setPiano(Piano piano) {
        this.piano = piano;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Pianiste{" +
                "nom='" + nom + '\'' +
                ", piano=" + piano +
                '}';
    }

    @Override
    public void jouer() {
        System.out.println(getNom()+ "joue : "+ getPiano());
    }
}
