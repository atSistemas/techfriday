package com.atsistemas.techfriday.microservices.api.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.atsistemas.techfriday.microservices.api.controller.factory.IConfirmationPayloadFactory;
import com.atsistemas.techfriday.microservices.api.controller.factory.IPersonaFactory;
import com.atsistemas.techfriday.microservices.api.controller.payload.confirmation.Confirmation;
import com.atsistemas.techfriday.microservices.api.controller.payload.persona.PayloadPersona;
import com.atsistemas.techfriday.microservices.api.exception.PersonaServiceException;
import com.atsistemas.techfriday.microservices.api.model.Persona;
import com.atsistemas.techfriday.microservices.api.service.IPersonaService;

/**
 * The controller for the Persona Service
 */
@RestController
@RequestMapping(value = "/Persona")
public class PersonaController {

	/** The persona factory. */
	private final IPersonaFactory personaFactory;

	/** The Persona service. */
	private final IPersonaService personaService;

	/** The confirmation factory. */
	private final IConfirmationPayloadFactory confirmationFactory;

	/** The logger. */
	private final Logger logger = LoggerFactory.getLogger(PersonaController.class);

	/**
	 * Instantiates a new authorization service3rd party controller.
	 *
	 * @param personaFactory
	 *            the persona factory
	 */
	@Autowired
	public PersonaController(IPersonaService personaService, IPersonaFactory personaFactory, IConfirmationPayloadFactory confirmationFactory) {
		this.personaFactory = personaFactory;
		this.personaService = personaService;
		this.confirmationFactory = confirmationFactory;

	}

	/**
	 * Creates the job.
	 *
	 * @param nombre
	 *            the nombre
	 * @param apellido1
	 *            the apellido1
	 * @param apellido2
	 *            the apellido2
	 * @return the http entity
	 * @throws PersonaServiceException
	 *             the authorization service exception
	 */

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public HttpEntity<Persona> createPersona(@RequestBody PayloadPersona payloadPersona) throws PersonaServiceException {

		logger.info("Create Persona request {}, {}, {}", payloadPersona.getNombre(), payloadPersona.getApellido1(), payloadPersona.getApellido2());

		// creacion de la persona
		Persona persona = personaFactory.create(payloadPersona.getNombre(), payloadPersona.getApellido1(), payloadPersona.getApellido2());
		persona = personaService.createPersona(persona);
		return new ResponseEntity<>(persona, HttpStatus.CREATED);

	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Persona> buscarPersona(@PathVariable Integer id) throws PersonaServiceException {

		Persona persona = personaService.obtenerPersona(id);
		if (persona==null){
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(persona, HttpStatus.ACCEPTED);

	}

	/**
	 * Handle business exception.
	 *
	 * @param req
	 *            the req
	 * @param ex
	 *            the ex
	 * @return the confirmation
	 */
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(PersonaServiceException.class)
	@ResponseBody
	Confirmation handleBusinessException(HttpServletRequest req, PersonaServiceException ex) {

		return confirmationFactory.createConfirmation(ex);
	}

	/**
	 * Handle exception.
	 *
	 * @param req
	 *            the req
	 * @param ex
	 *            the ex
	 * @return the confirmation
	 */
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(Exception.class)
	@ResponseBody
	Confirmation handleException(HttpServletRequest req, Exception ex) {
		logger.error("UNHANDLED EXCEPTION", ex);
		return confirmationFactory.createConfirmation(ex);
	}

}
