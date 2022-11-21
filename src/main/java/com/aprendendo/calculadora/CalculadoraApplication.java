package com.aprendendo.calculadora;

import com.aprendendo.calculadora.service.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculadoraApplication {

	private static CalculadoraService calculadoraService;

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraApplication.class, args);

		calculadoraService.teste();
	}


}
