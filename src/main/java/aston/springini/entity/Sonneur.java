package aston.springini.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.lang.NonNull;

@Entity
public class Sonneur implements Musicien{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Column
    private String nom;

   /* @OneToOne(targetEntity = Cornemuse.class)
    @JoinColumn(name = "cornemuse_id")*/

    @OneToOne
    @JoinColumn(name = "cornemuse_id")
    private Cornemuse cornemuse;


    public Sonneur() {
    }

    public Sonneur(Long id, String nom, Instrument cornemuse) {
        this.id = id;
        this.nom = nom;
        this.cornemuse = (Cornemuse) cornemuse;
    }

    public Sonneur(String nom, Instrument cornemuse) {
        this.nom = nom;
        this.cornemuse = (Cornemuse) cornemuse;
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

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Instrument getCornemuse() {
        return cornemuse;
    }

    public void setCornemuse(Instrument cornemuse) {
        this.cornemuse = (Cornemuse) cornemuse;
    }

    @Override
    public void jouer() {
        System.out.println(getNom()+ "joue : "+ getCornemuse());
    }
}
