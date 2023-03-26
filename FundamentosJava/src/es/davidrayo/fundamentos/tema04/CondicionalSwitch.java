package es.davidrayo.fundamentos.tema04;

import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {

		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("Introduce el día de la semana (del 1 al 7): ");
			int dia = Integer.parseInt(entrada.nextLine());

			switch (dia) {
			case 1:
				System.out.println("Hoy es lunes.");
				break;

			case 2:
				System.out.println("Hoy es martes.");
				break;

			case 3:
				System.out.println("Hoy es miércoles.");
				break;

			case 4:
				System.out.println("Hoy es jueves.");
				break;

			case 5:
				System.out.println("Hoy es viernes.");
				break;

			case 6:
				System.out.println("Hoy es sábado.");
				break;

			case 7:
				System.out.println("Hoy es domingo.");
				break;

			default:
				System.out.println("El día introducido no es correcto.");
			}
		} catch (NumberFormatException e) {
			System.out.println("Debe introducir un número.");
			e.printStackTrace();
		}
	}
}
