package UD27.service;

import java.util.List;
import UD27.dto.Maquina_Registradora;


public interface IMaquinaRegService {

	
	// Metodos del CRUD
	public List<Maquina_Registradora> listarMaquina_Registradora(); // Listar All

	public Maquina_Registradora guardarMaquina_Registradora(Maquina_Registradora maquina_Registradora); // Guarda un Curso CREATE

	public Maquina_Registradora Maquina_Registradora_ID(Integer id_maquina); // Leer datos de un Curso READ

	public Maquina_Registradora actualizarMaquina_Registradora(Maquina_Registradora maquina_Registradora); // Actualiza datos del Curso UPDATE

	public void eliminarMaquina_Registradora(Integer id_maquina);// Elimina el Curso DELETE
}
