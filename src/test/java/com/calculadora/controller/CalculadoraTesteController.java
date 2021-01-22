package com.calculadora.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.calculadora.controller.CalculadoraController;


class CalculadoraTesteController {

	private MockMvc mockMvc;
	
	@Autowired
	private CalculadoraController calculadoraController;
	
	@Before
	public void setUp() {/*o método setUp vai ser executado antes de qualquer método que vamos ter nesta classe de testes,
	 exemplo: se tivermos dois testes antes ele vai passar pelo método setUp.*/
		
		this.mockMvc=MockMvcBuilders.standaloneSetup(calculadoraController).build();
		
	}
	@Test
	void testeSoma() {

	}

}
