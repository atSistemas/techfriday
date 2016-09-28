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
 * Clase Java para confirmationStatus.
 *
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * <p>
 *
 * <pre>
 * &lt;simpleType name="confirmationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "confirmationStatus")
@XmlEnum
public enum ConfirmationStatus {

	OK, ERROR;

	public String value() {
		return name();
	}

	public static ConfirmationStatus fromValue(String v) {
		return valueOf(v);
	}

}
