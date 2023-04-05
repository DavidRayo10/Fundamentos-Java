package es.davidrayo.fundamentos.tema05;

public class ManejoMaysculas {
	public static void main(String[] args) {
		// método toUpperCase y toLoweCase

		String nombre = "aNtroPologíA";

		String nombreMayuscula = nombre.toUpperCase();
		String nombreMinuscula = nombre.toLowerCase();

		System.out.println("El nombre en mayúsculas es: " + nombreMayuscula + ".");
		System.out.println("El nombre en minúscula es: " + nombreMinuscula + ".");

	}
}
