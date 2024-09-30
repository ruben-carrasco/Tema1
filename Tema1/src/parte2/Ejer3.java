package parte2;

import java.util.Scanner;

public class Ejer3 {
	public static void main(String[] args) {
		// Creamos las variables
		int num1;
		int num2;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el número 1
		System.out.println("Introduzca el número 1: ");
		
		// Leemos el número 1 introducido en consola
		num1 = reader.nextInt();
		
		// Pedimos al usuario el número 2
		System.out.println("Introduzca el número 2: ");
		
		// Leemos el número 2 introducido en consola
		num2 = reader.nextInt();
		
		// Calculamos y mostramos
		System.out.println("Sumamos " + (num1 % num2 == 0 ? 0 : num2 - num1 % num2) + " para que " + num1 + " sea múltiplo de " + num2);
		
		// Cerramos el scanner
		reader.close();
		
	}

}