package pe.edu.idat.sistemainventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.sistemainventario.entity.Usuario;

public interface UsuarioRepository
            extends JpaRepository <Usuario, Long> {
}
