package ejercicios_20181002.RA8_La_Vieja_Libreria;

import java.util.Iterator;
import java.util.Scanner;

public class LibreriaPrograma {

	private static void crearLibros(Scanner teclado, Inventario inventario) {
		InterfazUtilidades.tituloMenu("1. Crear Libros");

		boolean isnum = false;
		int icant = -1;
		do {
			System.out.print("Cantidad de libros para crear? ");
			String scant = teclado.nextLine().trim();

			if ((isnum = InterfazUtilidades.isNumeric(scant)) == true) {
				icant = Integer.parseInt(scant);
			} else {
				System.out.println(">>> La edad debe ser numérico mayor a uno.\n");
			}

			if ((isnum == true) && (icant < 1)) {
				System.out.println(">>> La edad debe ser numérico mayor a uno.\n");
			}

		} while ((isnum == false) || (icant < 1)); // haga mientras el edad no sea numérico o no
													// este entre 1 - 130
		
		for (int i = 1; i <= icant; i++) {
			
		}
	}

	public static void main(String[] args) {
		int opcion;
		Inventario inventario = new Inventario();
		Scanner teclado = new Scanner(System.in);

		do {
			opcion = InterfazUtilidades.Menu(teclado, "LA VIEJA LIBRERIA", new String[] { " 1. Crear Libros",
					" 2. Vender Libro", " 3. Consulta Libro", " 4. Libros Más Caros", " 5. Salir" }, 1, 5);

			switch (opcion) {
			case 1:
				crearLibros(teclado, inventario);
				break;

			/*
			 * case 2: listarPoblacion(teclado, lstper); break;
			 * 
			 * case 3: cantidadPoblacion(teclado, lstper); break; case 4:
			 * buscarPersonaNombre(teclado, lstper); break;
			 * 
			 * case 5: buscarPersonaRangoEdad(teclado, lstper); break;
			 * 
			 * case 6: buscarPersonaMasVieja(teclado, lstper); break;
			 * 
			 * case 7: buscarPersonaMasJoven(teclado, lstper); break;
			 * 
			 * case 8: mostrarPromEdadPoblacion(teclado, lstper); break;
			 * 
			 * case 9: mostrarPromEdadMujeres(teclado, lstper); break;
			 * 
			 * case 10: mostrarPromEdadHombres(teclado, lstper); break;
			 * 
			 * case 11: listarPoblacionMujeres(teclado, lstper); break;
			 * 
			 * case 12: listarPoblacionHombres(teclado, lstper); break;
			 */

			default:
				break;
			}

		} while (opcion != 13);

		teclado.close();

		System.out.println("\n>>> GRACIAS POR USAR EL SOFTWARE. ADIOS.");

	}

}
