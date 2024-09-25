package parte1;

import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		// Creamos las variables
		int trimestre1;
		int trimestre2;
		int trimestre3;
		double notamedia;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Pedimos al usuario la nota del primer trismestre
		System.out.println("Introduza la nota del primer trimestre: ");

		// Leemos la nota introducida en la consola
		trimestre1 = reader.nextInt();

		// Pedimos al usuario la nota del segundo trismestre\
		System.out.println("Introduza la nota del segundo trimestre: ");

		// Leemos la nota introducida en la consola
		trimestre2 = reader.nextInt();

		// Pedimos al usuario la nota del tercer trismestre
		System.out.println("Introduza la nota del tercer trimestre: ");

		// Leemos la nota introducida en la consola
		trimestre3 = reader.nextInt();

		// Calculamos la nota media
		notamedia = (trimestre1 + trimestre2 + trimestre3) / 3.0;

		/*
		 * Mostramos el resultado entero y con decimales y calculamos en el syso la nota
		 * media
		 */
		System.out.println("Tu nota media en el boletin de calificaciones es: " + (int) notamedia);
		System.out.println("Tu nota media en el expediente academico es: " + notamedia);

		// Cerramos el Scanner
		reader.close();

	}

}
