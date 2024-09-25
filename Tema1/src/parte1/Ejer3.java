package parte1;

import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner lectura = new Scanner(System.in);
		
		// Variables donde almacenar los números
		int añoActual;
		int añoNacimiento;
		
		// 1º Pedimos el año actual al usuario
		System.out.println("Introduzca el año actual");
		
		// 2º Leemos el número introducido en consola
		añoActual = lectura.nextInt();
		
		// 3º Pedimos el año de nacimiento al usuario
		System.out.println("Introduzca su año de nacimiento");
		
		// 4º Leemos el número de consola
		añoNacimiento = lectura.nextInt();
		
		// 5º Mostramos y calculamos la edad en función de lo introducido por el usuario
		System.out.println("Tu edad es: " + (añoActual - añoNacimiento));
		
		// Cerramos el Scanner
		lectura.close();
	
	}
}
