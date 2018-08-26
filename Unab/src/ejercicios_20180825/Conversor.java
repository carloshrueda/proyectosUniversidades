package ejercicios_20180825;

import java.util.Scanner;

/* R6. Conversor a Binario
 * 
 * Realice un programa que convierta un n�mero entero decimal a su versi�n
 * binaria.
 * 
 * El programa deber� correr hasta que el usuario decida lo contrario
 */

public class Conversor {

	public String dec2bin(int num) {
		int residuo;
		String numbin = "";

		while (num > 0) {
			residuo = num % 2;
			num = num / 2;
			numbin = residuo + numbin;
		}
		
		if (numbin.isEmpty()==true) {
			numbin= "0";
		}

		return numbin;
	}

	public static void main(String[] args) {
		int nument;
		String numbin;
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

};