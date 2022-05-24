package UD27.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "productos")

public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "codigo_producto")
	private Integer codigo_producto;

	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Precio")
	private int precio;
	
	@OneToMany
	@JoinColumn(name = "codigo_producto")
	private List<Venta> venta;

	
	// Constructor Default
	
	public Productos() {
		
	}

	// Constructor

	public Productos(Integer codigo_producto, String nombre, int precio, List<Venta> venta) {
		this.codigo_producto = codigo_producto;
		this.nombre = nombre;
		this.precio = precio;
		this.venta = venta;
	}
	
	// Setters & Getters

	public Integer getId_productos() {
		return codigo_producto;
	}

	public void setId_productos(Integer codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "venta")
	public List<Venta> getVenta() {
		return venta;
	}
	
	@Override
	public String toString() {
		return "Productos [codigo_producto=" + codigo_producto + ", nombre=" + nombre + ", precio=" + precio + ", venta="
				+ venta + "]";
	}
	
}
