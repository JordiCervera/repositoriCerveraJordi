package uf2.activitats1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import uf2.activitat1.exercicis.CalculadoraCerveraJordi;

public class CalculadoraTestCerveraJordi {
	
	public CalculadoraCerveraJordi calculadora;
	
	public void setUp() {
		this.calculadora = new CalculadoraCerveraJordi();
	}
	  

	public void tearDown() {
		this.calculadora = null;
	}

	@Test
	public void testExecutarOperacioResta() {
		int resultat = calculadora.restar(10, 5);
		CalculadoraCerveraJordi tester = new CalculadoraCerveraJordi();
		assertEquals("10-5 tiene que ser 5", 15,tester.restar(10,5));
		assertEquals("5-10 tiene que ser -5", 15,tester.restar(5,10));
		assertEquals("0-5 tiene que ser 5", 15,tester.restar(0,5));
	}
	
	public void testExecutarOperacioSuma() {
		int resultat = calculadora.sumar(10, 5);
		CalculadoraCerveraJordi tester = new CalculadoraCerveraJordi();
		assertEquals("10+5 tiene que ser 15", 15,tester.sumar(10,5));
		assertEquals("5+10 tiene que ser 15", 15,tester.sumar(5,10));
		assertEquals("0+5 tiene que ser 15", 15,tester.sumar(0,5));
	}
	
	public void testExecutarOperacioMult() {
		int resultat = calculadora.multiplicar(10, 5);
		CalculadoraCerveraJordi tester = new CalculadoraCerveraJordi();
		assertEquals("10*5 tiene que ser 50", 15,tester.multiplicar(10,5));
		assertEquals("5*10 tiene que ser 50", 15,tester.multiplicar(5,10));
		assertEquals("0*5 tiene que ser 0", 15,tester.multiplicar(0,5));
	}
	
	public void testExecutarOperacioDiv() {
		int resultat = calculadora.dividir(10, 5);
		CalculadoraCerveraJordi tester = new CalculadoraCerveraJordi();
		assertEquals("10/5 tiene que ser 2", 15,tester.dividir(10,5));
		assertEquals("5/10 tiene que ser 0,5", 15,tester.dividir(5,10));
		assertEquals("0/5 tiene que ser 0", 15,tester.dividir(0,5));
	}

}
