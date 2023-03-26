package es.davidrayo.fundamentos.tema03;

public class Matriz {

	public static void main(String[] args) {
		
		int[][] edad = new int[3][2]; //array de dos dimensiones
		
		edad[0][0] = 18;
		edad[0][1] = 12;
		edad[1][0] = 14;
		edad[1][1] = 17;
		edad[2][0] = 16;
		edad[2][1] = 15;
		
		System.out.println(edad[2][0]);
		
		int[][] year = {{1988,1992},{2004,2008}}; //array de dos dimensiones
			
		System.out.println(year[0][1]);
	}

}
