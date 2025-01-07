package com.example.demo.models.service;

import java.util.List;

import com.example.demo.models.entity.Producto;

public interface ProductoService {

	public Producto crearProducto(Producto producto);

	public List<Producto> obtenerTodosLosProductos();

	public Producto obtenerProductoPorId(int id);

	public Producto actualizarProducto(int id, Producto producto);

	public void eliminarProducto(int id);
	
	
	
}
