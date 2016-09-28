package com.atsistemas.techfriday.microservices.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.atsistemas.techfriday.microservices.api.model.Persona;
import com.atsistemas.techfriday.microservices.config.AppRibbonConfiguration;

/**
 * The controller for the Persona Service
 */
@RestController
@RequestMapping(value = "/PersonaCRM")
@RibbonClient(name = "asic-service-techfriday-develop", configuration = AppRibbonConfiguration.class)
public class CRMController {

	@LoadBalanced
	@Bean
	RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> buscarPersona(@PathVariable Integer id) {

		Persona persona = this.restTemplate.getForObject("http://basic-service-techfriday-develop/Persona/{id}", Persona.class, id);
		// Persona persona =
		// this.restTemplate.getForObject("http://localhost:8888/Persona/{id}",
		// Persona.class, id);

		String respuesta = "";
		if (persona != null) {
			respuesta = String.format("Persona encontrada!, %s-%s-%s", persona.getNombre(), persona.getApellido1(), persona.getApellido2());
		} else {
			respuesta = "Persona no encontrada!!!";
		}

		return new ResponseEntity<>(respuesta, HttpStatus.ACCEPTED);

	}

}
