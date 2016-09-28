package com.atsistemas.techfriday.microservices.api.exception;

/**
 * The Class AuthorizationServiceException.
 */
public class PersonaServiceException extends Exception {

	private static final long serialVersionUID = 881390104355042221L;

	/** Persona Service exception code. */
	private final PersonaServiceExceptionCode code;

	/**
	 * Instantiates a new persona service exception.
	 *
	 * @param code
	 *            the code
	 */
	public PersonaServiceException(PersonaServiceExceptionCode code) {
		super();
		this.code = code;
	}

	/**
	 * Instantiates a new persona service exception.
	 *
	 * @param code
	 *            the code
	 * @param cause
	 *            the cause
	 */
	public PersonaServiceException(PersonaServiceExceptionCode code, Throwable cause) {
		super(cause);
		this.code = code;
	}

	/**
	 * Instantiates a new persona service exception.
	 *
	 * @param code
	 *            the code
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public PersonaServiceException(PersonaServiceExceptionCode code, String message, Throwable cause) {
		super(message, cause);
		this.code = code;
	}

	/**
	 * Instantiates a new persona service exception.
	 *
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public PersonaServiceException(String message, Throwable cause) {
		super(message, cause);

		this.code = PersonaServiceExceptionCode.UNKNOWN_ERROR;
	}

	/**
	 * Gets the code.
	 *
	 * @return the code
	 */
	public PersonaServiceExceptionCode getCode() {
		return code;
	}

}
