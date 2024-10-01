package parte2;

import java.util.Scanner;

public class Ejer6 {
	public static void main(String[] args) {
		// Creamos la variable de la distancia en milímetros
		double mm;
		
		// Creamos la variable que recoge la distancia en centímetros
		double cm;
		
		// Creamos la variable que recoge la distancia en metros
		double m;
		
		// Creamos la variable que recoge la distancia total en cm
		double cmtotales;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario los miímetros y en la siguiente línea leemos el valor introducido en consola.
		System.out.println("Introduzca una distancia en milímetros: ");
		mm = reader.nextDouble();
		
		// Pedimos al usuario los miímetros y en la siguiente línea leemos el valor introducido en consola.
		System.out.println("Introduzca una distancia en centímetros: ");
		cm = reader.nextDouble();
		
		// Pedimos al usuario los miímetros y en la siguiente línea leemos el valor introducido en consola.
		System.out.println("Introduzca una distancia en metros: ");
		m = reader.nextDouble();		
		
		// Calculamos los cm totales
		cmtotales = (mm / 10) + cm + (m * 10 * 10);
		
		// Mostramos los cm totales
		System.out.println("La distancia total en centímetros es : " + cmtotales + " cm");
		
		// Cerramos el Scanner
		reader.close();
		
	}

}
