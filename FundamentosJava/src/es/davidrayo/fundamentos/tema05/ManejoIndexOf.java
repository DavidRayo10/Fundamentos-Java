package es.davidrayo.fundamentos.tema05;

import java.util.Scanner;

public class ManejoIndexOf {
	public static void main(String[] args) {

		// método indexOf y lastIndexOf

		int posicion;
		int ultimaPosicion;
		String texto = "Esto es una cadena de texto.";

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una letra: ");
		String letra = entrada.nextLine();// lectura de letra

		posicion = (texto.indexOf(letra)) + 1;// posicion de la letra
		ultimaPosicion = (texto.lastIndexOf(letra)) + 1;

		if (posicion != 0) {
			System.out.println("La primera letra '" + letra + "' se encuentra en la posición: " + posicion + ".");
			System.out.println("La última letra '" + letra + "' se encuentra en la posición: " + ultimaPosicion + ".");

		} else {
			System.out.println("La letra no se encuentra en el texto.");
		}

	}

}
