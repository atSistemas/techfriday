package com.atsistemas.techfriday.microservices.api.controller.factory;

import com.atsistemas.techfriday.microservices.api.controller.payload.confirmation.Confirmation;
import com.atsistemas.techfriday.microservices.api.controller.payload.confirmation.ConfirmationDetailStatus;
import com.atsistemas.techfriday.microservices.api.controller.payload.confirmation.ConfirmationStatus;
import com.atsistemas.techfriday.microservices.api.exception.PersonaServiceException;

/**
 * A factory for creating IConfirmationPayload objects.
 */
public interface IConfirmationPayloadFactory {

	/**
	 * Creates a new IConfirmationPayload object.
	 *
	 * @param ex
	 *            the ex
	 * @return the confirmation
	 */
	Confirmation createConfirmation(Exception ex);

	/**
	 * Creates a new IConfirmationPayload object.
	 *
	 * @param ex
	 *            the ex
	 * @return the confirmation
	 */
	Confirmation createConfirmation(PersonaServiceException ex);

	/**
	 * Creates a new IConfirmationPayload object.
	 *
	 * @param status
	 *            the status
	 * @param detailStatus
	 *            the detail status
	 * @return the confirmation
	 */
	Confirmation createConfirmation(ConfirmationStatus status, ConfirmationDetailStatus detailStatus);

}
