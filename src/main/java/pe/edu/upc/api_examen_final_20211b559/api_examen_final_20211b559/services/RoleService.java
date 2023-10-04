package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services;

import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Role;

import java.util.List;

public interface RoleService {
    void insert(Role role);

    List<Role> list();
}
