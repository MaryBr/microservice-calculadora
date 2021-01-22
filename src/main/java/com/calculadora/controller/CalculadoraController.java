package com.calculadora.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.calculadora.exception.UnsuportedMathOperationException;
import com.calculadora.util.CalculadoraUtil;

@RestController
public class CalculadoraController extends CalculadoraUtil{

	@RequestMapping(value="/soma/{num1}/{num2}", method=RequestMethod.GET)//os parametros ficam entre chaves
	public Double soma (@PathVariable("num1") String num1, @PathVariable("num2") String num2) throws Exception {

		if (!isNumerico(num1) || !isNumerico(num2)) {	
			throw new UnsuportedMathOperationException("Insira um valor numérico: ");
		}
		
		Double soma =  convertToDouble(num1)+convertToDouble(num2);
		return soma;
	}

	@RequestMapping(value="/subtracao/{num1}/{num2}", method=RequestMethod.GET)
	public Double subtracao (@PathVariable("num1") String num1, @PathVariable("num2") String num2) throws Exception {
		
		if (!isNumerico(num1) || !isNumerico(num2)) {
			throw new UnsuportedMathOperationException("Insira um valor numérico: ");
		}
		
		return  convertToDouble(num1)-convertToDouble(num2);
		
	}
	@RequestMapping(value="/multiplicacao/{num1}/{num2}", method=RequestMethod.GET)
	public Double multiplicacao (@PathVariable("num1") String num1, @PathVariable("num2") String num2) throws Exception {
		
		if (!isNumerico(num1) || !isNumerico(num2)) {
			throw new UnsuportedMathOperationException("Insira um valor numérico: ");
		}
		
		return convertToDouble(num1)*convertToDouble(num2);
		
	}
	
	@RequestMapping(value="/divisao/{num1}/{num2}", method=RequestMethod.GET)
	public Double divisao (@PathVariable("num1") String num1, @PathVariable("num2") String num2) throws Exception {
		
		if(num2.equals("0")) {
			throw new UnsuportedMathOperationException("Insira um valor numérico diferente de 0: ");
		}
		else if (!isNumerico(num1) || !isNumerico(num2)) {
			throw new UnsuportedMathOperationException("Insira um valor numérico: ");
		}
		
		return convertToDouble(num1)/convertToDouble(num2);
		
	}
	
	@RequestMapping(value="/media/{num1}/{num2}", method=RequestMethod.GET)
	public Double media (@PathVariable("num1") String num1, @PathVariable("num2") String num2)throws Exception {
		
		if (!isNumerico(num1) || !isNumerico(num2)) {
			throw new UnsuportedMathOperationException("Insira um valor numérico: ");
		}
					
		return (convertToDouble(num1)+convertToDouble(num2))/2;
		
	}
	
	@RequestMapping(value="/raiz/{num1}", method=RequestMethod.GET)
	public Double raiz (@PathVariable("num1") String num1) throws Exception{
		
		if (!isNumerico(num1)) {
			throw new UnsuportedMathOperationException("Insira um valor numérico: ");
		}
					
		return   Math.sqrt(convertToDouble(num1));
	}
	
}
