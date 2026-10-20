package pe.edu.idat.sistemainventario.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.sistemainventario.entity.Producto;
import pe.edu.idat.sistemainventario.repository.ProductoRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductoService {

    private final ProductoRepository productoRepository;

    public List<Producto> listarProductos(){
        return productoRepository.findAll();
    }

    public Producto registrarProducto(Producto producto){
        return productoRepository.save(producto);

    }

    public Producto buscarPorId(Long id){
        return productoRepository.findById(id).orElse(null);

    }
    public void eliminarProducto(Long id){
        productoRepository.deleteById(id);
    }
}

