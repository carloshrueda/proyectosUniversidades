package ejercicios_20180825;

import java.util.Scanner;

/*
 * El n�mero mistico
 * 
 * Realizar un programa que genere el n�mero m�stico dado el nombre 
 * a los nombres y apellidos de una persona
 * 
 * El n�mero se calcula sumando los valores asignaos a las letras que
 * lo componen, de acueerdo al orden de cada letra del abecedario
 * as�:
 * 
 * A B C D E F G H I ... Z
 * 1 2 3 4 5 6 7 8 9    27
 * 
 * Ejemplo:
 * 
 * Nombre: Daniel Julian Gomez Silva
 * suma: 4 + 1 + 14 + 9 + 5 + ... = 246
 * 
 * El programa debe correr hasta que el usuario decida lo contrario
 * 
 */

public class NumeroMistico {

	public static void main(String[] args) {
		String opcion = "";

		Scanner scn = new Scanner(System.in);
		Conversor convertir = new Conversor();

		do {
			System.out.print("\nIngrese un n�mero entero positivo a convertir a binario?: ");
			nument = scn.nextInt();

			if (nument >= 0) {
				numbin = convertir.dec2bin(nument);
				System.out.println("El n�mero en binario es: " + numbin);
			} else {
				System.out.println("Error. n�mero invalido. Ingrese un n�mero enteror positivo.");

			}

			System.out.print("\nDesea continuar (S/N)?: ");
			opcion = scn.next().toUpperCase();
		} while (opcion.equals("S") == true);

		scn.close();
		System.out.print("\n\n*** Gracias por usar el software ***\n");

	}

}
