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

	public int numeroMistico(String nombre) {
		// letras: A B C D E F G H I J K L M N N O P Q R S T U V W X Y Z
		// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27
		int nm = 0;
		char letra;
		int valletra;

		for (int i = 0; i <= nombre.length() - 1; i++) {
			letra = nombre.charAt(i); // Se toma cada letra
			
			if ((letra >= 'A') && (letra <= 'Z')) { // se valida que sea un caracter alfabetico
				// valor de la letra en entero
				valletra = ((int) letra - 64); // igual: nm + ((int) nombre.charAt(i) - 65 + 1); 
				if (letra > 'N') // la ñ en ingles en el ascii no existe por eso si es mayor que n se suma 1
					valletra = valletra + 1;
				
				nm = nm + valletra; 
			}

		}

		return nm;
	}

	public static void main(String[] args) {
		String opcion = "";
		String nombre;

		Scanner scn = new Scanner(System.in);
		NumeroMistico nm = new NumeroMistico();

		do {
			System.out.print("\nNombre?: ");
			nombre = scn.nextLine().trim();

			if (nombre.isEmpty() == false) {
				nombre = nombre.toUpperCase();
				System.out.println("El número místido es: " + nm.numeroMistico(nombre));
			} else {
				System.out.println("Error. El nombre está vacío.");
			}

			System.out.print("\nDesea continuar (S/N)?: ");
			opcion = scn.nextLine().toUpperCase();
		} while (opcion.equals("S") == true);

		scn.close();
		System.out.print("\n\n*** Gracias por usar el software ***\n");

	}

}
