package UD27.service;

import java.util.List;
import UD27.dto.Cajeros;

public interface ICajeroService {

	// Metodos del CRUD
	public List<Cajeros> listarCajeros(); // Listar All

	public Cajeros guardarCajeros(Cajeros cajeros); // Guarda un Curso CREATE

	public Cajeros cajeros_ID(Integer codigo_cajero); // Leer datos de un Curso READ

	public Cajeros actualizarCajeros(Cajeros cajeros); // Actualiza datos del Curso UPDATE

	public void eliminarCajeros(Integer codigo_cajero);// Elimina el Curso DELETE

}
