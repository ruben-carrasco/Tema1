package parte2;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// Creamos las variables
		int segundos;
		int minutos;
		int horas;
		int segundosFinal;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedidos al usuario los segundos
		System.out.println("Introduzca los segundos: ");
		
		// Leemos los segundos introducidos en consola
		segundos = reader.nextInt();
		
		// Calculamos las conversiones
		horas =  segundos / 3600;
		minutos = (segundos % 3600) / 60;
		segundosFinal = (segundos % 3600) % 60;
		
		
		// Mostramos y calculamos las horas, minutos y segundos
		System.out.println("Equivalen a " + horas + " horas " + minutos + " minutos y " + segundosFinal  + " segundos" );
		
		// Cerramos el Scanner
		reader.close();
	}

}
