package es.davidrayo.fundamentos.tema06;

import java.util.Arrays;

public class ManejoArrays {

	public static void main(String[] args) {
		
		String[] nombres1 = {"David","Carmen","María","Ana"};
		String[] nombres2 = {"David","Carmen","María","Ana"};
		String[] nombres3 = {"Antonio","Susana","Javier","Teresa"};
		String[] nombres4;
		String[] nombres5 = {"Ramón"};
		
		//equals()
		boolean respuesta = Arrays.equals(nombres1, nombres2);
		System.out.println("Método equals()");
		System.out.println(respuesta);
		
		//copyOf()
		nombres4 = Arrays.copyOf(nombres1, 8);
		nombres4[4] = "Antonio";
		nombres4[5] = "Susana";
		nombres4[6] = "Javier";
		nombres4[7] = "Teresa";
		
		System.out.println("Método copyOf()");
		for(String nombre : nombres4) {
			System.out.println(nombre);
		}
		
		//fill()
		Arrays.fill(nombres5,"Rafael");
		System.out.println("Método fill()");
		for(String nombre : nombres5) {
			System.out.println(nombre);
		}
		
		//clone()
		nombres4 = nombres3.clone();
		System.out.println("Método clone()");
		for(String nombre : nombres4) {
			System.out.println(nombre);
		}
	}

}
