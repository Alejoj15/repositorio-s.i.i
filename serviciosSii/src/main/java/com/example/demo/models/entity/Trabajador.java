package com.example.demo.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trabajador")
public class Trabajador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_Trabajador")	
	private int ID_Trabajador;
	@Column(name = "usuario")
	private String usuario;
	@Column(name = "contraseña")
	private String contraseña;
	
	
	public Trabajador() {
		super();
	}


	public Trabajador(int iDTrabajador, String usuario, String contraseña) {
		super();
		ID_Trabajador = iDTrabajador;
		this.usuario = usuario;
		this.contraseña = contraseña;
	}


	public int getIDTrabajador() {
		return ID_Trabajador;
	}


	public void setIDTrabajador(int iDTrabajador) {
		ID_Trabajador = iDTrabajador;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	
	
	
	
	
	
}
