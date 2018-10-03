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
		} while ((isnum == false) || (lsaldo < 0)); // haga mientras el saldo no sea numericio o sea negativo

		System.out.println("\n>>> Cliente creado. \nPresione cualquier tecla para continuar....");
		teclado.nextLine();
	}

	public static void main(String[] args) {
		MiBanco mb = new MiBanco();
		Scanner teclado = new Scanner(System.in);
		int opcion;

		do {
			opcion = InterfazUtilidades.Menu(teclado, "Mi Banco",
					new String[] { "1. Crear Cliente", "2. Listar Clientes", "3. Ver Saldo Clientes",
							"4. Editar Nombre Cliente", "5. Depositar Dinero en Cuenta", "6. Retirar Dinero en Cuenta",
							"7. Cancelar Cuenta", "8. Salir del Banco" },
					1, 8);

			switch (opcion) {
			case 1:
				crearCliente(teclado, mb);
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
