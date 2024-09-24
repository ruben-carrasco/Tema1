package parte1;

import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		// Declaramos las variables
		int edad;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// 1º Pedimos la edad al usuario
		System.out.println("Introduzca su edad: ");
		
		// 2º Leemos la edad introducida en consola
		edad = reader.nextInt();
		
		// Reiniciamos el Scanner
		reader.nextLine();
		
		// 3º Comprobamos si es mayor de edad
		
		boolean mayoredad = edad >= 18;
		
		// 4º Mostramos y calulamos los resultados
		System.out.println(mayoredad);
		
		// Cerramos el Scanner
		reader.close();

	}

}