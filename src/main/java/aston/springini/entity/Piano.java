package aston.springini.entity;

import jakarta.persistence.*;

/**
 * Classe Piano qui implement instrument
 * @author roumaissa
 */
@Entity
public class Piano implements Instrument{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String model;

    public Piano() {
    }

    public Piano(Long id, String model) {
        this.id = id;
        this.model = model;
    }

    public Piano(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @param model mettre a jour le model
     */
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Piano{" +
                "model= TingTingTing'" + '\'' +
                '}';
    }

}
