package com.atsistemas.techfriday.microservices.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.atsistemas.techfriday.microservices.api.repository.RepositoryMarker;

@Configuration
@EnableJpaRepositories(basePackageClasses = RepositoryMarker.class)
public class RepositoryConfig {

}