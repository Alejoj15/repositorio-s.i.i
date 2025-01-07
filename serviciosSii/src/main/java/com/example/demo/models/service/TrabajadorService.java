package com.example.demo.models.service;

import com.example.demo.models.entity.Trabajador;

public interface TrabajadorService {

	public Trabajador save(Trabajador T);
	public String login(String user , String ctr);

	
}
