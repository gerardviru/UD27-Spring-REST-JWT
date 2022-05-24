package UD27.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "venta")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id_venta")
	private Integer id_venta;
	
	@Column(name = "codigo_producto")
	private Integer codigo_producto;
	
	@Column(name = "id_maquina")
	private Integer id_maquina;
	
	
	@ManyToOne
	@JoinColumn(name = "codigo_cajero") 
	private Cajeros cajeros; 
	

	//Constructor Default
	public Venta() {
		
	}

	//Constructor
	public Venta(Integer id_venta, Integer codigo_producto, Integer id_maquina, Cajeros cajeros) {
		this.id_venta = id_venta;
		this.codigo_producto = codigo_producto;
		this.id_maquina = id_maquina;
		this.cajeros = cajeros;
	}

	
	//Getters & Setters

	public Integer getId_venta() {
		return id_venta;
	}

	public void setId_venta(Integer id_venta) {
		this.id_venta = id_venta;
	}

	public Integer getCodigo_producto() {
		return codigo_producto;
	}

	public void setCodigo_producto(Integer codigo_producto) {
		this.codigo_producto = codigo_producto;
	}

	public Integer getId_maquina() {
		return id_maquina;
	}

	public void setId_maquina(Integer id_maquina) {
		this.id_maquina = id_maquina;
	}

	public Cajeros getCajeros() {
		return cajeros;
	}

	public void setCajeros(Cajeros cajeros) {
		this.cajeros = cajeros;
	}

	@Override
	public String toString() {
		return "Venta [id_venta=" + id_venta + ", codigo_producto=" + codigo_producto + ", id_maquina=" + id_maquina
				+ ", cajeros=" + cajeros + "]";
	}
}
