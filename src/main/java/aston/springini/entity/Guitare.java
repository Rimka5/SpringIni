package aston.springini.entity;

import jakarta.persistence.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.hibernate.annotations.GeneratorType;
import org.springframework.stereotype.Component;

/**
 * Classe guitare qui implement instruments
 * @author roumaissa
 */
@Entity
public class Guitare implements Instrument{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String model;

    public Guitare() {
    }

    public Guitare(long id, String model) {
        this.id=id;
        this.model = model;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
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
        return "Guitare{" +
                "model= GlinGlingGling'" + '\'' +
                '}';
    }
}
