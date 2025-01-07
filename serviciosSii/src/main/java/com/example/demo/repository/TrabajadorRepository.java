package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.entity.Trabajador;


@Repository
public interface TrabajadorRepository extends JpaRepository<Trabajador,Integer>{
	
	Trabajador findByUsuario (String user);
	
}
