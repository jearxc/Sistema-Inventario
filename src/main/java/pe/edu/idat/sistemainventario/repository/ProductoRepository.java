package pe.edu.idat.sistemainventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.sistemainventario.entity.Producto;

public interface ProductoRepository
            extends JpaRepository <Producto, Long> {
}
