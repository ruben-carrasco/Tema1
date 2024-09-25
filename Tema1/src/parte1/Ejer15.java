package parte1;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		// Creamos las variables
		double precio;

		// Creamos las constantes
		final int iva = 21;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos el precio del articulo
		System.out.println("Introduza el precio del  articulo: ");

		// Leemos el precio introducido en la consola
		precio = reader.nextDouble();

		// Mostramos y calculamos en el syso el precio final con IVA añadido
		System.out.println("El precio con IVA es: " + (precio * iva / 100 + precio) + " euros");

		// Cerramos el Scanner
		reader.close();

	}

}
