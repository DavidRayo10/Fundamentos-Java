package es.davidrayo.fundamentos.tema06;

import java.time.*;

public class ManejoFechas {

	public static void main(String[] args) {
		
		//clase LocalDate método now()
		System.out.println("La fecha actual es: " + LocalDate.now());
		System.out.println( "La hora actual es: " + LocalTime.now() );
		System.out.println( "La fecha y hora actuales son: " + LocalDateTime.now() );
		System.out.println( "El instante actual es: " + Instant.now() );
		System.out.println( "La fecha y hora actuales con zona horaria son: " + ZonedDateTime.now() );
		
		//clase LocalDate método of()
		System.out.println( "Fecha de mi cumpleaños: " + LocalDate.of(1976, Month.DECEMBER, 7) );
		
		//clase LocalDateTime método of()
		System.out.println( "Con la hora exacta: " + LocalDateTime.of(2023, Month.APRIL, 3, 10, 00) );
	}

}
