package UD27.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD27.dao.ICajerosDAO;
import UD27.dto.Cajeros;

@Service
public class CajeroServiceImpl implements ICajeroService{

	@Autowired
	ICajerosDAO icajeroDAO;

	@Override
	public List<Cajeros> listarCajeros() {
		
		return icajeroDAO.findAll();
	}

	@Override
	public Cajeros guardarCajeros(Cajeros cajeros) {
		
		return icajeroDAO.save(cajeros);
	}

	@Override
	public Cajeros cajeros_ID(Integer codigo_cajero) {
		
		return icajeroDAO.findById(codigo_cajero).get();
	}

	@Override
	public Cajeros actualizarCajeros(Cajeros cajeros) {
		
		return icajeroDAO.save(cajeros);
	}

	@Override
	public void eliminarCajeros(Integer codigo_cajero) {
		icajeroDAO.deleteById(codigo_cajero);
		
	}
	
}
