package com.customer.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({""})
@ComponentScan({"com.customer.rest"})
public class RestCustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestCustomerApplication.class, args);
	}
}
