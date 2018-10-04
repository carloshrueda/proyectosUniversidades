package ejercicios_20181002.R8_ClasificadorPoblacion;

import java.util.Scanner;

public class InterfazUtilidades {

	public static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public static void limpiarPantalla() {
		StringBuffer sb = new StringBuffer();

		for (int i = 1; i <= 41; i++) {
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}

	public static int Menu(Scanner teclado, String titulo, String[] opciones, int opmin, int opmax) {
		String sopcion;
		int iopcion;
		boolean isnum = false;
		do {
			tituloMenu(titulo);
			for (String op : opciones) {
				System.out.println(op);
			}
			System.out.print("\n>>> OPCION [" + opmin + ", " + opmax + "]? ");

			sopcion = teclado.nextLine();
			iopcion = Integer.MIN_VALUE;
			if ((isnum = isNumeric(sopcion)) == true) {
				iopcion = Integer.parseInt(sopcion);
			}
		} while ((isnum == false) || (iopcion < opmin) || (iopcion > opmax));

		return iopcion;

	}
	
	public static void tituloMenu(String titulo) {
		limpiarPantalla();
		System.out.println("\t*** " + titulo.toUpperCase() + " ***\n");
	}

}
