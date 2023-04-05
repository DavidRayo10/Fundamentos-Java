package es.davidrayo.fundamentos.tema05;

public class ManejoStringBuilder {

	public static void main(String[] args) {
		
		StringBuilder cadena = new StringBuilder("Hola");
		
		cadena.append(" soy David Rayo");
		cadena.append(" Torres");
		
		System.out.println(cadena);
		
		cadena.reverse();
		
		System.out.println(cadena);

		cadena.reverse();
		
		System.out.println(cadena);
		
	}

}
