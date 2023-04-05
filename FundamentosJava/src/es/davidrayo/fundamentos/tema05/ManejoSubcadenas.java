package es.davidrayo.fundamentos.tema05;

public class ManejoSubcadenas {

	public static void main(String[] args) {

		String texto = "Esto es una cadena de texto.";

		String texto1 = texto.substring(5);
		String texto2 = texto.substring(12, 18);

		System.out.println(texto1);
		System.out.println(texto2);
	}

}
