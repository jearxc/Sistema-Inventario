package pe.edu.idat.sistemainventario.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.sistemainventario.entity.Usuario;
import pe.edu.idat.sistemainventario.repository.UsuarioRepository;

import java.util.List;


@RequiredArgsConstructor
@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public List<Usuario> listarUsuarios(){
        return usuarioRepository.findAll();
    }

    public Usuario registrarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario buscarPorId(Long id){
        return usuarioRepository.findById(id).orElse(null);
    }

    public void eliminarUsuario(Long id){
        usuarioRepository.deleteById(id);
    }
}
