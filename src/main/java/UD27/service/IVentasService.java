package UD27.service;

import java.util.List;
import UD27.dto.Venta;

public interface IVentasService {

	// Metodos del CRUD
	public List<Venta> listarVenta(); // Listar All

	public Venta guardarVenta(Venta venta); // Guarda un Curso CREATE

	public Venta Venta_ID(Integer id_venta); // Leer datos de un Curso READ

	public Venta actualizarVenta(Venta venta); // Actualiza datos del Curso UPDATE

	public void eliminarVenta(Integer id_venta);// Elimina el Curso DELETE
}
