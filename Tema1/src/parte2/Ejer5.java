package parte2;

import java.util.Scanner;

public class Ejer5 {
	public static void main(String[] args) {
		// Creamos las variables
		int segundos;
		int minutos;
		int horas;
		
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedidos al usuario los segundos
		System.out.println("Introduzca los segundos: ");
		
		// Leemos los segundos introducidos en consola
		segundos = reader.nextInt();
		
		// Calculamos las conversiones
		minutos = segundos / 60;
		horas =  minutos / 60;
		
		
		// Mostramos y calculamos las horas, minutos y segundos
		System.out.println(segundos + " equivalen a " + horas + " horas o " + minutos + " minutos o " + segundos + " segundos" );
		
		// Cerramos el Scanner
		reader.close();
	}

}
