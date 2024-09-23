package parte1;

import java.util.Scanner;

public class Ejer2 {
	public static void main(String[] args) {
		
		// Creamos el Scanner
		Scanner lectura = new Scanner(System.in);
				
		// Variables donde almacenar los valores
		int numero;
		
		// 1º Pedimos la edad al usuario
		System.out.println("Introduzca su edad");
		
		// 2º Leemos el número introducido en consola
		numero = lectura.nextInt();
		
		// 3º Mostramos y calculamos la edad en el siguiente año en función de lo introducido por el usuario
		System.out.println(numero + 1);
		
		// Cerramos el Scanner
		lectura.close();
		
	}

}