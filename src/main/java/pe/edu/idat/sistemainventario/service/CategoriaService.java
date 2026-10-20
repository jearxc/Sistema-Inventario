package pe.edu.idat.sistemainventario.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.idat.sistemainventario.entity.Categoria;
import pe.edu.idat.sistemainventario.repository.CategoriaRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    public List<Categoria> listarCategorias(){
        return categoriaRepository.findAll();
    }

    public Categoria registrarCategoria(Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    public Categoria buscarPorId(Long id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public void eliminarCategoria(Long id){
        categoriaRepository.deleteById(id);
    }
}
