package cl.farmaciascomunales.productos.repository;

import cl.farmaciascomunales.productos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
    
}