package com.calculadora.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.calculadora.controller"})
@SpringBootApplication
public class CalculadoraApplication {

	public static void main(String[] args) {
		System.out.println("Microservice Calculadora sendo inicializado");
		SpringApplication.run(CalculadoraApplication.class, args);
		System.out.println("Microservice Calculadora está iniciado");
	}

}
