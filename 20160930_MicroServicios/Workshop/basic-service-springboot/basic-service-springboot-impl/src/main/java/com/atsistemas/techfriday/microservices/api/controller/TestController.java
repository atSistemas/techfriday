package com.atsistemas.techfriday.microservices.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The controller for the Persona Service
 */
@RestController
@RequestMapping(value = "/")
public class TestController {
	public String home() {

		final String mensaje = "Controller de Ejemplo para el TechFriday";

		return mensaje;
	}
}
