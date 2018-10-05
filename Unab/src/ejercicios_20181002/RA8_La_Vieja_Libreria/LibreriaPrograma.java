package ejercicios_20181002.RA8_La_Vieja_Libreria;

import java.util.ArrayList;
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
		String sent = "";
		int codigo = 0;
		String titulo = "";
		String autor = "";
		int precio = 0;
		int existencias = 0;
		for (int i = 1; i <= icant; i++) {
			System.out.println("\nIntroduzca datos para el libro # " + i);
			System.out.print("Código (numérico) del libro? ");
			sent = teclado.nextLine();
			codigo = Integer.parseInt(sent);

			System.out.print("Título del libro? ");
			titulo = teclado.nextLine();

			System.out.print("Autor del libro? ");
			autor = teclado.nextLine();

			System.out.print("Precio del libro? ");
			sent = teclado.nextLine();
			precio = Integer.parseInt(sent);

			System.out.print("Existencias del libro? ");
			sent = teclado.nextLine();
			existencias = Integer.parseInt(sent);

			inventario.agregarLibro(new Libro(codigo, titulo, autor, precio, existencias));
		}

		System.out.println("\n>>> Fin Libros agregados al inventario. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void venderLibro(Scanner teclado, Inventario inventario) {
		InterfazUtilidades.tituloMenu("2. Vender Libro");

		System.out.print("Código (numérico) del libro vendido? ");
		String sent = teclado.nextLine();
		int codigo = Integer.parseInt(sent);

		int existencias = inventario.eliminarExistenciaLibro(codigo);

		if (existencias == Mensaje.CODIGONOEXISTE.getValor()) {
			System.out.println("\n>>> Libro con el codigo " + codigo + " no existe en el inventario.");

		} else if (existencias == Mensaje.NOTIENEEXISTENCIAS.getValor()) {
			System.out.println("\n>>> Libro con el codigo " + codigo
					+ " no tiene existencias en el inventario para vender. Está Agotado."
					+ "\n>>> Pedir urgentemente libros de este código.");

		} else {
			System.out.println("\nLibro vendido.\nQuedan " + existencias + " del libro en el inventario.");
		}

		System.out.println(
				"\n>>> Fin Venta de libros y descuento  en el inventario. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void consultaLibro(Scanner teclado, Inventario inventario) {
		InterfazUtilidades.tituloMenu("3. Consulta Libro");

		System.out.print("Código (numérico) del libro a consultar? ");
		String sent = teclado.nextLine();
		int codigo = Integer.parseInt(sent);

		Libro libro = inventario.buscarLibro(codigo);

		if (libro != null) {
			System.out.println(libro.toString());
		} else {
			System.out.println("\n>>> Libro con el codigo " + codigo + " no existe en el inventario.");
		}

		System.out.println("\n>>> Fin consulta de libro. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void librosMasCaros(Scanner teclado, Inventario inventario) {
		InterfazUtilidades.tituloMenu("4. Libros Más Caros");

		ArrayList<Libro> listresult = inventario.librosMasCaros();

		int cont = 1;
		for (Libro libro : listresult) {
			System.out.println("\nLibro #" + cont++);
			System.out.println(libro.toString());
		}

		System.out.println("\n>>> Fin libros más caros. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
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

			case 2:
				venderLibro(teclado, inventario);
				break;

			case 3:
				consultaLibro(teclado, inventario);
				break;

			case 4:
				librosMasCaros(teclado, inventario);
				break;

			default:
				break;
			}

		} while (opcion != 5);

		teclado.close();

		System.out.println("\n>>> GRACIAS POR USAR EL SOFTWARE. ADIOS.");

	}

}
