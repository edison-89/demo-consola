package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.error("Prueba");
		LOG.error("Prueba 2");
	}

}
