package es.davidrayo.fundamentos.tema05;

import java.util.Iterator;

public class ManejoCharAt {

	public static void main(String[] args) {

		String nombre = new String("David");

		// método
		char c;
		char letraInicial = nombre.charAt(0);
		char ultimaLetra = nombre.charAt(nombre.length() - 1);

		System.out.println("La primera letra del nombre es: " + letraInicial + ".");
		System.out.println("La última letra del nombre es: " + ultimaLetra + ".");

		for(int i = 0; i < nombre.length() ; i++) {
			
			System.out.println("Posición " + (i+1) +" --> letra: " + nombre.charAt(i));
		}
	}

}
