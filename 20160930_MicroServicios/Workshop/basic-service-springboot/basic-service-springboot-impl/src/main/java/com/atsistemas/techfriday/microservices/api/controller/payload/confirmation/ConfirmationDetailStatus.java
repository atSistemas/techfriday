//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen.
// Generado el: 2014.11.13 a las 04:17:40 PM CET
//

package com.atsistemas.techfriday.microservices.api.controller.payload.confirmation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para confirmationDetailStatus.
 *
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 *
 * <pre>
 * &lt;simpleType name="confirmationDetailStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MESSAGE_UNKNOWN"/>
 *     &lt;enumeration value="UNKNOWN_ERROR"/>
 *     &lt;enumeration value="PERSONA_CREATED"/>
 *     &lt;enumeration value="PERSONA_NOT_CREATED"/>
 *     &lt;enumeration value="PERSONA_UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "confirmationDetailStatus")
@XmlEnum
public enum ConfirmationDetailStatus {

	MESSAGE_UNKNOWN("MESSAGE_UNKNOWN"), UNKNOWN_ERROR("UNKNOWN_ERROR"), PERSONA_CREATED("PERSONA_CREATED"), PERSONA_NOT_CREATED("PERSONA_NOT_CREATED"), PERSONA_UNKNOWN("PERSONA_UNKNOWN"), LISTADO_OBTENIDO("LISTADO_OBTENIDO");
	private final String value;

	ConfirmationDetailStatus(String v) {
		value = v;
	}

	public String value() {
		return value;
	}

	public static ConfirmationDetailStatus fromValue(String v) {
		for (ConfirmationDetailStatus c : ConfirmationDetailStatus.values()) {
			if (c.value.equals(v)) {
				return c;
			}
		}
		throw new IllegalArgumentException(v);
	}

}
