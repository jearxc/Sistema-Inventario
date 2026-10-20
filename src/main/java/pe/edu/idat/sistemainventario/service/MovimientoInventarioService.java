package pe.edu.idat.sistemainventario.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.sistemainventario.entity.MovimientoInventario;
import pe.edu.idat.sistemainventario.repository.MovimientoInventarioRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovimientoInventarioService {

    private final MovimientoInventarioRepository movimientoInventarioRepository;

    public List<MovimientoInventario> listarMovimientosInventario(){
        return movimientoInventarioRepository.findAll();
    }

    public MovimientoInventario registrarMovimientoInventario(MovimientoInventario movimientoInventario){
        return movimientoInventarioRepository.save(movimientoInventario);

    }

    public MovimientoInventario buscarPorId(Long id){
        return movimientoInventarioRepository.findById(id).orElse(null);
    }
    public void eliminarMovimientoInventario(Long id){
        movimientoInventarioRepository.deleteById(id);
    }
}
