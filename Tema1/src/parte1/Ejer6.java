package parte1;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// Declaramos las variables
		double num1;
		double num2;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// 1º Pedimos el primer número al usuario
		System.out.println("Introduzca el primer número: ");
		
		// 2º Leemos el número introducido en consola
		num1 = reader.nextDouble();	
		
		// Reiniciamos el Scanner
		reader.nextLine();
		
		// 3º Pedimos el segundo número al usuario
		System.out.println("Introduzca el segundo número: ");
		
		// 4º Leemos el número introducido en consola
		num2 = reader.nextDouble();
		
		// 5º Realizamos las operaciones con los números
		// Suma
		double suma = num1 + num2;
		
		// Resta
		double resta = num1 - num2;
		
		// Multiplicacion
		double multiplicacion = num1 * num2;
		
		// Division
		double division = num1 / num2;
		
		// Mostramos los resultados
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la resta es: " + resta);
		System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
		System.out.println("El resultado de la division es: " + division);
		
		// Cerramos el Scanner
		reader.close();

	}

}
