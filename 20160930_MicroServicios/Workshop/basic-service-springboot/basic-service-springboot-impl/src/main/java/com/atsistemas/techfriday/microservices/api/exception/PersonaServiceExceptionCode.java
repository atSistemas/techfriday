package com.atsistemas.techfriday.microservices.api.exception;

/**
 * The Enum PersonaServiceExceptionCode. Represents different types of error
 * codes
 */
public enum PersonaServiceExceptionCode {

	/** Message unknown. */
	MESSAGE_UNKNOWN("MESSAGE_UNKNOWN"),
	/** Unknown error. */
	UNKNOWN_ERROR("UNKNOWN_ERROR"), /** Cancel accepted. */
	/** Job already finished. */
	JOB_ALREADY_FINISHED("JOB_ALREADY_FINISHED"),
	/** Persona created. */
	PERSONA_CREATED("PERSONA_CREATED"),
	/** Persona not created. */
	PERSONA_NOT_CREATED("PERSONA_NOT_CREATED"),
	/** Persona unknown. */
	PERSONA_UNKNOWN("PERSONA_UNKNOWN"),

	SYSTEM_MAINTENANCE("SYSTEM_MAINTENANCE");

	private final String value;

	/**
	 * Instantiates a new persona service exception code.
	 *
	 * @param v
	 *            the v
	 */
	PersonaServiceExceptionCode(String v) {
		value = v;
	}

	/**
	 * Value.
	 *
	 * @return the string
	 */
	public String value() {
		return value;
	}

	/**
	 * From value.
	 *
	 * @param v
	 *            the value
	 * @return the persona service exception code
	 */
	public static PersonaServiceExceptionCode fromValue(String v) {
		for (PersonaServiceExceptionCode c : PersonaServiceExceptionCode.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
