package uf2.activitat2.refaccio;

public class FactorialCerveraJordi {
	public static double factorial (double numero) {
		 
		int number = 1;
		if (numero==0)
			return number;
		else
		{
			double resultat = numero * factorial(numero-number);
			return resultat;
		}
	}	
 
	public static void main(String[] args) {
 
		int nre = 3;
		
		System.out.println("El factorial de "  + nre + " és " + factorial(nre));
		nre = 5;
		System.out.println("El factorial de "  + nre + " és " + factorial(nre));
 
	}
}
