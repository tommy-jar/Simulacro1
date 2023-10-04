package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.dtos.IngredientDTO;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Dessert;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Ingredient;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services.DessertService;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services.IngredientService;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.servicesimplements.DessertServiceImplement;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.servicesimplements.IngredientServiceImplement;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@PreAuthorize("hasAuthority('COCINERO')")
public class IngredientController {
    @Autowired
    private IngredientService iS;
    @Autowired
    private DessertService dS;
    @Autowired
    private DessertServiceImplement dSI;
    @Autowired
    private IngredientServiceImplement iSI;

    @PostMapping("/ingredients")
    public void registrar(@RequestBody IngredientDTO dto) {
        ModelMapper m = new ModelMapper();
        Ingredient i = m.map(dto, Ingredient.class);
        iS.register(i);
    }

    @PostMapping("/ingredients/{anvcIdDessert}") // Cambia la ruta a algo que tenga sentido para registrar un paseador
    public ResponseEntity<IngredientDTO> register(@PathVariable Integer anvcIdDessert, @RequestBody IngredientDTO ingredientDTO) throws DessertNotFoundException {
        try {

            Dessert dessert = dSI.getDessertById(anvcIdDessert);


            Ingredient ingredient = convertToEntity(ingredientDTO);


            ingredient.setDessert(dessert);


            ingredient = iSI.register(ingredient);

            // Convertir la entidad paseador a DTO
            ingredientDTO = convertToDto(ingredient);

            return new ResponseEntity<IngredientDTO>(ingredientDTO, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/ingredientsget")
    @PreAuthorize("hasAuthority('COCINERO')")
    public List<IngredientDTO> listar() {
        return iS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,IngredientDTO.class);

        }).collect(Collectors.toList());
    }

    private IngredientDTO convertToDto(Ingredient ingredient) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(ingredient, IngredientDTO.class);
    }

    private Ingredient convertToEntity(IngredientDTO ingredientDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(ingredientDTO, Ingredient.class);
    }

    private List<IngredientDTO> convertToLisDto(List<Ingredient> list){
        return list.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
}
