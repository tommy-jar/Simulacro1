package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services;

import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.User;

import java.util.List;

public interface UserService {
    Integer insert(User user);

    void insertUser(User user);

    public Integer buscarUser(String username);

    List<User> list();

    Integer insertUserRol(Long user_id, Long rol_id);
}
