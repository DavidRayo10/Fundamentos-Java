package es.davidrayo.fundamentos.tema06;

import java.util.ArrayList;

public class ManejoArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista1 = new ArrayList<Integer>();// instanciación
		
		System.out.println("======= Método size =======\n");
		System.out.println(lista1.size());
		
		System.out.println("\n======= Método add =======\n");
		lista1.add(3);
		lista1.add(5);
		lista1.add(7);
		lista1.add(12);
		System.out.println("El tamaño de la lista es: " + lista1.size() +".");
		
		System.out.println("\n======= Método get =======\n");
		
		System.out.println("El tamaño de la lista es: " + lista1.size() +".");
		for(int i=0 ; i<lista1.size() ; i++) {			
			System.out.println("El elemento " + (i+1) + " es: " + lista1.get(i) + ".");
		}
		
		System.out.println("\n======= Método remove =======\n");
		
		lista1.remove(3);
		System.out.println("El tamaño de la lista es: " + lista1.size() +".");
		for(int i=0 ; i<lista1.size() ; i++) {			
			System.out.println("El elemento " + (i+1) + " es: " + lista1.get(i) + ".");
		}
	}

}
