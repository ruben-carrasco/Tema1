package parte2;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		// Declaramos las variables
		double numero;
		int redondeo;
		
		//Creamos el Scanner
		Scanner reader = new Scanner(System.in);
	
		//Pedimos al usuario el número decimal
		System.out.println("Introduzca un número decimal para redondear: ");
		
		// Leemos el número introducido en la consola;
		numero = reader.nextDouble();
		
		// Hacemos las operaciones para redondear
		redondeo = (int) (numero + 0.5);
		
		// Mostramos el resultado
		System.out.println("El número redondeado es: " + redondeo);
		
		//Cerramos el Scanner
		reader.close();

	}

}
