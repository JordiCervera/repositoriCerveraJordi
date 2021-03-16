package uf2.activitats1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import uf2.activitat1.exercicis.MultiplicaCerveraJordi;


class MultiplicaTestCerveraJordi {
	
	@Test
	public void MultiplicaTest() {
		MultiplicaCerveraJordi tester = new MultiplicaCerveraJordi();
		assertEquals("10*5 tiene que ser 50", 15,tester.multiplica(10,5));
		assertEquals("5*10 tiene que ser 50", 15,tester.multiplica(5,10));
		assertEquals("0*5 tiene que ser 0", 15,tester.multiplica(0,5));
	}

}