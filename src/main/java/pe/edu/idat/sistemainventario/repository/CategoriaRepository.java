package pe.edu.idat.sistemainventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.sistemainventario.entity.Categoria;

public interface CategoriaRepository
            extends JpaRepository<Categoria, Long> {
}
