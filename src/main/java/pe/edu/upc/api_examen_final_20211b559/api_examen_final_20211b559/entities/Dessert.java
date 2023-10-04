package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@NoArgsConstructor
@Transactional
@Table(name = "desserts")
public class Dessert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dessert_id")
    private int anvcIdDessert;
    private String anvcNameDessert;
    private String anvcDescriptionDessert;
    private int anvcPreparationTimeDessert;
    private String anvcDifficultyDessert;
    private String anvcCategoryDessert;
    @OneToMany(mappedBy = "dessert", cascade = CascadeType.ALL)
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private Set<Ingredient> ingredients = new HashSet<>();

    public Dessert(int anvcIdDessert, String anvcNameDessert, String anvcDescriptionDessert, int anvcPreparationTimeDessert, String anvcDifficultyDessert, String anvcCategoryDessert) {
        this.anvcIdDessert = anvcIdDessert;
        this.anvcNameDessert = anvcNameDessert;
        this.anvcDescriptionDessert = anvcDescriptionDessert;
        this.anvcPreparationTimeDessert = anvcPreparationTimeDessert;
        this.anvcDifficultyDessert = anvcDifficultyDessert;
        this.anvcCategoryDessert = anvcCategoryDessert;
    }

    public int getAnvcIdDessert() {
        return anvcIdDessert;
    }

    public void setAnvcIdDessert(int anvcIdDessert) {
        this.anvcIdDessert = anvcIdDessert;
    }

    public String getAnvcNameDessert() {
        return anvcNameDessert;
    }

    public void setAnvcNameDessert(String anvcNameDessert) {
        this.anvcNameDessert = anvcNameDessert;
    }

    public String getAnvcDescriptionDessert() {
        return anvcDescriptionDessert;
    }

    public void setAnvcDescriptionDessert(String anvcDescriptionDessert) {
        this.anvcDescriptionDessert = anvcDescriptionDessert;
    }

    public int getAnvcPreparationTimeDessert() {
        return anvcPreparationTimeDessert;
    }

    public void setAnvcPreparationTimeDessert(int anvcPreparationTimeDessert) {
        this.anvcPreparationTimeDessert = anvcPreparationTimeDessert;
    }

    public String getAnvcDifficultyDessert() {
        return anvcDifficultyDessert;
    }

    public void setAnvcDifficultyDessert(String anvcDifficultyDessert) {
        this.anvcDifficultyDessert = anvcDifficultyDessert;
    }

    public String getAnvcCategoryDessert() {
        return anvcCategoryDessert;
    }

    public void setAnvcCategoryDessert(String anvcCategoryDessert) {
        this.anvcCategoryDessert = anvcCategoryDessert;
    }

    @Override
    public String toString() {
        return "Dessert{" +
                "anvcIdDessert=" + anvcIdDessert +
                ", anvcNameDessert='" + anvcNameDessert + '\'' +
                ", anvcDescriptionDessert='" + anvcDescriptionDessert + '\'' +
                ", anvcPreparationTimeDessert=" + anvcPreparationTimeDessert +
                ", anvcDifficultyDessert='" + anvcDifficultyDessert + '\'' +
                ", anvcCategoryDessert='" + anvcCategoryDessert + '\'' +
                '}';
    }
}
