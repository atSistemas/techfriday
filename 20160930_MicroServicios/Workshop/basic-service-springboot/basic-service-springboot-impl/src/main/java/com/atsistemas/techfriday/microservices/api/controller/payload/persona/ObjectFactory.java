//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen.
// Generado el: 2016.09.26 a las 09:07:32 AM CEST
//

package com.atsistemas.techfriday.microservices.api.controller.payload.persona;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the
 * com.atsistemas.techfriday.microservices.api.controller.payload.persona
 * package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

	private static final QName _Payloadpersona_QNAME = new QName("", "payloadpersona");


	/**
	 * Create an instance of {@link PayloadPersona }
	 *
	 */
	public PayloadPersona createPersona() {
		return new PayloadPersona();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link PayloadPersona
	 * }{@code >}}
	 *
	 */
	@XmlElementDecl(namespace = "", name = "payloadpersona")
	public JAXBElement<PayloadPersona> createPayloadpersona(PayloadPersona value) {
		return new JAXBElement<>(_Payloadpersona_QNAME, PayloadPersona.class, null, value);
	}

}
