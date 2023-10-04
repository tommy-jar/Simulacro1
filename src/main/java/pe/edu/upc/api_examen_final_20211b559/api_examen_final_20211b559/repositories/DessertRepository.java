package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Dessert;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Ingredient;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Repository
public interface DessertRepository extends JpaRepository<Dessert,Integer> {
    @Query("SELECT CONCAT('Dificultad: ', ds.anvcDifficultyDessert) AS dificultad, CONCAT('Cantidad de ingredientes: ', COUNT(i)) AS cantidad_ing FROM Dessert ds " +
            "INNER JOIN Ingredient i ON ds.anvcIdDessert = i.dessert.anvcIdDessert " +
            "GROUP BY ds.anvcDifficultyDessert")
    List<Object[]> getListInf();

}
