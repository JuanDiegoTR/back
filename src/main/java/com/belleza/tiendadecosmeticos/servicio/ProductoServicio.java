package com.belleza.tiendadecosmeticos.servicio;

import com.belleza.tiendadecosmeticos.modelo.Producto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ProductoServicio {
     ResponseEntity<List<Producto>> listarProductos();

     ResponseEntity<Producto>  guardarProducto(Producto producto);

     ResponseEntity<Producto> eliminarProducto(Long id);

     ResponseEntity<Producto> productoPorId(Long id);

     ResponseEntity<Producto> actualizarProducto(Producto producto,Long id);

}
