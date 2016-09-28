//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen.
// Generado el: 2014.11.13 a las 04:17:40 PM CET
//

package com.atsistemas.techfriday.microservices.api.controller.payload.confirmation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para confirmationText complex type.
 *
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="confirmationText">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmationText", propOrder = { "text" })
public class ConfirmationText {

	protected String text;

	/**
	 * Obtiene el valor de la propiedad text.
	 *
	 * @return possible object is {@link String }
	 *
	 */
	public String getText() {
		return text;
	}

	/**
	 * Define el valor de la propiedad text.
	 *
	 * @param value
	 *            allowed object is {@link String }
	 *
	 */
	public void setText(String value) {
		this.text = value;
	}

}
