package com.atsistemas.techfriday.microservices.api.controller.factory.impl;

import org.springframework.stereotype.Component;

import com.atsistemas.techfriday.microservices.api.controller.factory.IPersonaFactory;
import com.atsistemas.techfriday.microservices.api.controller.payload.persona.PayloadPersona;
import com.atsistemas.techfriday.microservices.api.model.Persona;

/**
 * The implementation for IPersonaFactory
 */
@Component
public class PersonaFactoryImpl implements IPersonaFactory {

	/**
	 * Instantiates a new persona factory impl.
	 *
	 */

	@Override
	public Persona create(PayloadPersona personaPayload) {

		if (personaPayload == null) {
			return null;
		}

		Persona persona = new Persona();

		persona.setId(personaPayload.getPersonaId());
		persona.setNombre(personaPayload.getNombre());
		persona.setApellido1(personaPayload.getApellido1());
		persona.setApellido2(personaPayload.getApellido2());
		persona.setActivo(personaPayload.getActivo());

		return persona;
	}

	@Override
	public Persona create(String nombre, String apellido1, String apellido2) {
		Persona persona = new Persona();

		persona.setNombre(nombre);
		persona.setApellido1(apellido1);
		persona.setApellido2(apellido2);
		return persona;
	}

}
