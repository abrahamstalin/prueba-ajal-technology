package com.ajal.technology.test.pruebas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ajal.technology.test.pruebas.domain.Persona;
import com.ajal.technology.test.pruebas.service.PersonaService;

@RestController
public class PersonaResource {

	@Autowired PersonaService personaService;
	
	@PostMapping
	public Persona save(Persona persona) {
		return personaService.save(persona);
	}

	@GetMapping("by-id")
	public Persona findById(Integer id) {
		return personaService.findById(id);
	}

	@GetMapping
	public List<Persona> findAll() {
		return personaService.findAll();
	}
}
