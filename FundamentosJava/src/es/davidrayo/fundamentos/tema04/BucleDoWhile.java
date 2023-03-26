package es.davidrayo.fundamentos.tema04;

public class BucleDoWhile {

	public static void main(String[] args) {
		
		int contador = 1;
		do {
			System.out.println("Puede pasar el cliente " + contador + ".");
			contador++;
		}while(contador<11);

	}

}
