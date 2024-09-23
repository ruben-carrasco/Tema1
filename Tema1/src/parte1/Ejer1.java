package parte1;

import java.util.Scanner;

public class Ejer1 {
	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner lectura = new Scanner(System.in);
		
		// Variables donde almacenar los valores
		int numero;
		
		// 1º Pedimos el número al usuario
		System.out.println("Introduzca un número");
		
		// 2º Leemos el número de consola
		numero = lectura.nextInt();
		
		// 3º Mostramos el número introducido por el usuario
		System.out.println(numero);
		
		// Cerramos el Scanner
		lectura.close();
	}

}
