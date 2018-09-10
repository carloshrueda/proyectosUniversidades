package ejercicios_20180909.HerederoPolimorfismo;

import java.util.Scanner;

public class HerederoPolimorfismo {

	Figura cuadrado = new Cuadrado();
	Figura circulo = new Circulo();
	Figura triangulo = new Triangulo();

	private static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public static void crearCirculo(HerederoPolimorfismo hp, Scanner entrada) {
		int radio;
		String opcion;

		System.out.println("\n\n\t\t*** 1. CREAR CIRCULO ***\n");
		System.out.println("Tamano del radio del c�rculo? ");
		opcion = entrada.nextLine();
		if (isNumeric(opcion) == true) {
			radio = Integer.parseInt(opcion);
			hp.circulo.setLado(radio);
		} else {
			hp.circulo.setLado(0);
		}
		System.out.println("\n\nEl C�rculo ha sido creado ...\n\n");
	}

	public static void crearCuadrado(HerederoPolimorfismo hp, Scanner entrada) {
		int lado;
		String opcion;

		System.out.println("\n\n\t\t*** 2. CREAR CUADRADO ***\n");
		System.out.println("Tamano del lado del cuadrado? ");
		opcion = entrada.nextLine();
		if (isNumeric(opcion) == true) {
			lado = Integer.parseInt(opcion);
			hp.cuadrado.setLado(lado);
		} else {
			hp.cuadrado.setLado(0);
		}
		System.out.println("\n\nEl cuadrado ha sido creado ...\n\n");
	}

	public static void crearTriangulo(HerederoPolimorfismo hp, Scanner entrada) {
		int lado1, lado2, lado3;
		String slado1, slado2, slado3;

		System.out.println("\n\n\t\t*** 3. CREAR TRIANGULO ***\n");
		System.out.println("Tamano del lado 1 del tri�ngulo? ");
		slado1 = entrada.nextLine();
		System.out.println("Tamano del lado 2 del tri�ngulo? ");
		slado2 = entrada.nextLine();
		System.out.println("Tamano del lado 3 del tri�ngulo? ");
		slado3 = entrada.nextLine();

		if (isNumeric(slado1) == true) {
			lado1 = Integer.parseInt(slado1);
		} else {
			lado1 = 0;
		}

		if (isNumeric(slado2) == true) {
			lado2 = Integer.parseInt(slado2);
		} else {
			lado2 = 0;
		}

		if (isNumeric(slado3) == true) {
			lado3 = Integer.parseInt(slado3);
		} else {
			lado3 = 0;
		}

		((Triangulo) hp.triangulo).setLados(lado1, lado2, lado3);

		System.out.println("\n\nEl Tri�ngulo ha sido creado ...\n\n");
	}

	public static void crearFiguras(HerederoPolimorfismo hp, Scanner entrada) {
		String opcion;

		do {
			System.out.println("\n\n\t\t*** 1. CREAR FIGURAS ***\n");
			System.out.println("1. Crear C�rculo");
			System.out.println("2. Crear Cuadrado");
			System.out.println("3. Crear Tri�ngulo");
			System.out.println("0. Volver al men�");
			System.out.print("\t>>>OPCION [0 - 3]? ");

			opcion = entrada.nextLine();
			if (isNumeric(opcion) == true) {
				int iop = Integer.parseInt(opcion);
				switch (iop) {
				case 1:
					crearCirculo(hp, entrada);
					break;
				case 2:
					crearCuadrado(hp, entrada);
					break;
				case 3:
					crearTriangulo(hp, entrada);
					break;

				default:
					break;
				}
			}

		} while ("0".equals(opcion) == false);
	}

	public static void calcularAreas(HerederoPolimorfismo hp) {
		System.out.println("\n\n\t\t*** 2. CALCULAR AREAS ***\n");

		System.out.println("Area del C�rculo: " + hp.circulo.calcularArea());
		System.out.println("Area del Cuadrado: " + hp.cuadrado.calcularArea());
		System.out.println("Area del Tri�ngulo: " + hp.triangulo.calcularArea());

		System.out.println("\n\n");

	}

