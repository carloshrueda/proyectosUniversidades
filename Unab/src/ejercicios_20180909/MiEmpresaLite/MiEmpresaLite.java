package ejercicios_20180909.MiEmpresaLite;

import java.util.Vector;
import java.io.FileInputStream;
import java.util.Scanner;

public class MiEmpresaLite {
	private Vector<Empleado> vempleado;
	private Vector<Operario> voperario;
	private Vector<Directivo> vdirectivo;
	private Vector<Oficial> voficial;
	private Vector<Tecnico> vtecnico;

	public MiEmpresaLite() {
		vempleado = new Vector<Empleado>();
		voperario = new Vector<Operario>();
		vdirectivo = new Vector<Directivo>();
		voficial = new Vector<Oficial>();
		vtecnico = new Vector<Tecnico>();
	}

	public static void limpiarPantalla() {
		// System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	private static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public static void agregar(MiEmpresaLite empresa) {
		String nombre;
		Scanner scnadd = new Scanner(System.in);

		System.out.print("\n\n\n\t\t*** 1. AGREGAR ***\n");
		System.out.println("TIPOS: ");
		System.out.println("1. Empleado");
		System.out.println("2. Operario");
		System.out.println("3. Directivo");
		System.out.println("4. Oficial");
		System.out.println("5. Tecnico");

		do {
			System.out.print("Nombre del empleado: ");
			nombre = scnadd.nextLine();
		} while (nombre.isEmpty() == true); // hacer mientras el nombre no sea vacio

		int tipo;
		// String stipo;

		do {
			System.out.print("Tipo del empleado (1-5): ");
			tipo = scnadd.nextInt();
			scnadd.nextLine();
			/*
			 * stipo = scnadd.nextLine(); if (isNumeric(stipo) == true) { tipo =
			 * Integer.parseInt(stipo); } else { tipo = -1; // stipo no es numerico }
			 */
		} while ((tipo < 1) || (tipo > 5)); // hacer hasta que digite un tipo valido

		switch (tipo) {
		case 1:
			Empleado e = new Empleado(nombre);
			empresa.vempleado.addElement(e);
			System.out.println("\nEmpleado agregado.");
			break;
		case 2:
			Operario op = new Operario(nombre);
			empresa.voperario.addElement(op);
			System.out.println("\nOperario agregado.");
			break;
		case 3:
			Directivo d = new Directivo(nombre);
			empresa.vdirectivo.addElement(d);
			System.out.println("\nDirectivo agregado.");
			break;
		case 4:
			Oficial of = new Oficial(nombre);
			empresa.voficial.addElement(of);
			System.out.println("\nOficial agregado.");
			break;
		case 5:
			Tecnico t = new Tecnico(nombre);
			empresa.vtecnico.addElement(t);
			System.out.println("\nTecnico agregado.");
			break;
		default:
			break;
		}

		// System.out.println("\nPresione Enter para continuar...");
		// scnadd.nextLine();
		//scnadd.close();

	}

	public static void listar(MiEmpresaLite empresa) {
		Scanner scnlistar = new Scanner(System.in);

		System.out.print("\n\n\n\t\t*** 1. LISTAR ***\n");
		System.out.println("TIPOS: ");
		System.out.println("1. Empleado");
		System.out.println("2. Operario");
		System.out.println("3. Directivo");
		System.out.println("4. Oficial");
		System.out.println("5. Tecnico");

		int tipo;
		String stipo;
		do {
			System.out.print("\nTipo que quiere listar (1-5): ");
			stipo = scnlistar.nextLine();
			if (isNumeric(stipo) == true) {
				tipo = Integer.parseInt(stipo);
			} else {
				tipo = -1; // stipo no es numerico
			}
		} while ((tipo < 1) || (tipo > 5)); // hacer hasta que digite un tipo valido

		switch (tipo) {
		case 1:
			System.out.println("\nEmpleados:");
			for (Empleado e : empresa.vempleado) {
				System.out.println(e.toString());
			}
			break;
		case 2:
			System.out.println("\nOperarios:");
			for (Operario e : empresa.voperario) {
				System.out.println(e.toString());
			}
			break;
		case 3:
			System.out.println("\nDirectivos:");
			for (Directivo e : empresa.vdirectivo) {
				System.out.println(e.toString());
			}
			break;
		case 4:
			System.out.println("\nOficiales:");
			for (Oficial e : empresa.voficial) {
				System.out.println(e.toString());
			}
			break;
		case 5:
			System.out.println("\nTecnicos:");
			for (Tecnico e : empresa.vtecnico) {
				System.out.println(e.toString());
			}
			break;
		default:
			break;
		}

		//System.out.println("\nPresione Enter para continuar...");
		//scn.nextLine();
		//scnlistar.close();
	}

	public static void main(String[] args) {
		String opcion = "";

		MiEmpresaLite empresa = new MiEmpresaLite();
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("\n\n\n\t\t*** MENU ***\n");
			System.out.println("1. Agregar");
			System.out.println("2. Listar");
			System.out.println("0. Salir");
			System.out.print("\t>>> Opcion: (0-2)? ");
			opcion = "";
			opcion = entrada.nextLine();
			if (isNumeric(opcion) == true) {
				int iopcion = Integer.parseInt(opcion);
				switch (iopcion) {
				case 1:
					agregar(empresa);
					break;
				case 2:
					listar(empresa);
					break;
				}
			}
		} while (opcion.equals("0") == false);

		entrada.close();
		System.out.print("\n\n*** Gracias por usar el software ***\n");
		System.out.flush();
	}

}
