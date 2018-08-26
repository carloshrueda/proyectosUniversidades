package ejercicios_20180825;

import java.util.Scanner;

/*
 * El número mistico
 * 
 * Realizar un programa que genere el número místico dado el nombre 
 * a los nombres y apellidos de una persona
 * 
 * El número se calcula sumando los valores asignaos a las letras que
 * lo componen, de acueerdo al orden de cada letra del abecedario
 * así:
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
			System.out.print("\nIngrese un número entero positivo a convertir a binario?: ");
			nument = scn.nextInt();

			if (nument >= 0) {
				numbin = convertir.dec2bin(nument);
				System.out.println("El número en binario es: " + numbin);
			} else {
				System.out.println("Error. número invalido. Ingrese un número enteror positivo.");

			}

			System.out.print("\nDesea continuar (S/N)?: ");
			opcion = scn.next().toUpperCase();
		} while (opcion.equals("S") == true);

		scn.close();
		System.out.print("\n\n*** Gracias por usar el software ***\n");

	}

}
