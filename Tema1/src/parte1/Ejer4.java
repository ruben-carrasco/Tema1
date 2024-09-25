package parte1;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner lectura = new Scanner(System.in);
		
		// Variables donde almacenar los numeros
		double nota1;
		double nota2;
		
		// 1º Pedimos la primera nota al usuario
		System.out.println("Introduzca la primera nota");
		
		// 2º Leemos la nota introducida en la consola.
		nota1 = lectura.nextDouble();
		
		// 3º Pedimos la segunda nota al usuario
		System.out.println("Introduzca la segunda nota");
		
		// 4º Leemos la nota introducida en la consola
		nota2 = lectura.nextDouble();
		
		// 5º Mostramos y calculamos la nota media
		System.out.println("Su nota media es " + ((nota1 + nota2) / 2));
		
		// Cerramos el Scanner
		lectura.close();
	}

}
