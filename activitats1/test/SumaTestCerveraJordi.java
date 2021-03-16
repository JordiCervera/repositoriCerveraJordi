package uf2.activitats1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uf2.activitat1.exercicis.SumaCerveraJordi;


class SumaTestCerveraJordi {
	
	@Test
	public void SumaTest() {
		SumaCerveraJordi tester = new SumaCerveraJordi();
		assertEquals("10+5 tiene que ser 15", 15,tester.sumar(10,5));
		assertEquals("5+10 tiene que ser 15", 15,tester.sumar(5,10));
		assertEquals("0+5 tiene que ser 15", 15,tester.sumar(0,5));
	}

}

