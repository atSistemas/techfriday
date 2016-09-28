package com.atsistemas.techfriday.microservices.api.controller.factory;

import com.atsistemas.techfriday.microservices.api.controller.payload.persona.PayloadPersona;
import com.atsistemas.techfriday.microservices.api.model.Persona;

/**
 * A factory for creating IPersona objects.
 */
public interface IPersonaFactory {

	/**
	 * Creates the persona with payload info.
	 *
	 * @param personaPayload
	 *            the persona payload
	 * @return the com.atsistemas.examples.jpa.model.Persona
	 */
	Persona create(PayloadPersona personaPayload);

	/**
	 * Creates the persona without payload info.
	 *
	 * @param nombre
	 *            the nombre
	 * @param apellido1
	 *            the apellido1
	 * @param apellido2
	 *            the apellido2
	 * @return the com.atsistemas.examples.jpa.model.Persona
	 */
	Persona create(String nombre, String apellido1, String apellido2);

}
