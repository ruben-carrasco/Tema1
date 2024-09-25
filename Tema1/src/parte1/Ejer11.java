package parte1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
			// Declaramos las variables
			double pesetas;
			
			// Creamos el Scanner
			Scanner reader = new Scanner(System.in);
			
			// Pedimos las pesetas al usuario
			System.out.println("Introduzca las pesetas: ");
			
			// Leemos la cantidad introducida en consola
			pesetas = reader.nextDouble();
					
			// Mostramos el resultado al usuario y hacemos la conversion dentro del syso
			System.out.println(pesetas + " pesetas son " + (pesetas/166) + "€");
			
			// Cerramos el Scanner
			reader.close();
	}

}
