package pe.edu.idat.sistemainventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.sistemainventario.entity.Proveedor;

public interface ProveedorRepository
        extends JpaRepository <Proveedor, Long> {
}
