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
import UD27.dto.Cajeros;
import UD27.service.CajeroServiceImpl;


@RestController
@RequestMapping("/api")
public class CajeroController {

		@Autowired
		CajeroServiceImpl cajeroServiceImpl;
		
		@GetMapping("/cajeros")
		public List<Cajeros> listarCajeros(){
			return cajeroServiceImpl.listarCajeros();
		}
		
		
		@PostMapping("/cajeros")
		public Cajeros guardarCajeros(@RequestBody Cajeros cajeros) {
			
			return cajeroServiceImpl.guardarCajeros(cajeros);
		}
		
		
		@GetMapping("/cajeros/{id}")
		public Cajeros Cajero_ID(@PathVariable(name="id") Integer codigo_cajero) {
			
			Cajeros Cajero_id= new Cajeros();
			
			Cajero_id=cajeroServiceImpl.cajeros_ID(codigo_cajero);
			
			return Cajero_id;
		}
		
		@PutMapping("/cajeros/{id}")
		public Cajeros actualizarCajero(@PathVariable(name="id")Integer codigo_cajero,@RequestBody Cajeros cajeros) {
			
			Cajeros Cajero_seleccionado= new Cajeros();
			Cajeros Cajero_actualizado= new Cajeros(); 
			
			Cajero_seleccionado= cajeroServiceImpl.cajeros_ID(codigo_cajero);
			
			Cajero_seleccionado.setCodigo_cajero(cajeros.getCodigo_cajero());
			Cajero_seleccionado.setNom_apels(cajeros.getNom_apels());
			
			Cajero_actualizado = cajeroServiceImpl.actualizarCajeros(Cajero_seleccionado);
			
			return Cajero_actualizado;
		}
		
		@DeleteMapping("/cajeros/{id}")
		public void eleiminarCajeros(@PathVariable(name="id")Integer codigo_cajero) {
			cajeroServiceImpl.eliminarCajeros(codigo_cajero);
		}
}
