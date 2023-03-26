package es.davidrayo.fundamentos.tema03;

import java.util.Scanner;

public class PeticionDatos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int aleatorio = (int)(Math.random() * 1000);
		
		
		System.out.println("Introduzca su nombre: ");
		String nombre = entrada.nextLine();
		
		System.out.println("Su nombre es " + nombre + " y se le ha asignado el dorsal " + aleatorio + "." );
	}

}
