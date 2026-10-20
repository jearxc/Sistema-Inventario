package pe.edu.idat.sistemainventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.sistemainventario.entity.LogAuditoria;

public interface LogAuditoriaRepository
            extends JpaRepository <LogAuditoria, Long> {
}
