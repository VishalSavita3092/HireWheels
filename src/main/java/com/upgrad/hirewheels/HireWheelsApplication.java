package com.upgrad.hirewheels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
//@EnableSwagger2
public class HireWheelsApplication {

	public static void main(String[] args) {

		SpringApplication.run(HireWheelsApplication.class, args);
	}
	/**
	 * Application Link
	 * http://localhost:8081/h2-console/
	 */

}
