package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services;

import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Dessert;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Ingredient;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;

public interface DessertService {

    Dessert register(Dessert dessert);

    Dessert getDessertById(Integer anvcIdIngredient);

    List<Dessert> listar();

    public List<Object[]> getListInf();
}
