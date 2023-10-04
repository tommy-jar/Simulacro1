package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.controller.DessertNotFoundException;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Dessert;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.repositories.DessertRepository;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services.DessertService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class DessertServiceImplement implements DessertService {
    @Autowired
    private DessertRepository dR;

    @Override
    public Dessert register(Dessert dessert){
        return dR.save(dessert);
    }

    @Override
    public Dessert getDessertById(Integer anvcIdDessert) {
        Optional<Dessert> optionalDessert = dR.findById(anvcIdDessert);

        if (optionalDessert.isPresent()) {
            return optionalDessert.get();
        } else {
            try {
                throw new DessertNotFoundException("No se encontró un propietario con el ID proporcionado");
            } catch (DessertNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public List<Object[]> getListInf(){
        return dR.getListInf();
    }

    @Override
    public List<Dessert> listar() {
        return dR.findAll();
    }
}
