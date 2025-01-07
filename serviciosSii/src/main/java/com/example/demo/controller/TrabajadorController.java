package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entity.Trabajador;
import com.example.demo.models.service.TrabajadorService;

@RestController
@RequestMapping("/api/trabajador")
public class TrabajadorController {

	@Autowired
	TrabajadorService trabajadorService;
	
	@PostMapping
	public Trabajador guardar(@RequestBody Trabajador T) {
		
		return trabajadorService.save(T);
		
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Trabajador trabajador){
		
		String mensaje=trabajadorService.login(trabajador.getUsuario(), trabajador.getContraseña());
		return ResponseEntity.ok(mensaje);
		
	}
	
	
}
