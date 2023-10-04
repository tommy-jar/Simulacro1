package pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.entities.Role;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services.RoleService;
import pe.edu.upc.api_examen_final_20211b559.api_examen_final_20211b559.services.UserService;

@Controller
@SessionAttributes
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private UserService uService;
    @Autowired
    private RoleService rService;

    @GetMapping("/new")
    public String newRole(Model model) {
        model.addAttribute("role", new Role());
        model.addAttribute("listaUsuarios", uService.list());
        return "role/role";
    }

    @PostMapping("/save")
    public String saveRole(@Validated Role role, BindingResult result, Model model, SessionStatus status) throws Exception {
        if (result.hasErrors()) {
            return "role/role";
        } else {
            rService.insert(role);
            model.addAttribute("mensaje", "Se guardó correctamente");
            status.setComplete();
        }
        model.addAttribute("listaRoles", rService.list());

        return "role/role";

    }

    @GetMapping("/list")
    public String listRole(Model model) {
        try {
            model.addAttribute("role", new Role());
            model.addAttribute("listaRoles", rService.list());
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "role/listRole";
    }
}
