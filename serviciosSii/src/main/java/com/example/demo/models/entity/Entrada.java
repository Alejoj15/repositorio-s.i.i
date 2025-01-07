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
@Table(name = "entrada")
public class Entrada {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ID_entrada")
	private int ID_entrada;
	@ManyToOne
	@JoinColumn(name = "producto_id", nullable = false)
	private Producto producto;
	@Column(name ="cantidad")
	private int cantidad;
	@Column(name ="fecha")
	private LocalDate fecha;
	
	public Entrada() {
		super();
	}

	public Entrada(int iD_entrada, Producto producto, int cantidad, LocalDate fecha) {
		super();
		ID_entrada = iD_entrada;
		this.producto = producto;
		this.cantidad = cantidad;
		this.fecha = fecha;
	}

	public int getID_entrada() {
		return ID_entrada;
	}

	public void setID_entrada(int iD_entrada) {
		ID_entrada = iD_entrada;
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
