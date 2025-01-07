package com.example.demo.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.entity.Trabajador;
import com.example.demo.repository.TrabajadorRepository;

@Service
public class TrabajadorServiceImpl implements TrabajadorService{

	
	@Autowired
	TrabajadorRepository trabajadorRepository;
	
	
	@Override
	public Trabajador save(Trabajador T) {
		// TODO Auto-generated method stub
		return trabajadorRepository.save(T);
	}

	@Override
	public String login(String user, String ctr) {
		// TODO Auto-generated method stub
		
		Trabajador trabajador= trabajadorRepository.findByUsuario(user);
		if(trabajador==null) {
			
			return "usuario no encontrado";
			
			
		}
		
		if(!trabajador.getContraseña().equals(ctr)) {
			
			
			return "contraseña incorrecta";
			
			
		}
		
		
		return "inicio de sesion exitoso";
	}

	
	
	
	
}
