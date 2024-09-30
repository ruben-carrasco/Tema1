package parte2;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		// Creamos las variables
		int numero;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el número
		System.out.println("Introduzca el número: ");
		
		// Leemos el número introducido en consola
		numero = reader.nextInt();
		
		// Calculamos y mostramos
		System.out.println("Sumamos " + (numero % 7 == 0 ? 0 : 7 - numero % 7) + " para que sea múltiplo de 7");
		
		// Cerramos el scanner
		reader.close();
		
	}

}
