package es.davidrayo.fundamentos.tema04;

import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu edad: ");
		int edad = Integer.parseInt(entrada.next());
		
		if(edad >= 18) {
			System.out.println("Eres mayor de edad.");
		} else {
			System.out.println("No eres mayor de edad.");
		}

	}

}
