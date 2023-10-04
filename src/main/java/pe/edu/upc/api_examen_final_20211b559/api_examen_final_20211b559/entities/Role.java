package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String rol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
