package com.ajal.technology.test.pruebas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ajal.technology.test.pruebas.domain.Persona;
import com.ajal.technology.test.pruebas.repository.PersonaRepository;
import com.ajal.technology.test.pruebas.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Autowired PersonaRepository personaRepository;

	@Override
	public Persona save(Persona persona) {
		return personaRepository.save(persona);
	}

	@Override
	public Persona findById(Integer id) {
		return personaRepository.findById(id).get();
	}

	@Override
	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

}
