package parte1;

import java.util.Scanner;

public class Ejer12 {
	public static void main(String[] args) {
		// Creamos las variables
		double kgperas;
		double kgmanzanas;
		double precioperas = 1.95;
		double preciomanzanas = 2.35;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario los kilos de peras
		System.out.println("Introduzca los kilos de peras: ");
		
		// Leemos los kilos introducidos en consola
		kgperas = reader.nextDouble();
		
		// Pedimos al usuario los kilos de manzanas
		System.out.println("Introduzca los kilos de manzanas: ");
		
		// Leemos los kilos introducidos en consola
		kgmanzanas = reader.nextDouble();	
		
		// Mostramos y calculamos el importe total dentro del syso
		System.out.println("Su importe total es: " + (kgperas * precioperas + kgmanzanas * preciomanzanas));
		
		// Cerramos el Scanner
		reader.close();
	}

}
