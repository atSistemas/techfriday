package com.atsistemas.techfriday.microservices.api.controller.factory.impl;

import org.springframework.stereotype.Component;

import com.atsistemas.techfriday.microservices.api.controller.factory.IConfirmationPayloadFactory;
import com.atsistemas.techfriday.microservices.api.controller.payload.confirmation.Confirmation;
import com.atsistemas.techfriday.microservices.api.controller.payload.confirmation.ConfirmationDetailStatus;
import com.atsistemas.techfriday.microservices.api.controller.payload.confirmation.ConfirmationStatus;
import com.atsistemas.techfriday.microservices.api.controller.payload.confirmation.ConfirmationText;
import com.atsistemas.techfriday.microservices.api.exception.PersonaServiceException;

/**
 * A factory for creating ConfirmationPayload objects.
 */
@Component
public class ConfirmationPayloadFactoryImpl implements IConfirmationPayloadFactory {

	@Override
	public Confirmation createConfirmation(Exception ex) {

		Confirmation confirmation = new Confirmation();

		confirmation.setConfirmationStatus(ConfirmationStatus.ERROR);
		confirmation.setConfirmationDetailStatus(ConfirmationDetailStatus.UNKNOWN_ERROR);
		ConfirmationText confirmationText = new ConfirmationText();
		confirmation.setConfirmationText(confirmationText);

		return confirmation;
	}

	@Override
	public Confirmation createConfirmation(ConfirmationStatus status, ConfirmationDetailStatus detailStatus) {

		Confirmation confirmation = new Confirmation();

		confirmation.setConfirmationStatus(status);
		confirmation.setConfirmationDetailStatus(detailStatus);
		ConfirmationText confirmationText = new ConfirmationText();
		confirmation.setConfirmationText(confirmationText);

		return confirmation;
	}

	@Override
	public Confirmation createConfirmation(PersonaServiceException ex) {

		Confirmation confirmation = new Confirmation();

		confirmation.setConfirmationStatus(ConfirmationStatus.ERROR);
		confirmation.setConfirmationDetailStatus(ConfirmationDetailStatus.valueOf(ex.getCode().toString()));
		ConfirmationText confirmationText = new ConfirmationText();
		confirmation.setConfirmationText(confirmationText);

		return confirmation;
	}

}
