package parte2;

import java.util.Scanner;

public class Ejer8 {
	public static void main(String[] args) {
		// Creamos la variable que recoge la longitud en metros
		double m;
		
		// Creamos la variable centímetros
		double cm;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario los m y en la siguiente línea leemos el valor introducido en consola.
		System.out.println("Introduzca la longitud del lanzamiento en metros: ");
		m = reader.nextDouble();
		
		// Calculamos los cm del lanzamiento
		cm = m * 10 * 10;
		
		// Mostramos los cm totales
		System.out.println("La longitud del lanzamiento es de " + (int) cm + " cm");
		
		// Cerramos el Scanner
		reader.close();
		
	}

}