package es.davidrayo.fundamentos.tema07;

public class Televisor {
	
	//Atributos
	private int canales;
	private boolean smart;
	private int pulgadas;
	
	//Constructor
	public Televisor(int canales, boolean smart, int pulgadas) {
		this.canales = canales;
		this.smart = smart;
		this.pulgadas = pulgadas;
	}
	
	//Métodos
	public void cambiarCanal(int canal) {
		System.out.println("Está el canal " + canal + ".");
	}
	
	public void apagar(){
		System.out.println("OFF: se ha apagado el televisor.");
	}
	
	public void encender(){
		System.out.println("ON: se ha encendido el televisor.");
	}
	


}
