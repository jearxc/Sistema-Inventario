package pe.edu.idat.sistemainventario.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.sistemainventario.entity.Proveedor;
import pe.edu.idat.sistemainventario.repository.ProveedorRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProveedorService {
    private final ProveedorRepository proveedorRepository;

    public List<Proveedor> listarProveedores(){
        return proveedorRepository.findAll();
    }

    public Proveedor registrarProveedor(Proveedor proveedor){
        return proveedorRepository.save(proveedor);

    }
    public Proveedor buscarPorId(Long id){
        return proveedorRepository.findById(id).orElse(null);
    }

    public void eliminarProveedor(Long id){
        proveedorRepository.deleteById(id);
    }


}
