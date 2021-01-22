
package com.calculadora.application;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.calculadora.controller.CalculadoraController;

class CalculadoraApplicationTest {

	@Test
	void test() {
				
		boolean resultadoEsperadoBoolean = true;
		boolean resultadoObtidoNumerico = CalculadoraController.isNumerico("8");
			
		assertEquals(resultadoEsperadoBoolean,resultadoObtidoNumerico);		
		assertEquals(78.0, CalculadoraController.convertToDouble("78"));
		
		assertNotEquals(78, CalculadoraController.convertToDouble("7%8"));
		assertNotEquals(resultadoEsperadoBoolean, CalculadoraController.isNumerico("soma"));		
				
	}

}
