package com.example.demo.models.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "salida")
public class Salida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID_salida")
	private int ID_salida;
	@ManyToOne
	@JoinColumn(name = "producto_id", nullable = false)
	private Producto producto;
	@Column(name ="cantidad")
	private int cantidad;
	@Column(name ="fecha")
	private LocalDate fecha;
	
	public Salida() {
		super();
	}

	public Salida(int iD_salida, Producto producto, int cantidad, LocalDate fecha) {
		super();
		ID_salida = iD_salida;
		this.producto = producto;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}

	public int getID_salida() {
		return ID_salida;
	}

	public void setID_salida(int iD_salida) {
		ID_salida = iD_salida;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	
	
}