	public static void calcularPerimetro(HerederoPolimorfismo hp) {
		System.out.println("\n\n\t\t*** 3. CALCULAR PERIMETROS ***\n");

		System.out.println("Per�metro del C�rculo: " + hp.circulo.calcularPerimetro());
		System.out.println("Per�metro del Cuadrado: " + hp.cuadrado.calcularPerimetro());
		System.out.println("Per�metro del Tri�ngulo: " + hp.triangulo.calcularPerimetro());

		System.out.println("\n\n");

	}

	public static void comparar(HerederoPolimorfismo hp, Scanner entrada) {
		String fig1, fig2;
		int ifig1 = 0;
		int ifig2 = 0;
		boolean swerrorfig;

		System.out.println("\n\n\t\t*** 4. COMPARAR FIGURAS ***\n");
		do {
			// Capturar la figura 1
			System.out.println("TIPO DE LA FIGURA 1:");
			System.out.println("1. C�rculo");
			System.out.println("2. Cuadrado");
			System.out.println("3. Tri�ngulo");
			System.out.print("\t>>>Numero de la primera figura que desea comparar [1 - 3]? ");
			fig1 = entrada.nextLine();
			swerrorfig = false;
			if (isNumeric(fig1) == true) {
				ifig1 = Integer.parseInt(fig1);
				if ((ifig1 < 1) || (ifig1 > 3))
					swerrorfig = true;
			} else {
				swerrorfig = true;
			}
		} while (swerrorfig == true);

		do {
			// Capturar la figura 2
			System.out.println("\nTIPO DE LA FIGURAS 2:");
			System.out.println("1. C�rculo");
			System.out.println("2. Cuadrado");
			System.out.println("3. Tri�ngulo");
			System.out.print("\t>>>Numero de la primera figura que desea comparar [1 - 3]? ");
			fig2 = entrada.nextLine();
			swerrorfig = false;
			if (isNumeric(fig2) == true) {
				ifig2 = Integer.parseInt(fig2);
				if ((ifig2 < 1) || (ifig2 > 3))
					swerrorfig = true;
			} else {
				swerrorfig = true;
			}
		} while (swerrorfig == true);

		Figura figura1 = null;
		switch (ifig1) {
		case 1:
			figura1 = hp.circulo;
			break;
		case 2:
			figura1 = hp.cuadrado;
			break;
		case 3:
			figura1 = hp.triangulo;
			break;
		}

		Comparacion resultado = Comparacion.Igual;
		Figura figura2 = null;
		switch (ifig2) {
		case 1:
			figura2 = hp.circulo;
			break;
		case 2:
			figura2 = hp.cuadrado;
			break;
		case 3:
			figura2 = hp.triangulo;
			break;
		}

		if ((figura1 != null) && (figura2 != null))
			resultado = figura1.compararArea(figura2);

		System.out.println("\n\nEl �rea del " + figura1.tipoFigura() + " es " + resultado.toString()
				+ " que el �rea del " + figura2.tipoFigura() + "\n");

	}

	public static void main(String[] args) {
		String opcion;
		Scanner entrada = new Scanner(System.in);

		HerederoPolimorfismo hp = new HerederoPolimorfismo();

		do {
			System.out.println("\t\t*** MENU ***\n");
			System.out.println("1. Crear figuras");
			System.out.println("2. Calcular �reas");
			System.out.println("3. Calcular per�metro");
			System.out.println("4. Comparar �reas de 2 figuras");
			System.out.println("0. Salir");
			System.out.print("\t>>>OPCION [0 - 4]? ");

			opcion = entrada.nextLine();
			if (isNumeric(opcion) == true) {
				int iop = Integer.parseInt(opcion);
				switch (iop) {
				case 1:
					crearFiguras(hp, entrada);
					break;
				case 2:
					calcularAreas(hp);
					break;
				case 3:
					calcularPerimetro(hp);
					break;
				case 4:
					comparar(hp, entrada);
					break;

				default:
					break;
				}
			}

		} while ("0".equals(opcion) == false);

		entrada.close();

	}

}
