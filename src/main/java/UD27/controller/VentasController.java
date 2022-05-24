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

import UD27.dto.Venta;
import UD27.service.VentasServiceImpl;


@RestController
@RequestMapping("/api")
public class VentasController {

	
	@Autowired
	VentasServiceImpl ventasServiceImpl;
	
	@GetMapping("/ventas")
	public List<Venta> listarVentas(){
		return ventasServiceImpl.listarVenta();
	}
	
	
	@PostMapping("/ventas")
	public Venta guardarVentas(@RequestBody Venta venta) {
		
		return ventasServiceImpl.guardarVenta(venta);
	}
	
	
	@GetMapping("/ventas/{id}")
	public Venta Venta_ID(@PathVariable(name="id") Integer id_venta) {
		
		Venta Venta_id= new Venta();
		
		Venta_id= ventasServiceImpl.Venta_ID(id_venta);
		
		return Venta_id;
	}
	
	@PutMapping("/ventas/{id}")
	public Venta actualizarCajero(@PathVariable(name="id")Integer id_venta,@RequestBody Venta venta) {
		
		Venta Venta_seleccionado= new Venta();
		Venta Venta_actualizado= new Venta(); 
		
		Venta_seleccionado= ventasServiceImpl.Venta_ID(id_venta);
		
		Venta_seleccionado.setId_venta(venta.getId_venta());
		
		Venta_actualizado = ventasServiceImpl.actualizarVenta(Venta_seleccionado);
		
		return Venta_actualizado;
	}
	
	@DeleteMapping("/ventas/{id}")
	public void eleiminarVenta(@PathVariable(name="id")Integer id_venta) {
		ventasServiceImpl.eliminarVenta(id_venta);
	}
}
