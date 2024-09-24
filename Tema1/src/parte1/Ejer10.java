package parte1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		// Declaramos las variables
		int numero;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// 1º Pedimos el numero al usuario
		System.out.println("Introduzca su numero: ");
		
		// 2º Leemos el número introducido en consola
		numero = reader.nextInt();
		
		// Reiniciamos el Scanner
		reader.nextLine();
		
		// 3º Comprobamos si es par
		boolean par = numero % 2 == 0;
		
		// 4º Mostramos el resultado
		System.out.println(par);
		
		// Cerramos el Scanner
		reader.close();

	}

}