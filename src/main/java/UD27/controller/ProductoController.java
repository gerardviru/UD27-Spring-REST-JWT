package UD27.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import UD27.dto.Productos;
import UD27.service.ProductosServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	ProductosServiceImpl productosServiceImpl;
	
	@GetMapping("/productos")
	public List<Productos> listarProductos(){
		return productosServiceImpl.listarProductos();
	}
	
	
	@PostMapping("/productos")
	public Productos guardarProductos(@RequestBody Productos productos) {
		
		return productosServiceImpl.guardarProductos(productos);
	}
	
	
	@GetMapping("/productos/{id}")
	public Productos productos_ID(@PathVariable(name="id") Integer codigo_producto) {
		
		Productos Productos_id= new Productos();
		
		Productos_id = productosServiceImpl.productos_ID(codigo_producto);
		
		return Productos_id;
	}
	
	@PutMapping("/productos/{id}")
	public Productos actualizarProductos(@PathVariable(name="id")Integer codigo_cajero,@RequestBody Productos productos) {
		
		Productos Producto_seleccionado= new Productos();
		Productos Producto_actualizado= new Productos(); 
		
		Producto_seleccionado= productosServiceImpl.productos_ID(codigo_cajero);
		
		Producto_seleccionado.setId_productos(productos.getId_productos());
		Producto_seleccionado.setNombre(productos.getNombre());
		
		Producto_actualizado = productosServiceImpl.actualizarProductos(Producto_seleccionado);
		
		return Producto_actualizado;
	}
	
	@DeleteMapping("/productos/{id}")
	public void eleiminarCajeros(@PathVariable(name="id")Integer codigo_cajero) {
		productosServiceImpl.eliminarProductos(codigo_cajero);
	}

}
