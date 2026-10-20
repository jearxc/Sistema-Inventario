package pe.edu.idat.sistemainventario.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.sistemainventario.entity.Rol;
import pe.edu.idat.sistemainventario.repository.RolRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class RolService {

    private final RolRepository rolRepository;

    public List<Rol> listarRoles(){
        return rolRepository.findAll();
    }

    public Rol registrarRol(Rol rol){

        return rolRepository.save(rol);
    }

    public Rol buscarPorId(Long id){

        return rolRepository.findById(id).orElse(null);
    }

    public void eliminarRol(Long id){
        rolRepository.deleteById(id);
    }
}
