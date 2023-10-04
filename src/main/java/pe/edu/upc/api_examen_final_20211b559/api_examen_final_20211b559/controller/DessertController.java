package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.dtos.DessertDTO;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.dtos.IngredientDTO;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Dessert;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Ingredient;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services.DessertService;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.servicesimplements.DessertServiceImplement;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class DessertController {
    @Autowired
    private DessertService dS;
    @Autowired
    private DessertServiceImplement dSI;

    @Autowired
    public DessertController(DessertService dessertService) {
        this.dS = dessertService;
    }

    @PreAuthorize("hasAuthority('ASISTENTE')")
    @PostMapping("/desserts")
    public ResponseEntity<DessertDTO> register(@RequestBody DessertDTO dessertDTO){
        Dessert dessert = convertToEntity(dessertDTO);
        dessert = dSI.register(dessert);
        dessertDTO = convertToDto(dessert);
        return new ResponseEntity<DessertDTO>(dessertDTO, HttpStatus.OK);
    }

    @PreAuthorize("hasAuthority('COCINERO')")
    @GetMapping("/getListInf")
    ResponseEntity<List<Object[]>> getListInf() throws Exception{
        List<Object[]> dto;
        try {
            dto = dS.getListInf();
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,"error al consultar lista de inf");
        }

        return new ResponseEntity<>(dto,HttpStatus.OK);
    }

    @PreAuthorize("hasAuthority('ASISTENTE')")
    @GetMapping("/dessertsget")
    public List<DessertDTO> listar() {
        return dS.listar().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,DessertDTO.class);

        }).collect(Collectors.toList());
    }

    private DessertDTO convertToDto(Dessert dessert) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dessert, DessertDTO.class);
    }

    private Dessert convertToEntity(DessertDTO dessertDTO) {
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(dessertDTO, Dessert.class);
    }

    private List<DessertDTO> convertToLisDto(List<Dessert> list){
        return list.stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }

}
