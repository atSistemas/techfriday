package com.atsistemas.techfriday.microservices.api.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.atsistemas.techfriday.microservices.api.model.Persona;

public interface IPersonaRepository extends CrudRepository<Persona, Long> {

	Persona findById(Integer id);

	List<Persona> findByActivo(Integer activo);
}
