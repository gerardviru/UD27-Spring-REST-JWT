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
@Table(name = "maquinaRegistradora")

public class Maquina_Registradora {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "id_maquina")
	private Integer id_maquina;

	@Column(name = "piso")
	private Integer piso;
	
	@OneToMany
	@JoinColumn(name = "id_maquina")
	private List<Venta> venta;

	
	//Constructor Default
	public Maquina_Registradora() {
		
	}


	//Constructor
	public Maquina_Registradora(Integer id_maquina, Integer piso, List<Venta> venta) {
		
		this.id_maquina = id_maquina;
		this.piso = piso;
		this.venta = venta;
	}

	//Getters & Setters
	
	
	public Integer getId_maquinaReg() {
		return id_maquina;
	}


	public void setId_maquinaReg(Integer id_maquina) {
		this.id_maquina = id_maquina;
	}


	public Integer getPiso() {
		return piso;
	}


	public void setPiso(Integer piso) {
		this.piso = piso;
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
		return "Maquina_Registradora [id_maquina=" + id_maquina + ", piso=" + piso + ", venta=" + venta + "]";
	}

}
