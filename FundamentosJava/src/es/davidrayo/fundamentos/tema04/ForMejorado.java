package es.davidrayo.fundamentos.tema04;

public class ForMejorado {

	public static void main(String[] args) {

		int contador = 0;
		String[] alumnos = { "David", "Carmen", "Ana", "Paco", "Pedro", "Luis", "María", "Antonio", "Ignacio", "Paula",
				"Raúl", "Alba" };
		
		
		for (String alumno : alumnos) {
			contador++;
			System.out.println("Alumno/a - " + contador + " : " + alumno + ".");
		}

	}
}
