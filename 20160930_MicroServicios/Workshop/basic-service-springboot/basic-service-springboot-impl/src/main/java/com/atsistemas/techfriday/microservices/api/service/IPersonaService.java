package com.atsistemas.techfriday.microservices.api.service;

import com.atsistemas.techfriday.microservices.api.model.Persona;

public interface IPersonaService {

	Persona createPersona(String nombre, String apellido1, String apellido2);

	Persona createPersona(Persona persona);

	Persona obtenerPersona(Integer id);

}
