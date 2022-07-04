package aston.springini.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cornemuse implements Instrument{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String model;

    public Cornemuse() {
    }

    public Cornemuse(Long id, String model) {
        this.id = id;
        this.model = model;
    }

    public Cornemuse(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Cornemuse{" +
                "model= glinkglinkglink'" + '\'' +
                '}';
    }
}
