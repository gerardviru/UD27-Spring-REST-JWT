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
@Table(name = "cajeros")

public class Cajeros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "codigo_cajero")
	private Integer codigo_cajero;

	@Column(name = "nom_apels")
	private String nom_apels;

	@OneToMany
	@JoinColumn(name = "codigo_cajero")
	private List<Venta> venta;

	// Constructor Default
	public Cajeros() {

	}

	// Constructor
	public Cajeros(Integer codigo_cajero, String nom_apels, List<Venta> venta) {
		this.codigo_cajero = codigo_cajero;
		this.nom_apels = nom_apels;
		this.venta = venta;
	}

	// Getters & Setters


	public Integer getCodigo_cajero() {
		return codigo_cajero;
	}

	public void setCodigo_cajero(Integer codigo_cajero) {
		this.codigo_cajero = codigo_cajero;
	}

	public String getNom_apels() {
		return nom_apels;
	}

	public void setNom_apels(String nom_apels) {
		this.nom_apels = nom_apels;
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
		return "Cajeros [id_cajero=" + codigo_cajero + ", nombreApellidos=" + nom_apels + ", venta=" + venta + "]";
	}

}
