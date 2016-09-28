package com.atsistemas.techfriday.microservices.api.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atsistemas.techfriday.microservices.api.model.Persona;
import com.atsistemas.techfriday.microservices.api.repository.IPersonaRepository;
import com.atsistemas.techfriday.microservices.api.service.IPersonaService;

@Service
public class PersonaServiceImpl implements IPersonaService {

	/** The logger. */
	private final Logger logger = LoggerFactory.getLogger(PersonaServiceImpl.class);

	/** The Persona repository. */
	private final IPersonaRepository personaRepository;

	@Autowired
	public PersonaServiceImpl(IPersonaRepository personaRepository) {
		this.personaRepository = personaRepository;
	}

	@Override
	public Persona createPersona(String nombre, String apellido1, String apellido2) {

		logger.info("Guardar Persona en BBDD");

		Persona persona = new Persona();
		persona.setNombre(nombre);
		persona.setApellido1(apellido1);
		persona.setApellido2(apellido2);
		persona.setActivo(1);

		personaRepository.save(persona);
		logger.info("Persona guarda en BBDD. OK!");
		return persona;

	}

	@Override
	public Persona createPersona(Persona persona) {
		return this.createPersona(persona.getNombre(), persona.getApellido1(), persona.getApellido2());
	}

	@Override
	public Persona obtenerPersona(Integer id) {
		return personaRepository.findById(id);

	}

}
