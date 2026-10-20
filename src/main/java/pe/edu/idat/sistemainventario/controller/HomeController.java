package pe.edu.idat.sistemainventario.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {

        List<String> modulos = List.of(
                "Usuarios",
                "Productos",
                "Categorías",
                "Proveedores"
        );

        model.addAttribute("modulos", modulos);

        return "home";
    }
}
