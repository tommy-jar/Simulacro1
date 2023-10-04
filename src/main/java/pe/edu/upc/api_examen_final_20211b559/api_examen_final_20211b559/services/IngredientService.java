package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services;

import org.springframework.http.ResponseEntity;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Ingredient;

import java.util.List;
import java.util.Map;

public interface IngredientService {

    Ingredient register(Ingredient ingredient);


    List<Ingredient> listar();
}
