package pe.edu.idat.sistemainventario.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pe.edu.idat.sistemainventario.entity.Usuario;
import pe.edu.idat.sistemainventario.service.RolService;
import pe.edu.idat.sistemainventario.service.UsuarioService;

import java.util.List;

@Controller
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;
    private final RolService rolService;

    @GetMapping
    @ResponseBody
    public List<Usuario> listarUsuarios(){
        return usuarioService.listarUsuarios();
    }

    @GetMapping("/lista")
    public String listarUsuariosVista(Model model){
        model.addAttribute(
                "usuarios",
                usuarioService.listarUsuarios()
        );
        return "usuarios";
    }

    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model){
        model.addAttribute(
                "usuario",
                new Usuario()
        );
        model.addAttribute(
                "roles",
                rolService.listarRoles()
        );
        return "usuario-form";
    }

    @PostMapping("/guardar")
    public String guardarUsuario(Usuario usuario){
        usuarioService.registrarUsuario(usuario);
        return "redirect:/usuarios/lista";
    }


}
