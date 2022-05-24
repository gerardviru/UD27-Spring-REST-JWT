package UD27.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import UD27.dto.Productos;

public interface IProductosDAO extends JpaRepository<Productos, Integer>{

}
