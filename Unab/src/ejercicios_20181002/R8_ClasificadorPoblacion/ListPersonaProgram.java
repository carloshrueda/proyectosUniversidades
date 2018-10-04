package ejercicios_20181002.R8_ClasificadorPoblacion;

import java.util.Scanner;
import java.util.ArrayList;

import ejercicios_20181002.R7_MiPropioBanco.InterfazUtilidades;

public class ListPersonaProgram {

	private static void crearPersona(Scanner teclado, ListPersonas lstper) {
		String nomper = "";
		String dir = "";
		String stel = "";
		long ltel = Integer.MIN_VALUE;
		String sedad = "";
		short ledad = Short.MIN_VALUE;
		boolean isnum = false;
		String ssexo = "";
		Sexo sexo = Sexo.FEMENINO;

		InterfazUtilidades.tituloMenu("1. Crear Persona");

		do {
			System.out.print("Nombre? ");
			nomper = teclado.nextLine().trim();
			if (nomper.length() == 0) {
				System.out.println(">>> El Nombre no puede ser vac�o.\n");
			}
		} while (nomper.length() == 0); // haga mientras el nombre sea vacio

		System.out.print("Direcci�n? ");
		dir = teclado.nextLine().trim();

		do {
			System.out.print("Tel�fono? ");
			stel = teclado.nextLine().trim();
			if ((isnum = InterfazUtilidades.isNumeric(stel)) == true) {
				ltel = Integer.parseInt(stel);
			} else {
				System.out.println(">>> El Telefono debe ser num�rico.\n");
			}
		} while ((isnum == false) || (ltel < 0)); // haga mientras el telefono no sea num�rico o sea negativo

		do {
			System.out.print("Edad? ");
			sedad = teclado.nextLine().trim();
			if ((isnum = InterfazUtilidades.isNumeric(sedad)) == true) {
				ledad = Short.parseShort(sedad);
			} else {
				System.out.println(">>> La edad debe ser num�rico [1 - 130].\n");
			}
			if ((isnum == true) && ((ledad < 0) || (ledad > 130))) {
				System.out.println(">>> La edad debe ser num�rico [1 - 130].\n");
			}

		} while ((isnum == false) || (ledad < 0) || (ledad > 130)); // haga mientras el edad no sea num�rico o no
																	// este entre 1 - 130

		do {
			System.out.print("Sexo [F:femenino o M:m�sculino] ? ");
			ssexo = teclado.nextLine().trim().toUpperCase();
			if (ssexo.length() == 0) {
				System.out.println(">>> El Sexo no puede ser vac�o [F, M].\n");
			} else if (ssexo.length() > 1) {
				System.out.println(">>> El Sexo debe ser [F, M].\n");
			} else if (("F".equals(ssexo) == false) && ("M".equals(ssexo) == false)) {
				System.out.println(">>> El Sexo debe ser [F, M].\n");
			}
		} while ((ssexo.length() == 0) || (ssexo.length() > 1)
				|| (("F".equals(ssexo) == false) && ("M".equals(ssexo) == false))); // haga mientras el nombre sea vacio

		if ("F".equals(ssexo) == true) {
			sexo = Sexo.FEMENINO;
		} else {
			sexo = Sexo.MASCULINO;
		}

		// Agregar persona
		lstper.agregarPersona(new Persona(nomper, dir, ltel, ledad, sexo));

		System.out.println("\n>>> Persona creada. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void listarPoblacion(Scanner teclado, ListPersonas lstper) {
		InterfazUtilidades.tituloMenu("2. Listar Poblaci�n");

		System.out.println("NOMBRE PERSONA");
		System.out.println("-----------------");
		for (Persona per : lstper.getListPersonas()) {
			System.out.println(per.getNombre());
		}

		System.out.println("\n>>> Fin lista de poblaci�n. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void cantidadPoblacion(Scanner teclado, ListPersonas lstper) {
		InterfazUtilidades.tituloMenu("3. Cantidad de Personas en Poblaci�n");

		System.out.println("N�mero de personas: " + lstper.cantPersonas());

		System.out.println("\n>>> Fin cantidad de personas. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void buscarPersonaNombre(Scanner teclado, ListPersonas lstper) {
		String nomper = "";

		InterfazUtilidades.tituloMenu("4. Buscar Persona por Nombre");

		do {
			System.out.print("Nombre? ");
			nomper = teclado.nextLine().trim();
			if (nomper.length() == 0) {
				System.out.println(">>> El Nombre no puede ser vac�o.\n");
			}
		} while (nomper.length() == 0); // haga mientras el nombre sea vacio

		ArrayList<Persona> lstperenc = lstper.buscarPersona(nomper);
		System.out.println("\nPersonas encontradas: " + lstperenc.size());
		if (lstperenc.size() > 0) {
			System.out.println("NOMBRE\t\t| EDAD");
			System.out.println("-------------------------------------");
			int cont = 0;
			for (Persona persona : lstperenc) {
				System.out.println(++cont + ". " + persona.getNombre() + "\t\t" + persona.getEdad());
			}

		}

		System.out.println("\n>>> Fin lista de poblaci�n por nombre. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void buscarPersonaRangoEdad(Scanner teclado, ListPersonas lstper) {
		String sedadIni = "";
		String sEdadFin = "";
		short edadIni = Short.MIN_VALUE;
		short edadFin = Short.MIN_VALUE;
		boolean isnum = false;

		InterfazUtilidades.tituloMenu("5. Buscar Persona por Rango Edad");

		do {
			do {
				System.out.print("L�mite Edad inicial? ");
				isnum = false;
				sedadIni = teclado.nextLine().trim();
				if ((isnum = InterfazUtilidades.isNumeric(sedadIni)) == true) {
					edadIni = Short.parseShort(sedadIni);
				} else {
					System.out.println(">>> La edad debe ser num�rico [1 - 130].\n");
				}
				if ((isnum == true) && ((edadIni < 0) || (edadIni > 130))) {
					System.out.println(">>> La edad debe ser num�rico [1 - 130].\n");
				}

			} while ((isnum == false) || (edadIni < 0) || (edadIni > 130)); // haga mientras el edad no sea num�rico o
																			// no
																			// este entre 1 - 130

			do {
				System.out.print("L�mite Edad final? ");
				isnum = false;
				sEdadFin = teclado.nextLine().trim();
				if ((isnum = InterfazUtilidades.isNumeric(sEdadFin)) == true) {
					edadFin = Short.parseShort(sEdadFin);
				} else {
					System.out.println(">>> La edad debe ser num�rico [1 - 130].\n");
				}
				if ((isnum == true) && ((edadFin < 0) || (edadFin > 130))) {
					System.out.println(">>> La edad debe ser num�rico [1 - 130].\n");
				}

			} while ((isnum == false) || (edadFin < 0) || (edadFin > 130)); // haga mientras el edad no sea num�rico o
																			// no
																			// este entre 1 - 130

			if (edadIni > edadFin) {
				System.out
						.println(">>> La edad Inicial es mayor que la edad Final. \n>>> Ingrese los datos nuevamente.");
			}
		} while (edadIni > edadFin);

		ArrayList<Persona> lstperenc = lstper.buscarPersonaRangoEdad(edadIni, edadFin);
		System.out.println("\nPersonas encontradas: " + lstperenc.size());
		if (lstperenc.size() > 0) {
			System.out.println("NOMBRE\t\t| EDAD");
			System.out.println("-------------------------------------");
			int cont = 0;
			for (Persona persona : lstperenc) {
				System.out.println(++cont + ". " + persona.getNombre() + "\t\t" + persona.getEdad());
			}

		}
		System.out.println("\n>>> Fin lista de poblaci�n por edad. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void buscarPersonaMasVieja(Scanner teclado, ListPersonas lstper) {
		InterfazUtilidades.tituloMenu("6. Persona M�s Vieja");

		System.out.println("Persona de mayor edad del listado: ");
		System.out.println("--------------------------------------------");
		System.out.println(lstper.getPersonaMasVieja().toString());
		System.out.println("--------------------------------------------");

		System.out.println("\n>>> Fin listado persona m�s vieja. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void buscarPersonaMasJoven(Scanner teclado, ListPersonas lstper) {
		InterfazUtilidades.tituloMenu("7. Persona M�s Joven");

		System.out.println("Persona de menor edad del listado: ");
		System.out.println("--------------------------------------------");
		System.out.println(lstper.getPersonaMasJoven().toString());
		System.out.println("--------------------------------------------");

		System.out.println("\n>>> Fin listado persona m�s joven. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void mostrarPromEdadPoblacion(Scanner teclado, ListPersonas lstper) {
		InterfazUtilidades.tituloMenu("8. Promedio Edad Poblacion");

		System.out.println("Promedio de edad de la poblaci�n: ");
		System.out.println("--------------------------------------------");
		System.out.println("Promedio: " + lstper.getPromEdad());
		System.out.println("--------------------------------------------");

		System.out.println("\n>>> Fin promedio edad. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void mostrarPromEdadMujeres(Scanner teclado, ListPersonas lstper) {
		InterfazUtilidades.tituloMenu("9. Promedio Edad Mujeres");

		System.out.println("Promedio de edad de las mujeres: ");
		System.out.println("--------------------------------------------");
		System.out.println("Promedio: " + lstper.getPromEdadMujeres());
		System.out.println("--------------------------------------------");

		System.out.println("\n>>> Fin promedio edad mujeres. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void mostrarPromEdadHombres(Scanner teclado, ListPersonas lstper) {
		InterfazUtilidades.tituloMenu("10. Promedio Edad Hombres");

		System.out.println("Promedio de edad de las hombres: ");
		System.out.println("--------------------------------------------");
		System.out.println("Promedio: " + lstper.getPromEdadHombres());
		System.out.println("--------------------------------------------");

		System.out.println("\n>>> Fin promedio edad hombres. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void listarPoblacionMujeres(Scanner teclado, ListPersonas lstper) {
		InterfazUtilidades.tituloMenu("11. Mostrar Mujeres de la Poblaci�n");

		System.out.println("NOMBRE\t\t| EDAD");
		System.out.println("-------------------------------------");
		if (lstper.getListMujeres().size() > 0) {
			int cont = 0;
			for (Persona persona : lstper.getListMujeres()) {
				System.out.println(++cont + ". " + persona.getNombre() + "\t\t" + persona.getEdad());
			}

		}

		System.out.println("\n>>> Fin lista de poblaci�n. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void listarPoblacionHombres(Scanner teclado, ListPersonas lstper) {
		InterfazUtilidades.tituloMenu("12. Mostrar Hombres de la Poblaci�n");

		System.out.println("NOMBRE\t\t| EDAD");
		System.out.println("-------------------------------------");
		if (lstper.getListHombres().size() > 0) {
			int cont = 0;
			for (Persona persona : lstper.getListHombres()) {
				System.out.println(++cont + ". " + persona.getNombre() + "\t\t" + persona.getEdad());
			}

		}

		System.out.println("\n>>> Fin lista de poblaci�n. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	public static void main(String[] args) {
		ListPersonas lstper = new ListPersonas();

		Scanner teclado = new Scanner(System.in);
		int opcion;

		do {
			opcion = InterfazUtilidades.Menu(teclado, "Mi Banco",
					new String[] { " 1. Agregar Persona", " 2. Listar Poblaci�n",
							" 3. Cantidad de Personas en Poblaci�n", " 4. Buscar Persona por Nombre",
							" 5. Buscar Persona por Rango Edad", " 6. Persona M�s Vieja", " 7. Persona M�s Joven",
							" 8. Promedio Edad Poblacion", " 9. Promedio Edad Mujeres", " 10. Promedio Edad Hombres",
							"11. Mostrar Mujeres de la Poblaci�n", "12. Mostrar Hombres de la Poblaci�n", "13. Salir" },
					1, 13);

			switch (opcion) {
			case 1:
				crearPersona(teclado, lstper);
				break;

			case 2:
				listarPoblacion(teclado, lstper);
				break;

			case 3:
				cantidadPoblacion(teclado, lstper);
				break;
			case 4:
				buscarPersonaNombre(teclado, lstper);
				break;

			case 5:
				buscarPersonaRangoEdad(teclado, lstper);
				break;

			case 6:
				buscarPersonaMasVieja(teclado, lstper);
				break;

			case 7:
				buscarPersonaMasJoven(teclado, lstper);
				break;

			case 8:
				mostrarPromEdadPoblacion(teclado, lstper);
				break;

			case 9:
				mostrarPromEdadMujeres(teclado, lstper);
				break;

			case 10:
				mostrarPromEdadHombres(teclado, lstper);
				break;
				
			case 11:
				listarPoblacionMujeres(teclado, lstper);
				break;
				
			case 12:
				listarPoblacionHombres(teclado, lstper);
				break;

			default:
				break;
			}

		} while (opcion != 13);

		teclado.close();

		System.out.println("\n>>> GRACIAS POR USAR EL SOFTWARE. ADIOS.");

	}

}

/*
 * R8 - Clasificador de poblaci�n Realizar un programa que sea capaz de
 * almacenar los datos de personas: nombre, direcci�n, telefono, edad y otro
 * m�s. Realizar un men� que permita las siguientes operaciones: - Mostrar la
 * lista de toda la poblaci�n (Nombres) - Mostrar la cantidad de personas de la
 * poblaci�n - Buscar personas por su nombre o parte del nombre y listarlas
 * mostrando: el numero de personas encontradas el nombre y la edad de cada una
 * en forma de lista. - Buscar personas y listarlas de la misma forma que el
 * punto anterior por medio de un rango de edades (edad inicial y edad final) -
 * Mostrar las personas m�s vieja y su edad - Mostrar la persona m�s joven y su
 * edad - Sacar el promedio de edad de toda la poblaci�n - Mostrar los hombres
 * de la poblaci�n - Mostrar las mujeres de la poblaci�n - Sacar el promedio de
 * edad de la poblaci�n de hombre y mujeres respectivamente seg�n se ecoja -
 * Salir del programa
 */