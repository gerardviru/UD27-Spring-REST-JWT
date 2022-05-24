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

import UD27.dto.Maquina_Registradora;
import UD27.service.MaquinaRegServiceImpl;


@RestController
@RequestMapping("/api")
public class MaquinaRegController {

	@Autowired
	MaquinaRegServiceImpl maquinaregserviceimpl;
	
	@GetMapping("/maquinaReg")
	public List<Maquina_Registradora> listarMaquina_Registradora(){
		return maquinaregserviceimpl.listarMaquina_Registradora();
	}
	
	
	@PostMapping("/maquinaReg")
	public Maquina_Registradora guardarMaquina_Registradora(@RequestBody Maquina_Registradora maquina_Registradora) {
		
		return maquinaregserviceimpl.guardarMaquina_Registradora(maquina_Registradora);
	}
	
	
	@GetMapping("/maquinaReg/{id}")
	public Maquina_Registradora Maquina_Registradora_ID(@PathVariable(name="id") Integer id_maquina) {
		
		Maquina_Registradora Maquina_id = new Maquina_Registradora();
		
		Maquina_id = maquinaregserviceimpl.Maquina_Registradora_ID(id_maquina);
		
		return Maquina_id;
	}
	
	@PutMapping("/maquinaReg/{id}")
	public Maquina_Registradora actualizarMaquina_Registradora(@PathVariable(name="id")Integer id_maquina,@RequestBody Maquina_Registradora maquina_Registradora) {
		
		Maquina_Registradora MaquinaReg_seleccionado= new Maquina_Registradora();
		Maquina_Registradora MaquinaReg_actualizado= new Maquina_Registradora(); 
		
		MaquinaReg_seleccionado= maquinaregserviceimpl.Maquina_Registradora_ID(id_maquina);
		
		MaquinaReg_seleccionado.setId_maquinaReg(maquina_Registradora.getId_maquinaReg());
		MaquinaReg_seleccionado.setPiso(maquina_Registradora.getPiso());
		
		MaquinaReg_actualizado = maquinaregserviceimpl.actualizarMaquina_Registradora(MaquinaReg_seleccionado);
		
		return MaquinaReg_actualizado;
	}
	
	@DeleteMapping("/maquinaReg/{id}")
	public void eliminarMaquina_Registradora(@PathVariable(name="id")Integer id_maquina) {
		maquinaregserviceimpl.eliminarMaquina_Registradora(id_maquina);
	}
	
}
