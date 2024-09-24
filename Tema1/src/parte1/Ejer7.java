package parte1;

import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// Declaramos las variables
		String nombre;
		String direccion;
		String telefono;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// 1º Pedimos el nombre al usuario
		System.out.println("Introduzca su nombre: ");
		
		// 2º Leemos el nombre introducido en consola
		nombre = reader.nextLine();	
				
		// 3º Pedimos la direccion al usuario
		System.out.println("Introduzca su direccion: ");
		
		// 4º Leemos la direccion introducido en consola
		direccion = reader.nextLine();
		
		// 5º Pedimos el telefono al usuario
		System.out.println("Introduzca su telefono: ");
		
		// 6º Leemos el telefono introducido en consola
		telefono = reader.nextLine();
		
		// 7º Mostramos los resultados
		System.out.println("Nombre: " + nombre);
		System.out.println("Direccion: " + direccion);
		System.out.println("Telefono: " + telefono);
		
		// Cerramos el Scanner
		reader.close();

	}

}