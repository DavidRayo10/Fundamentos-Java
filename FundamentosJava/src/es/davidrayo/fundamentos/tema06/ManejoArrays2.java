package es.davidrayo.fundamentos.tema06;

import java.util.Arrays;

public class ManejoArrays2 {

	public static void main(String[] args) {
		
		int[] numeros1 = {1,3,5,7};
		int[] numeros2 = {2,4,6,8};
		
		System.out.println("Método equals");
		
		boolean res1 = numeros1.equals(numeros2);
		boolean res2 = Arrays.equals(numeros1, numeros2);
		
		System.out.println(res1);
		System.out.println(res2);
		
		System.out.println("Método copyOf");
		
		int[] numeros3 = Arrays.copyOf(numeros1,numeros1.length);
		for(int numero: numeros3) {
			System.out.println(numero);
		}
		
		System.out.println("Método fill");
		
		Arrays.fill(numeros1, 7);
		for(int numero: numeros1) {
			System.out.println(numero);
		}
		
		System.out.println("Método clone");
		
		numeros3 = numeros2.clone();
		for(int numero: numeros3) {
			System.out.println(numero);
		}
		
	}

}
