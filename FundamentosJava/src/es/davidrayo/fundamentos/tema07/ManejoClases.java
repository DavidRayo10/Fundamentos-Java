package es.davidrayo.fundamentos.tema07;

public class ManejoClases {

	public static void main(String[] args) {
		
		Televisor tv1 = new Televisor(9,true,42);
		
		tv1.encender();
		tv1.cambiarCanal(5);
		tv1.apagar();
	
		
		String palabra1 = new String("casa");
		String palabra2 = new String("casa1");
		System.out.println("Está comparación es " + (palabra1 == palabra2));
		
		System.out.println(palabra1.equals(palabra2));
	
	}

}
