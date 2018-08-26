package ejercicios_20180825;

import java.util.Scanner;

/*
 * Realizar un programa que muestre la serie de Fibonacci
 * desde le primer numero "n1" que digite el usuario, hasta el 
 * número que sea menor o igualal numero "n2" que digite el
 * usuario.
 * 
 * El programa debe repetirse hasta que el usuario lo desee 
 *  
 */

public class Fibonacci {

	public void calcularFibonacci(int n1, int n2) {
		int ant, sig, temp;

		ant = 0;
		sig = 1;

		// Si el primer número es igual a 0
		if (n1 == 0)
			System.out.print("0, ");

		// haga mientras el segundo número sea menor o igual al siguiente
		while (sig <= n2) {
			if (sig >= n1)
				System.out.print(sig + ", ");
			temp= ant;
			ant= sig;
			sig= temp + sig;
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		String opcion = "";
		int n1, n2;

		Scanner scn = new Scanner(System.in);
		Fibonacci fibo = new Fibonacci();

		do {
			System.out.print("\nIngrese el primer número: ");
			n1 = scn.nextInt();

			if (n1 >= 0) {
				System.out.print("Ingrese el segundo número: ");
				n2 = scn.nextInt();

				if (n2 > n1) {
					fibo.calcularFibonacci(n1, n2);
				} else {
					System.out.println("Error. El segundo número debe ser mayor al primer número.");
				}

			} else {
				System.out.println("Error. El primer número debe ser mayor que cero.");
			}

			System.out.print("Desea continuar (S/N)?: ");
			opcion = scn.next().toUpperCase();
		} while (opcion.equals("S") == true);

		scn.close();
		System.out.print("\n\n*** Gracias por usar el software ***\n");

	}

}
