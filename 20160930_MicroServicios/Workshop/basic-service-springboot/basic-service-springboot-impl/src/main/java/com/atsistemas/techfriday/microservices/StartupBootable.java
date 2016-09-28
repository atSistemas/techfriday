package com.atsistemas.techfriday.microservices;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class StartupBootable {

	/**
	 * The main method to start the boot application.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(final String[] args) {
		new SpringApplicationBuilder(StartupBootable.class).web(true).run(args);
	}

}
