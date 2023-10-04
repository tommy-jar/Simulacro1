package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Role;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.repositories.RoleRepository;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services.RoleService;

import java.util.List;

@Service
public class RoleServiceImplement implements RoleService {
    @Autowired
    private RoleRepository rR;

    @Override
    public void insert(Role role) {
        rR.save(role);
    }

    @Override
    public List<Role> list() {
        // TODO Auto-generated method stub
        return rR.findAll();
    }
}
