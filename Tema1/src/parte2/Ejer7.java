package parte2;

import java.util.Scanner;

public class Ejer7 {
	public static void main(String[] args) {
		
		// Creamos la variable que recoge el número de entradas infantiles
		int unidadesInfantiles;

		// Creamos la variable que recoge el número de entradas adultas
		int unidadesAdultos;
		
		// Creamos la variable que recoge el importe total
		double total;
		
		// Creamos las constantes para los precios de las entradas
		final double INFANTILES = 15.50;
		final double ADULTOS = 20;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el numero de entradas infantiles
		System.out.println("Introduzca la cantidad de entradas infantiles adquiridas: ");
		unidadesInfantiles = reader.nextInt();
				
		// Pedimos al usuario el número de entradas de adultos
		System.out.println("Introduzca la cantidad de entradas de adultos adquiridas: ");
		unidadesAdultos = reader.nextInt();
		
		// Calculamos el total
		total = (unidadesInfantiles * INFANTILES) + (unidadesAdultos * ADULTOS);
		
		// Mostramos los el total y descontamos el 5% si procede con un ternario
		System.out.println("El importe total es : " + (total >= 100 ? (total - ( total / 100 ) * 5)  : total) + " €");
		
		// Cerramos el Scanner
		reader.close();
		
	}

}