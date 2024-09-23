package parte1;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// Creamos el Scanner
		Scanner lectura = new Scanner(System.in);
		
		// Variables donde almacenar los numeros
		double radio;
		
		// 1º Pedimos el radio (puede contener decimales) al usuario
		System.out.println("Introduzca el radio");
		
		// 2º Leemos el radio introducido en la consola.
		radio = lectura.nextDouble();
		
		// 5º Mostramos y calculamos la longitud y area por separado
		System.out.println("La longitud es " + (2 * Math.PI * radio));
		System.out.println("El area es " + (Math.PI * (radio * radio)));
		
		// Cerramos el Scanner
		lectura.close();
	}

}
