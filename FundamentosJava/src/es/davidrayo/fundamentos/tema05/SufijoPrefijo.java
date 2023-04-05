package es.davidrayo.fundamentos.tema05;

public class SufijoPrefijo {
	public static void main(String[] args) {

		// métodos startsWith y endsWith
		String palabra = "encina";

		boolean isInclude = palabra.startsWith("en");
		System.out.println(isInclude);

		isInclude = palabra.endsWith("na");
		System.out.println(isInclude);
	}
}
