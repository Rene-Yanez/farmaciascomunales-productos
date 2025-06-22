package com.farmaciascomunales.productos.service;

import com.farmaciascomunales.productos.model.Producto;
import com.farmaciascomunales.productos.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    private final ProductoRepository repository;

    public ProductoService(ProductoRepository repository) {
        this.repository = repository;
    }

    public List<Producto> obtenerTodos() {
        return repository.findAll();
    }

    public Producto obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Producto crear(Producto producto) {
        return repository.save(producto);
    }
}