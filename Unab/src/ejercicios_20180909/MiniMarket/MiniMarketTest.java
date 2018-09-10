package ejercicios_20180909.MiniMarket;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MiniMarketTest {
	
	private static boolean isInt(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	private static boolean isDouble(String cadena) {
		try {
			Double.parseDouble(cadena);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}
	
	public static void crearProductos(MiniMarket mn) {
		System.out.println("\n\n\t\t*** 1. CREAR PRODUCTOS ***\n");
		
		System.out.println("Creando 5 Alimentos... ");
		mn.addAlimento("Papa", 1000, 100, 10, "libras", 1);
		mn.addAlimento("Banano", 200, 5, 10, "libras", 1);
		mn.addAlimento("Yuca", 200, 60, 5, "libras", 1);
		mn.addAlimento("Arroz", 1500, 80, 20, "libras", 1);
		mn.addAlimento("Naranjas", 1600, 30, 100, "libras", 1);
		
		System.out.println("Creando 5 Medicamentos... ");
		//String nombre, int valor, int existencia, int reorden, String laboratorio, int lote, Date fechaven, Double tempalmacen
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			mn.addMedicamento("Acetaminofen", 100, 1000, 500, "Bayer", 1500, sdf.parse("2018-12-12"), 60.5);
			mn.addMedicamento("Dolex", 1500, 2000, 600, "Mk", 124, sdf.parse("2020-12-12"), 70.5);
			mn.addMedicamento("Terramicina", 2000, 500, 1000, "Bayer", 1500, sdf.parse("2032-12-12"), 60.5);
			mn.addMedicamento("Medicamento 4", 50000, 100, 200, "MK", 2421, sdf.parse("2018-12-31"), 50.5);
			mn.addMedicamento("Medicamento 5", 800, 10, 500, "Bayer", 124, sdf.parse("2018-12-28"), 80.5);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Creando 5 Ropa... ");
		//nombre, valor, existencia, reorden, genero, talla, material, color
		mn.addRopa("Camisa", 20000, 20, 10, 'M', "XS", "Algodon", "Rojo");
		mn.addRopa("Camisa", 30000, 30, 15, 'M', "L", "Algodon", "Rojo");
		mn.addRopa("Bleiser", 50000, 10, 10, 'M', "S", "Algodon", "Rojo");
		mn.addRopa("Blusa", 60000, 50, 60, 'M', "M", "Algodon", "Rojo");
		mn.addRopa("Camiseta", 25000, 5, 10, 'M', "XL", "Algodon", "Rojo");
		
		System.out.println("\n\n");
		
	}
	
	public static void main(String[] args) {
		String opcion;
		Scanner entrada = new Scanner(System.in);
		
		MiniMarket mn= new MiniMarket();
		
		do {
			System.out.println("\t\t*** MENU ***\n");
			System.out.println("1. Crear productos");
			System.out.println("2. Listar productos que requieren una orden de compra");
			System.out.println("0. Salir");
			System.out.print("\t>>>OPCION [0 - 2]? ");
			
			opcion = entrada.nextLine();
			if (isInt(opcion) == true) {
				int iop = Integer.parseInt(opcion);
				switch (iop) {
				case 1:
					crearProductos(mn);
					break;
				case 2:
					//listarFiguras(hpr);
					break;
				default:
					break;
				}
			}
		} while ("0".equals(opcion) == false);
		
		entrada.close();
	}

}
