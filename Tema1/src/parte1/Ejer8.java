package parte1;

import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// Declaramos las variables
		String nombre;
		int edad;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// 1º Pedimos el nombre al usuario
		System.out.println("Introduzca su nombre: ");
		
		// 2º Leemos el nombre introducido en consola
		nombre = reader.nextLine();	
				
		// 3º Pedimos la edad al usuario
		System.out.println("Introduzca su edad: ");
		
		// 4º Leemos la edad introducido en consola
		edad = reader.nextInt();
		
		// 7º Mostramos los resultados
		System.out.println("Hola " + nombre +", tienes " + edad +  " años, ¡qué mayor eres!");
		
		// Cerramos el Scanner
		reader.close();

	}

}