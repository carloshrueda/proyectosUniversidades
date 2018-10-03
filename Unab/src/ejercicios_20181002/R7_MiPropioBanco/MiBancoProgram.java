package ejercicios_20181002.R7_MiPropioBanco;

import java.util.Scanner;

public class MiBancoProgram {

	private static void crearCliente(Scanner teclado, MiBanco mb) {
		String nomcli = "";
		String ssaldo = "";
		long lsaldo = Integer.MIN_VALUE;
		boolean isnum = false;

		InterfazUtilidades.tituloMenu("1. Crear Cliente");

		do {
			System.out.print("Nombre del cliente? ");
			nomcli = teclado.nextLine().trim();
		} while (nomcli.length() == 0); // haga mientras el nombre sea vacio

		do {
			System.out.print("Saldo? ");
			ssaldo = teclado.nextLine().trim();
			if ((isnum = InterfazUtilidades.isNumeric(ssaldo)) == true) {
				lsaldo = Integer.parseInt(ssaldo);
			}
		} while ((isnum == false) || (lsaldo < 0)); // haga mientras el saldo no sea numérico o sea negativo

		// Agregar cuenta
		mb.agregarCuenta(nomcli.toUpperCase(), lsaldo);

		System.out.println("\n>>> Cliente creado. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void listarCliente(Scanner teclado, MiBanco mb) {
		InterfazUtilidades.tituloMenu("2. Listar Cliente");

		System.out.println("NUMERO CUENTA\t| NOMBRE CLIENTE\t\t| SALDO");
		System.out.println("------------------------------------------------------------------------");
		for (Cuenta cuenta : mb.getListCuentas()) {
			System.out.println(cuenta.getNumcuenta() + "\t\t  " + cuenta.getCliente().getNombre() + "\t\t\t   "
					+ cuenta.getSaldo());
		}

		System.out.println("\n>>> Fin lista de clientes. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void verSaldoCliente(Scanner teclado, MiBanco mb) {
		String snumcuenta = "";
		long lnumcuenta = Integer.MIN_VALUE;
		boolean isnum = false;

		InterfazUtilidades.tituloMenu("3. Ver Saldo Cliente");

		do {
			System.out.print("Número de Cuenta? ");
			snumcuenta = teclado.nextLine().trim();
			if ((isnum = InterfazUtilidades.isNumeric(snumcuenta)) == true) {
				lnumcuenta = Integer.parseInt(snumcuenta);
			}
		} while ((isnum == false) || (lnumcuenta < 0)); // haga mientras el numcuenta no sea numérico o sea negativo

		Cuenta cuenta = null;
		if ((cuenta = mb.buscarCuenta(lnumcuenta)) != null) {
			System.out.println("\n----------------------------------------");
			System.out.println(cuenta);
			System.out.println("----------------------------------------\n");

		} else {
			System.out.println("No existe Cliente con ese número de cuenta.");
		}

		System.out.println("\n>>> Fin Saldo de Cliente. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void editarNombreCliente(Scanner teclado, MiBanco mb) {
		String snumcuenta = "";
		long lnumcuenta = Integer.MIN_VALUE;
		boolean isnum = false;

		InterfazUtilidades.tituloMenu("4. Editar Nombre Cliente");

		do {
			System.out.print("Número de Cuenta? ");
			snumcuenta = teclado.nextLine().trim();
			if ((isnum = InterfazUtilidades.isNumeric(snumcuenta)) == true) {
				lnumcuenta = Integer.parseInt(snumcuenta);
			}
		} while ((isnum == false) || (lnumcuenta < 0)); // haga mientras el numcuenta no sea numérico o sea negativo

		Cuenta cuenta = null;
		String nomcli;
		if ((cuenta = mb.buscarCuenta(lnumcuenta)) != null) {
			do {
				System.out.println("\nNombre anterior del cliente: " + cuenta.getCliente().getNombre());
				System.out.print("Nombre nuevo del cliente? ");
				nomcli = teclado.nextLine().trim();
			} while (nomcli.length() == 0); // haga mientras el nombre sea vacio

			cuenta.getCliente().setNombre(nomcli.toUpperCase());

		} else {
			System.out.println("No existe Cliente con ese número de cuenta.");
		}

		System.out
				.println("\n>>> El nombre del cliente ha sido cambiado. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void depositarDineroCuenta(Scanner teclado, MiBanco mb) {
		String snumcuenta = "";
		long lnumcuenta = Integer.MIN_VALUE;
		boolean isnum = false;

		InterfazUtilidades.tituloMenu("5. Depositar Dinero en Cuenta");

		do {
			System.out.print("Número de Cuenta? ");
			snumcuenta = teclado.nextLine().trim();
			if ((isnum = InterfazUtilidades.isNumeric(snumcuenta)) == true) {
				lnumcuenta = Integer.parseInt(snumcuenta);
			}
		} while ((isnum == false) || (lnumcuenta < 0)); // haga mientras el numcuenta no sea numérico o sea negativo

		Cuenta cuenta = null;
		String sdeposito = "";
		long ldeposito = Integer.MIN_VALUE;
		if ((cuenta = mb.buscarCuenta(lnumcuenta)) != null) {
			do {
				System.out.println("\nSaldo anterior: " + cuenta.getSaldo());
				System.out.print("Cantidad a depositar? ");
				sdeposito = teclado.nextLine().trim();
				if ((isnum = InterfazUtilidades.isNumeric(sdeposito)) == true) {
					ldeposito = Integer.parseInt(sdeposito);
					if (ldeposito < 0) {
						System.out.println("El valor del deposito debe ser mayor igual que cero.");
					}
				}
			} while ((isnum == false) || (ldeposito < 0)); // haga mientras el deposito no sea numérico o sea negativo

			cuenta.setSaldo(cuenta.getSaldo() + ldeposito);
			System.out.println("\nSaldo nuevo: " + cuenta.getSaldo());

		} else {
			System.out.println("No existe Cliente con ese número de cuenta.");
		}

		System.out.println("\n>>> El deposito ha sido realizado. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void retirarDineroCuenta(Scanner teclado, MiBanco mb) {
		String snumcuenta = "";
		long lnumcuenta = Integer.MIN_VALUE;
		boolean isnum = false;

		InterfazUtilidades.tituloMenu("6. Retirar Dinero en Cuenta");

		do {
			System.out.print("Número de Cuenta? ");
			snumcuenta = teclado.nextLine().trim();
			if ((isnum = InterfazUtilidades.isNumeric(snumcuenta)) == true) {
				lnumcuenta = Integer.parseInt(snumcuenta);
			}
		} while ((isnum == false) || (lnumcuenta < 0)); // haga mientras el numcuenta no sea numérico o sea negativo

		Cuenta cuenta = null;
		String sdeposito = "";
		long lretiro = Integer.MIN_VALUE;
		long nuevosaldo = Integer.MIN_VALUE;
		if ((cuenta = mb.buscarCuenta(lnumcuenta)) != null) {
			do {
				System.out.println("\nSaldo anterior: " + cuenta.getSaldo());
				System.out.print("Cantidad a retirar? ");
				sdeposito = teclado.nextLine().trim();
				if ((isnum = InterfazUtilidades.isNumeric(sdeposito)) == true) {
					lretiro = Integer.parseInt(sdeposito);
					if (lretiro < 0) {
						System.out.println("El valor del retiro debe ser mayor igual que cero.");
					} else if ((nuevosaldo = cuenta.getSaldo() - lretiro) < 0) {
						System.out
								.println("No se puede realizar el retiro por que el retiro es mayor al saldo actual.");
					}
				}
			} while ((isnum == false) || (lretiro < 0) || (nuevosaldo < 0)); // haga mientras el deposito no sea
																				// numérico o sea negativo

			cuenta.setSaldo(nuevosaldo);
			System.out.println("\nSaldo nuevo: " + cuenta.getSaldo());

		} else {
			System.out.println("No existe Cliente con ese número de cuenta.");
		}

		System.out
				.println("\n>>> El retiro del dinero ha sido realizado. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	private static void cancelarCuenta(Scanner teclado, MiBanco mb) {
		String snumcuenta = "";
		long lnumcuenta = Integer.MIN_VALUE;
		boolean isnum = false;

		InterfazUtilidades.tituloMenu("7. Cancelar Cuenta");

		do {
			System.out.print("Número de Cuenta? ");
			snumcuenta = teclado.nextLine().trim();
			if ((isnum = InterfazUtilidades.isNumeric(snumcuenta)) == true) {
				lnumcuenta = Integer.parseInt(snumcuenta);
			}
		} while ((isnum == false) || (lnumcuenta < 0)); // haga mientras el numcuenta no sea numérico o sea negativo

		Cuenta cuenta = null;
		if ((cuenta = mb.buscarCuenta(lnumcuenta)) != null) {

		} else {
			System.out.println("No existe Cliente con ese número de cuenta.");
		}

		System.out.println("\n>>> La cuenta ha sido cancelada. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	public static void main(String[] args) {
		MiBanco mb = new MiBanco();
		Scanner teclado = new Scanner(System.in);
		int opcion;

		do {
			opcion = InterfazUtilidades.Menu(teclado, "Mi Banco",
					new String[] { "1. Crear Cliente", "2. Listar Clientes", "3. Ver Saldo Cliente",
							"4. Editar Nombre Cliente", "5. Depositar Dinero en Cuenta", "6. Retirar Dinero en Cuenta",
							"7. Cancelar Cuenta", "8. Salir del Banco" },
					1, 8);

			switch (opcion) {
			case 1:
				crearCliente(teclado, mb);
				break;

			case 2:
				listarCliente(teclado, mb);
				break;

			case 3:
				verSaldoCliente(teclado, mb);
				break;

			case 4:
				editarNombreCliente(teclado, mb);
				break;

			case 5:
				depositarDineroCuenta(teclado, mb);
				break;

			case 6:
				retirarDineroCuenta(teclado, mb);
				break;

			case 7:
				cancelarCuenta(teclado, mb);
				break;

			default:
				break;
			}
		} while (opcion != 8);

		teclado.close();

		System.out.println("\n>>> GRACIAS POR USAR EL SOFTWARE. ADIOS.");

	}

}

/*
 * R7: MI PROPIO BANCO
 * 
 * Realiza un programa que me permita simular un banco manejando clientes y sus
 * cuentas, mediante un menú así: 1. Ver lista de clientes: Lista de los nombres
 * de los clientes y número de cuenta, los números de cuenta los controla el
 * sistema y son consecutivos 2. Ver saldo de un cliente a partir de su numero
 * de cuenta 3. Crear un cliente con nombre y saldo inicial 4. Editar el nombre
 * de un cliente. a partir de un listado de clientes 5. Depositar dinero a una
 * cuenta (antes de confirmar el depósito mostrar de que cliente es la cuenta))
 * 6. Retirar dinero de una cuenta (no puede retirar más dinero del que hay) 7
 * Cancelar una cuenta: Eliminar una cuenta y al cliente. Debe emitir un cheque
 * por el saldo de la cuenta antes de cancelarla (mostrar un mensaje en
 * pantalla) 8. Salir del banco.
 */
