package com.ajal.technology.test.pruebas.service;

import java.util.List;

import com.ajal.technology.test.pruebas.domain.Persona;

public interface PersonaService {

	public Persona save(Persona persona);

	public Persona findById(Integer id);

	public List<Persona> findAll();
}
