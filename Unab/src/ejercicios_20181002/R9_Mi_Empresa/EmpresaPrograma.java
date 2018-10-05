package ejercicios_20181002.R9_Mi_Empresa;

import java.util.ArrayList;

//import java.util.Scanner;

public class EmpresaPrograma {

	public static void agregarCargo(Empresa empresa) {
		InterfazUtilidades.tituloMenu("1. Agregar Cargo");

		System.out.println("Ingrese los datos del cargo: ");
		System.out.print("Nombre del cargo? ");
		String nombre = Entrada.cadena().trim().toUpperCase();
		if (nombre.isEmpty() == true) {
			System.out.println(">>> Error. Nombre vacío.");
			System.out.println("\n>>> Fin Agregar Cargo. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		System.out.print("Sueldo del cargo? ");
		int sueldo = Entrada.entero();
		if (sueldo < 1) {
			System.out.println(">>> Error. El sueldo debe ser positivo mayor a cero.");
			System.out.println("\n>>> Fin Agregar Cargo. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		empresa.agregarCargo(nombre, sueldo);

		System.out.println("\n>>> Fin Agregar Cargo. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void listarCargos(Empresa empresa) {
		InterfazUtilidades.tituloMenu("2. Listar Cargos y Sueldos");

		System.out.println("CARGO\t\t | SUELDO");
		System.out.println("---------------------------------------------");
		for (Cargo cargo : empresa.getListCargos()) {
			System.out.println(cargo.getNombre() + "\t\t" + cargo.getSueldo());
		}
		System.out.println("---------------------------------------------");

		System.out.println("\n>>> Fin Listasr Cargos. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void editarNombreCargo(Empresa empresa) {
		InterfazUtilidades.tituloMenu("3. Editar Nombre de Cargo");

		System.out.print("Nombre de cargo a editar? ");
		String nombre = Entrada.cadena().trim().toUpperCase();
		if (nombre.isEmpty() == true) {
			System.out.println(">>> Error. Nombre vacío.");
			System.out.println("\n>>> Fin Editar Nombre de Cargo. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		Cargo cargo = empresa.buscarCargo(nombre);
		if (cargo == null) {
			System.out.println(">> Un Cargo con ese nombre no existe.");
			System.out.println("\n>>> Fin Editar Nombre de Cargo. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		System.out.println("\nCargo Encontrado.");
		System.out.println("Nombre anterior: " + cargo.getNombre());
		System.out.print("Nuevo nombre de cargo? ");
		nombre = Entrada.cadena().trim().toUpperCase();
		if (nombre.isEmpty() == true) {
			System.out.println(">>> Error. Nombre vacío.");
			System.out.println("\n>>> Fin Editar Nombre de Cargo. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		cargo.setNombre(nombre);

		System.out.println("\n>>> Fin Editar Nombre de Cargo. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void editarSueldoCargo(Empresa empresa) {
		InterfazUtilidades.tituloMenu("4. Editar Sueldo de Cargo");

		System.out.print("Nombre de cargo a editar el sueldo? ");
		String nombre = Entrada.cadena().trim().toUpperCase();
		if (nombre.isEmpty() == true) {
			System.out.println(">>> Error. Nombre vacío.");
			System.out.println("\n>>> Fin Editar Sueldo de Cargo. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		Cargo cargo = empresa.buscarCargo(nombre);
		if (cargo == null) {
			System.out.println(">> Un Cargo con ese nombre no existe.");
			System.out.println("\n>>> Fin Editar Sueldo de Cargo. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		System.out.println("\nCargo Encontrado.");
		System.out.println("Nombre: " + cargo.getNombre());
		System.out.println("Sueldo Anterior: " + cargo.getSueldo());
		System.out.print("Nuevo sueldo de cargo? ");
		int sueldo = Entrada.entero();
		if (sueldo < 1) {
			System.out.println(">>> Error. El sueldo debe ser positivo mayor a cero.");
			System.out.println("\n>>> Fin Editar Sueldo de Cargo. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		cargo.setSueldo(sueldo);

		System.out.println("\n>>> Fin Editar Sueldo de Cargo. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void reorganizarJerarquia(Empresa empresa) {
		InterfazUtilidades.tituloMenu("5. Reorganizar Jerarquía");

		System.out.println("Se listará todos los cargos para que reorganice la jerarquía");
		for (Cargo cargo : empresa.getListCargos()) {
			System.out.println("\n" + cargo.toString());

			System.out.print("Nuevo nivel de jerarquia? ");
			int jerarquia = Entrada.entero();
			if (jerarquia < 1) {
				System.out.println(">>> Error en el nuevo nivel de jerarquía; se dejará el que estaba anteriormente.");

			} else {
				cargo.setJerarquia(jerarquia);
				System.out.println(">>> Jerarquía cambiada");
			}
		}

		empresa.ajustarNivelJerarquia();

		System.out.println("\n>>> Fin Reorganizar Niveles de Jerarquía. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void agregarEmpleado(Empresa empresa) {
		InterfazUtilidades.tituloMenu("6. Agregar Empleado");

		System.out.println("Ingrese los datos del empleado a agregar: ");
		System.out.print("Nombre del empleado? ");
		String nombre = Entrada.cadena().trim().toUpperCase();
		if (nombre.isEmpty() == true) {
			System.out.println(">>> Error. Nombre del empleado vacío.");
			System.out.println("\n>>> Fin Agregar Empleado. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		System.out.print("Nombre del cargo? ");
		String nombreCargo = Entrada.cadena().trim().toUpperCase();
		if (nombreCargo.isEmpty() == true) {
			System.out.println(">>> Error. Nombre del cargo vacío.");
			System.out.println("\n>>> Fin Agregar Empleado. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}
		Cargo cargo = empresa.buscarCargoExacto(nombreCargo);
		if (cargo != null) {
			// cargo existe
			empresa.agregarEmpleado(new Empleado(nombre, cargo));

		} else {
			// cargo no existe
			System.out.println(">>> Error. No existe un Cargo con ese nombre exacto.");
			System.out.println("\n>>> Fin Agregar Empleado. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		System.out.println("\n>>> Fin Agregar Empleado. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void listarEmpleadoCargo(Empresa empresa) {
		InterfazUtilidades.tituloMenu("7. Listar Empleados por Cargo");

		System.out.print("Nombre del cargo? ");
		String nombre = Entrada.cadena().trim().toUpperCase();
		if (nombre.isEmpty() == true) {
			System.out.println(">>> Error. Nombre del cargo vacío.");
			System.out.println("\n>>> Fin Lista de Empleado por Cargo. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		System.out.println("\nNOMBRE EMPLEADO");
		System.out.println("--------------------------------------");
		for (Empleado empleado : empresa.getListEmpleados()) {
			if (nombre.equals(empleado.getCargo().getNombre()) == true) {
				// Si el nombre del cargo es igual al nombre del cargo del empleado en la lista
				// de empleados
				System.out.println(empleado.getNombre());
			}

		}

		System.out.println("\n>>> Fin Lista de Empleado por Cargo. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void editarNombreEmpleado(Empresa empresa) {
		InterfazUtilidades.tituloMenu("8. Editar Nombre Empleado");

		System.out.println("NOMBRE EMPLEADO");
		System.out.println("----------------------------------------------");
		int cont = 0;
		for (Empleado empleado : empresa.getListEmpleados()) {
			System.out.println(++cont + ". " + empleado.getNombre());
		}

		System.out.print("\nNúmero de empleado de la lista a editar nombre? ");
		int numempleado = Entrada.entero();
		if ((numempleado < 1) || (numempleado > cont)) {
			System.out.println(">>> Error. Número de empleado inválido.");
			System.out.println("\n>>> Fin Editar Nombre de Empleado. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		Empleado empleado = empresa.getListEmpleados().get(numempleado - 1);
		System.out.println("Nombre anterior del empleado: " + empleado.getNombre());
		System.out.print("Nuevo nombre del empleado: ");
		String nombre = Entrada.cadena().trim().toUpperCase();
		if (nombre.isEmpty() == true) {
			System.out.println(">>> Error. Nombre del empleado vacío.");
			System.out.println("\n>>> Fin Agregar Empleado. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		empleado.setNombre(nombre);

		System.out.println("\n>>> Fin Editar Nombre de Empleado. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void buscarEmpleadoCargoParteNombre(Empresa empresa) {
		InterfazUtilidades.tituloMenu("9. Buscar Empleado por Cargo y parte de su Nombre");

		System.out.print("Cargo? ");
		String cargo = Entrada.cadena().trim().toUpperCase();
		if (cargo.isEmpty()) {
			System.out.println(">>> Error. Cargo vacío.");
			System.out.println(
					"\n>>> Fin Buscar Empleado por Cargo y parte de su Nombre. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		System.out.print("Nombre? ");
		String nombre = Entrada.cadena().trim().toUpperCase();
		if (nombre.isEmpty()) {
			System.out.println(">>> Error. Nombre vacío.");
			System.out.println(
					"\n>>> Fin Buscar Empleado por Cargo y parte de su Nombre. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		// contar los empelados encontrados
		int cont = 0;
		for (Empleado empleado : empresa.getListEmpleados()) {
			if ((cargo.equals(empleado.getCargo().getNombre()) == true)
					&& (empleado.getNombre().indexOf(nombre) > -1)) {
				// existe un empleado con el cargo exacto y parte del nombre
				++cont;
			}
		}
		System.out.println("\nEmpleado encontrados: " + cont);
		System.out.println("\nNOMBRE DEL EMPLEADO");
		System.out.println("------------------------------------");
		for (Empleado empleado : empresa.getListEmpleados()) {
			if ((cargo.equals(empleado.getCargo().getNombre()) == true)
					&& (empleado.getNombre().indexOf(nombre) > -1)) {
				// existe un empleado con el cargo exacto y parte del nombre
				System.out.println(empleado.getNombre());
			}
		}

		System.out.println(
				"\n>>> Fin Buscar Empleado por Cargo y parte de su Nombre. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void listarEmpleadoCargoNombre(Empresa empresa) {
		InterfazUtilidades.tituloMenu("10. Listar Empleados Ordenada por Cargo y Nombre");

		System.out.println("CARGO\t | NOMBRE");
		System.out.println("---------------------------------------------------");

		ArrayList<Empleado> listEmpleadosOrdenada = empresa.ordenarCargoNombre();
		for (Empleado empleado : listEmpleadosOrdenada) {
			System.out.println(empleado.getCargo().getNombre() + "\t " + empleado.getNombre());
		}

		System.out.println(
				"\n>>> Fin Listado Empleados Ordenada por Cargo y Nombre. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void calcularNomina(Empresa empresa) {
		InterfazUtilidades.tituloMenu("11. Calcular Nómina de Empleados");

		System.out.println("Valor de la nómina: " + empresa.calcularNomina());

		System.out.println("\n>>> Fin Cálculo de Nómina de Empleados. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void main(String[] args) {
		int opcion;
		Empresa empresa = new Empresa();
		// Scanner teclado = new Scanner(System.in);

		do {
			opcion = InterfazUtilidades.Menu("MI EMPRESA",
					new String[] { " 1. Agregar Cargo", " 2. Listar Cargos y Sueldos", " 3. Editar Nombre de Cargo",
							" 4. Editar Sueldo de Cargo", " 5. Reorganizar Jerarquía", " 6. Agregar Empleado",
							" 7. Listar Empleados por Cargo", " 8. Editar Nombre Empleado",
							" 9. Buscar Empleado por Cargo y parte de su Nombre",
							"10. Listar Empleados Ordenada por Cargo y Nombre", "11. Calcular Nómina de Empleados",
							"12. Salir" },
					1, 12);

			switch (opcion) {
			case 1:
				agregarCargo(empresa);
				break;

			case 2:
				listarCargos(empresa);
				break;

			case 3:
				editarNombreCargo(empresa);
				break;

			case 4:
				editarSueldoCargo(empresa);
				break;

			case 5:
				reorganizarJerarquia(empresa);
				break;

			case 6:
				agregarEmpleado(empresa);
				break;

			case 7:
				listarEmpleadoCargo(empresa);
				break;

			case 8:
				editarNombreEmpleado(empresa);
				break;

			case 9:
				buscarEmpleadoCargoParteNombre(empresa);
				break;

			case 10:
				listarEmpleadoCargoNombre(empresa);
				break;

			case 11:
				calcularNomina(empresa);
				break;

			default:
				break;
			}

		} while (opcion != 12);

		// teclado.close();

		System.out.println("\n>>> GRACIAS POR USAR EL SOFTWARE. ADIOS.");

	}

}
