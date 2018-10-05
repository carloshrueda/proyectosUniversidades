
package ejercicios_20181002.RA7_Ideota;

/**
 *
 * @author ESTUDIANTE
 */
public class TestFruta {

	public static void agregarFrutaCarrito(Carro carrito) {
		InterfazUtilidades.tituloMenu("1. Agregar Fruta al Carrito de Compras");

		System.out.println("Frutas disponibles:");
		int cont = 0;
		for (TipoFruta fruta : TipoFruta.values()) {
			System.out.println(++cont + ". " + fruta.name());
		}

		//int maxfruta = TipoFruta.values().length;
		System.out.println("\nQue fruta de las disponibles desea agregar (1, " + cont + ")? ");
		int opcion = Entrada.entero();
		if ((opcion < 1) || (opcion > cont)) {
			System.out.println(">>> Error. La opción de fruta no esta disponible.");
			System.out.println(
					"\n>>> Fin Agregar Fruta al Carrito de Compras. \nPresione cualquier tecla para continuar....");
			Entrada.cadena();
			return;
		}

		switch (opcion - 1) {
		case 0:
			carrito.addFruta(new Papaya());
			break;
			
		case 1:
			carrito.addFruta(new Kiwi());
			break;
			
		case 2:
			carrito.addFruta(new Mango());
			break;
			
		case 3:
			carrito.addFruta(new Banano());
			break;
			
		case 4:
			carrito.addFruta(new Naranja());
			break;

		default:
			break;
		}

		System.out.println(
				"\n>>> Fin Agregar Fruta al Carrito de Compras. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}
	
	public static void listarFrutasCarrito(Carro carrito) {
		InterfazUtilidades.tituloMenu("2. Listar Frutas del Carrito de Compras");

		System.out.println("Las frutas en el carrito de compras son:");
		for (Fruta fruta : carrito.getLstFrutas()) {
			System.out.println(fruta.getNombre());
		}

		System.out.println(
				"\n>>> Fin Listado del Carrito de Compras. \nPresione cualquier tecla para continuar....");
		Entrada.cadena();
	}

	public static void main(String[] args) {
		int opcion;
		Carro carrito = new Carro();

		do {
			opcion = InterfazUtilidades.Menu("SUPERMERCA FRUTAS",
					new String[] { " 1. Agregar Fruta al Carrito de Compras",
							" 2. Listar Frutas del Carrito de Compras",
							" 3. Listar Total Calorias del Carrito de Compras",
							" 4. Calcular Precio del Carrito de Compras", " 5. Salir" },
					1, 5);

			switch (opcion) {

			case 1:
				agregarFrutaCarrito(carrito);
				break;
				
			case 2:
				listarFrutasCarrito(carrito);
				break;

			/*
			 * case 2: listarCargos(empresa); break;
			 * 
			 * case 3: editarNombreCargo(empresa); break;
			 * 
			 * case 4: editarSueldoCargo(empresa); break;
			 * 
			 * case 5: reorganizarJerarquia(empresa); break;
			 * 
			 * case 6: agregarEmpleado(empresa); break;
			 * 
			 * case 7: listarEmpleadoCargo(empresa); break;
			 * 
			 * case 8: editarNombreEmpleado(empresa); break;
			 * 
			 * case 9: buscarEmpleadoCargoParteNombre(empresa); break;
			 * 
			 * case 10: listarEmpleadoCargoNombre(empresa); break;
			 * 
			 * case 11: calcularNomina(empresa); break;
			 */
			default:
				break;
			}

		} while (opcion != 5);

		// teclado.close();

		System.out.println("\n>>> GRACIAS POR USAR EL SOFTWARE. ADIOS.");
	}

}
