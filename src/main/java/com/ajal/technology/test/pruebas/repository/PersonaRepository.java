package com.ajal.technology.test.pruebas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ajal.technology.test.pruebas.domain.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
