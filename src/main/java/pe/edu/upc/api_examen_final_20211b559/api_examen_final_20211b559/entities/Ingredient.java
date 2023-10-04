package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Transactional
@Table(name = "ingredients")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int anvcIdIngredient;
    private String anvcNameIngredient;
    private int anvcQuantityIngredient;
    private String anvcUnitMeasurementIngredient;
    @ManyToOne
    @JsonBackReference
    @JoinColumn(name = "dessert_id")
    private Dessert dessert;

    public Ingredient(int anvcIdIngredient, String anvcNameIngredient, int anvcQuantityIngredient, String anvcUnitMeasurementIngredient, Dessert dessert) {
        this.anvcIdIngredient = anvcIdIngredient;
        this.anvcNameIngredient = anvcNameIngredient;
        this.anvcQuantityIngredient = anvcQuantityIngredient;
        this.anvcUnitMeasurementIngredient = anvcUnitMeasurementIngredient;
        this.dessert = dessert;
    }

    public int getAnvcIdIngredient() {
        return anvcIdIngredient;
    }

    public void setAnvcIdIngredient(int anvcIdIngredient) {
        this.anvcIdIngredient = anvcIdIngredient;
    }

    public String getAnvcNameIngredient() {
        return anvcNameIngredient;
    }

    public void setAnvcNameIngredient(String anvcNameIngredient) {
        this.anvcNameIngredient = anvcNameIngredient;
    }

    public int getAnvcQuantityIngredient() {
        return anvcQuantityIngredient;
    }

    public void setAnvcQuantityIngredient(int anvcQuantityIngredient) {
        this.anvcQuantityIngredient = anvcQuantityIngredient;
    }

    public String getAnvcUnitMeasurementIngredient() {
        return anvcUnitMeasurementIngredient;
    }

    public void setAnvcUnitMeasurementIngredient(String anvcUnitMeasurementIngredient) {
        this.anvcUnitMeasurementIngredient = anvcUnitMeasurementIngredient;
    }

    public Dessert getDessert() {
        return dessert;
    }

    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "anvcIdIngredient=" + anvcIdIngredient +
                ", anvcNameIngredient='" + anvcNameIngredient + '\'' +
                ", anvcQuantityIngredient=" + anvcQuantityIngredient +
                ", anvcUnitMeasurementIngredient='" + anvcUnitMeasurementIngredient + '\'' +
                ", dessert=" + dessert +
                '}';
    }
}
