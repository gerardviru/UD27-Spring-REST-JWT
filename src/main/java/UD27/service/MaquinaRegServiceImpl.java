package UD27.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD27.dao.IMaquinaRegDAO;
import UD27.dto.Maquina_Registradora;

@Service
public class MaquinaRegServiceImpl implements IMaquinaRegService{

	@Autowired
	IMaquinaRegDAO iMaquinaregDAO;

	@Override
	public List<Maquina_Registradora> listarMaquina_Registradora() {
		
		return iMaquinaregDAO.findAll();
	}

	@Override
	public Maquina_Registradora guardarMaquina_Registradora(Maquina_Registradora maquina_Registradora) {
		
		return iMaquinaregDAO.save(maquina_Registradora);
	}


	@Override
	public Maquina_Registradora Maquina_Registradora_ID(Integer id_maquina) {
		
		return iMaquinaregDAO.findById(id_maquina).get(); 
	}

	@Override
	public Maquina_Registradora actualizarMaquina_Registradora(Maquina_Registradora maquina_Registradora) {
		
		return iMaquinaregDAO.save(maquina_Registradora);
	}

	@Override
	public void eliminarMaquina_Registradora(Integer id_maquina) {
		iMaquinaregDAO.deleteById(id_maquina);
		
	}


	

	

	
}
