package com.ubb.proyecto.service; 
import com.ubb.proyecto.repository.CategoriaRepository;
import com.ubb.proyecto.model.Categoria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Obtener todas las categorías
    public List<Categoria> getAllCategorias() {
        return categoriaRepository.findAll();
    }

    // Obtener una categoría por ID
    public Optional<Categoria> getCategoriaById(int id) {
        return categoriaRepository.findById(id);
    }

    // Crear una nueva categoría
    public Categoria createCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Actualizar una categoría existente
    public Optional<Categoria> updateCategoria(int id, Categoria categoriaDetails) {
        return categoriaRepository.findById(id).map(categoria -> {
            categoria.setNombre(categoriaDetails.getNombre());
            return categoriaRepository.save(categoria);
        });
    }

    // Eliminar una categoría por ID
    public boolean deleteCategoria(int id) {
        return categoriaRepository.findById(id).map(categoria -> {
            categoriaRepository.delete(categoria);
            return true;
        }).orElse(false);
    }
}
