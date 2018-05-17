package org.tesji.estoico.operaciones;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 * @author Alejandro
 *Prueba de funcionalidad de una calculadora
 *debe tomar suma, resta y multiplicacion
 *con dos digitos
 *
 */
public class CalculadoraTest {

	/*
	 * Prueba de Sumar dos numeros 
	 */
	@Test
	public void sumarTest()
	{
		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.sumar(10, 15);
        assertEquals(resultado, 25);	
	}
	
	/*
	 * Prueba de restar dos numeros
	 */
	@Test
	public void  restaTest()
	{
		
		Calculadora calculadora=new Calculadora();
		int resultado = calculadora.restar(15,5);
		assertEquals(resultado,10);
	
	}
	
	/*
	 * Prueba de multiplicar dos numeros
	 */
	@Test
	public void multiplicarTest()
	{
	Calculadora calculadora= new Calculadora();
	int resultado = calculadora.multiplicar(5,10);
	assertEquals(resultado, 50);
	}
	
}
