package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Dessert;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Ingredient;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.repositories.DessertRepository;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.repositories.IngredientRepository;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services.IngredientService;

import java.util.ArrayList;
import java.util.List;

@Service
public class IngredientServiceImplement implements IngredientService {
    @Autowired
    private IngredientRepository iR;
    @Autowired
    private DessertRepository dR;

    @Override
    public Ingredient register(Ingredient ingredient){
        return iR.save(ingredient);
    }

    @Override
    public List<Ingredient> listar() {
        return iR.findAll();
    }
}
