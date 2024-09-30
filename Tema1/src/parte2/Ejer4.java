package parte2;
import java.util.Scanner;

public class Ejer4 {
	public static void main(String[] args) {
		// Creamos las variables
		double a;
		double b;
		double c;
		double x;
		double y;
		
		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);
		
		// Pedimos al usuario el valor del coeficiente "a" y en la siguiente línea leemos el valor introducido en consola.
		System.out.println("Introduzca el valor de a: ");
		a = reader.nextDouble();
		
		// Pedimos al usuario el valor del coeficiente "b" y en la siguiente línea leemos el valor introducido en consola.
		System.out.println("Introduzca el valor de b: ");
		b = reader.nextDouble();	
		
		// Pedimos al usuario el valor del coeficiente "c" y en la siguiente línea leemos el valor introducido en consola.
		System.out.println("Introduzca el valor de c: ");
		c = reader.nextDouble();
				
		// Pedimos al usuario el valor de x y en la siguiente línea leemos el valor introducido en consola.
		System.out.println("Introduzca el valor de x: ");
		x = reader.nextDouble();		
		
		// Mostramos y calculamos el resultado
		System.out.println("El resultado de y=ax2+bx+c es: " + (y = a * (x * x) + b * x + c));
		
		
		//Cerramos el Scanner
		reader.close();
	}
	

}
