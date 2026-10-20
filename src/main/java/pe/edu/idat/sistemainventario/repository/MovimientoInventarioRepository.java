package pe.edu.idat.sistemainventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.sistemainventario.entity.MovimientoInventario;

public interface MovimientoInventarioRepository
            extends JpaRepository <MovimientoInventario, Long> {
}
