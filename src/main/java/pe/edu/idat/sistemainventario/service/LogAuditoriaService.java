package pe.edu.idat.sistemainventario.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.sistemainventario.entity.LogAuditoria;
import pe.edu.idat.sistemainventario.repository.LogAuditoriaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LogAuditoriaService {
    private final LogAuditoriaRepository logAuditoriaRepository;

    public List<LogAuditoria> listarLogsAuditoria(){
        return logAuditoriaRepository.findAll();
    }
    public LogAuditoria registrarLogAuditoria(LogAuditoria logAuditoria){
        return logAuditoriaRepository.save(logAuditoria);
    }

    public LogAuditoria buscarPorId(Long id){
        return logAuditoriaRepository.findById(id).orElse(null);

    }

    public void eliminarLogAuditoria(Long id){
        logAuditoriaRepository.deleteById(id);
    }
}
