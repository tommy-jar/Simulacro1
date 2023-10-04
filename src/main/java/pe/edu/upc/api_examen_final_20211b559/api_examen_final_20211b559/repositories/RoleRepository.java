package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
