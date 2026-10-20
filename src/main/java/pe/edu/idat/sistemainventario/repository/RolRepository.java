package pe.edu.idat.sistemainventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.sistemainventario.entity.Rol;

public interface RolRepository
        extends JpaRepository<Rol, Long>
                {
}
