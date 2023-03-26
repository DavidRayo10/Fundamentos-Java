package es.davidrayo.fundamentos.tema03;

public class ArrayNombres {

	public static void main(String[] args) {
		String[] nombres = new String [5];
		
		nombres[0] = "David";
		nombres[1] = "Carmen";
		nombres[2] = "Emilio";
		nombres[3] = "Josefa";
		nombres[4] = "Ana";
		
		System.out.println("La longitud del array es de: " + nombres.length + " elemntos.");
		System.out.println("El primer nombre es: " + nombres[0] +".");
		System.out.println("El segundo nombre es: " + nombres[1] +".");
		System.out.println("El tercer nombre es: " + nombres[2] +".");
		System.out.println("El cuarto nombre es: " + nombres[3] +".");
		System.out.println("El quinto nombre es: " + nombres[4] +".");
		
	}

}
