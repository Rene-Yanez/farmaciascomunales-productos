package com.farmaciascomunales.productos.repository;

import com.farmaciascomunales.productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}