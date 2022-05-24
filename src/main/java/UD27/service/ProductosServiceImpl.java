package UD27.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD27.dao.IProductosDAO;
import UD27.dto.Productos;

@Service
public class ProductosServiceImpl implements IProductosService {

	@Autowired
	IProductosDAO iproductoDAO;

	@Override
	public List<Productos> listarProductos() {
		
		return iproductoDAO.findAll();
	}

	@Override
	public Productos guardarProductos(Productos productos) {
		
		return iproductoDAO.save(productos);
	}

	@Override
	public Productos productos_ID(Integer codigo_producto) {
		
		return iproductoDAO.findById(codigo_producto).get();
	}

	@Override
	public Productos actualizarProductos(Productos productos) {
		
		return iproductoDAO.save(productos);
	}

	@Override
	public void eliminarProductos(Integer codigo_producto) {
		iproductoDAO.deleteById(codigo_producto);
		
	}

	

	
}
