package com.example.demo.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@Column(name ="ID_producto", unique = true)
	private int ID_producto;
	@Column(name ="nombre")
	private String nombre;
	@Column(name ="tipo")
	private String tipo;
	@Column(name ="cantidad")
	private int cantidad;
	
	public Producto() {
		super();
	}

	public Producto(int iD_producto, String nombre, String tipo, int cantidad) {
		super();
		ID_producto = iD_producto;
		this.nombre = nombre;
		this.tipo = tipo;
		this.cantidad = cantidad;
	}

	public int getID_producto() {
		return ID_producto;
	}

	public void setID_producto(int iD_producto) {
		ID_producto = iD_producto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	
	
	
	
}
