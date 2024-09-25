package parte1;

import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		// Creamos las variables
		boolean rain;
		boolean task;
		boolean library; 
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Preguntamos al usuario si llueve
		System.out.println("¿Esta lloviendo (true/false): ");
		
		// Leemos la opción introducida en consola
		rain = reader.nextBoolean();
		
		// Preguntamos al usuario si ha finalizado las tareas
		System.out.println("¿Has finalizado las tareas (true/false): ");
		
		// Leemos la opción introducida en consola
		task = reader.nextBoolean();
		
		// Preguntamos al usuario si necesita ir a la biblioteca
		System.out.println("¿Necesitas ir a la biblioteca (true/false): ");
		
		// Leemos la opción introducida en consola
		library = reader.nextBoolean();
		
		// Mostramos el resultado y calculamos en el syso si puede salir a la calle
		System.out.println("Permiso para salir: " + (library || (!rain && task)));

	}

}
