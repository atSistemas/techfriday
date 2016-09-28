//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen.
// Generado el: 2014.11.13 a las 04:17:40 PM CET
//

package com.atsistemas.techfriday.microservices.api.controller.payload.confirmation;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * <p>
 * Clase Java para confirmation complex type.
 *
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 *
 * <pre>
 * &lt;complexType name="confirmation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confirmationText" type="{}confirmationText" minOccurs="0"/>
 *         &lt;element name="confirmationDetailStatus" type="{}confirmationDetailStatus" minOccurs="0"/>
 *         &lt;element name="confirmationStatus" type="{}confirmationStatus"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "confirmation", propOrder = { "confirmationText", "confirmationDetailStatus", "confirmationStatus" })
@JsonIgnoreProperties(ignoreUnknown = true)
public class Confirmation {

	protected ConfirmationText confirmationText;
	@XmlSchemaType(name = "string")
	protected ConfirmationDetailStatus confirmationDetailStatus;
	@XmlElement(required = true)
	@XmlSchemaType(name = "string")
	protected ConfirmationStatus confirmationStatus;

	/**
	 * Obtiene el valor de la propiedad confirmationText.
	 *
	 * @return possible object is {@link ConfirmationText }
	 *
	 */
	public ConfirmationText getConfirmationText() {
		return confirmationText;
	}

	/**
	 * Define el valor de la propiedad confirmationText.
	 *
	 * @param value
	 *            allowed object is {@link ConfirmationText }
	 *
	 */
	public void setConfirmationText(ConfirmationText value) {
		this.confirmationText = value;
	}

	/**
	 * Obtiene el valor de la propiedad confirmationDetailStatus.
	 *
	 * @return possible object is {@link ConfirmationDetailStatus }
	 *
	 */
	public ConfirmationDetailStatus getConfirmationDetailStatus() {
		return confirmationDetailStatus;
	}

	/**
	 * Define el valor de la propiedad confirmationDetailStatus.
	 *
	 * @param value
	 *            allowed object is {@link ConfirmationDetailStatus }
	 *
	 */
	public void setConfirmationDetailStatus(ConfirmationDetailStatus value) {
		this.confirmationDetailStatus = value;
	}

	/**
	 * Obtiene el valor de la propiedad confirmationStatus.
	 *
	 * @return possible object is {@link ConfirmationStatus }
	 *
	 */
	public ConfirmationStatus getConfirmationStatus() {
		return confirmationStatus;
	}

	/**
	 * Define el valor de la propiedad confirmationStatus.
	 *
	 * @param value
	 *            allowed object is {@link ConfirmationStatus }
	 *
	 */
	public void setConfirmationStatus(ConfirmationStatus value) {
		this.confirmationStatus = value;
	}

}
