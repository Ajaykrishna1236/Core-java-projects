package com.example.tesla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TeslaApplication {

	public static void main(String[] args) {
	ApplicationContext	context=SpringApplication.run(TeslaApplication.class, args);

	 Alien obj =context.getBean(Alien.class);
	 obj.build();

	}

}
