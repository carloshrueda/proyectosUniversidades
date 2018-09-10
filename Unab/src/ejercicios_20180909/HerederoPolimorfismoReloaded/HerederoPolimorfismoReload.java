package ejercicios_20180909.HerederoPolimorfismoReloaded;

import java.util.ArrayList;
import java.util.Scanner;

import java.awt.Color;

public class HerederoPolimorfismoReload {

	public ArrayList<Geometria> listFiguras = new ArrayList<Geometria>();
	public VentanaCerrable ventana= null;

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

	private static Color isColor(String color) {
		if (color.isEmpty() == true)
			return null;

		String[] vstrcolores = { "WHITE", "LIGHTGRAY", "GRAY", "DARKGRAY", "BLACK", "RED", "PINK", "ORANGE", "YELLOW",
				"GREEN", "MAGENTA", "CYAN", "BLUE" };

		Color[] vcolores = { Color.WHITE, Color.LIGHT_GRAY, Color.GRAY, Color.DARK_GRAY, Color.BLACK, Color.RED,
				Color.PINK, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.MAGENTA, Color.CYAN, Color.BLUE };

		Color resultado = null;

		for (int i = 0; i < vstrcolores.length; i++) {
			if (vstrcolores[i].equals(color) == true) {
				resultado = vcolores[i];
				break;
			}
		}

		return resultado;
	}

	public static void crearRectangulo(HerederoPolimorfismoReload hpr, Scanner entrada) {
		double x1, y1, x2, y2;
		double largo;
		String opcion, strcolor;
		boolean isnum = false;
		Color color = null;

		System.out.println("\n\n\t\t*** 2. CREAR RECTANGULO ***\n");
		do {
			opcion = "";
			x1 = -1;
			System.out.println("Posición del X rectángulo? ");
			opcion = entrada.nextLine();
			isnum = isDouble(opcion);
			if (isnum) {
				x1 = Double.parseDouble(opcion);
			}
		} while ((isnum == false) || (x1 < 1));

		do {
			opcion = "";
			y1 = -1;
			System.out.println("Posición del Y rectángulo? ");
			opcion = entrada.nextLine();
			isnum = isDouble(opcion);
			if (isnum) {
				y1 = Double.parseDouble(opcion);
			}
		} while ((isnum == false) || (y1 < 1));

		do {
			opcion = "";
			largo = -1;
			System.out.println("Largo del Rectángulo? ");
			opcion = entrada.nextLine();
			isnum = isDouble(opcion);
			if (isnum) {
				largo = Double.parseDouble(opcion);
			}
		} while ((isnum == false) || (largo < 0));
		x2 = x1 + largo;

		do {
			opcion = "";
			largo = -1;
			System.out.println("Ancho del Rectángulo? ");
			opcion = entrada.nextLine();
			isnum = isDouble(opcion);
			if (isnum) {
				largo = Double.parseDouble(opcion);
			}
		} while ((isnum == false) || (largo < 0));
		y2 = y1 + largo;

		do {
			strcolor = "";
			System.out.println("Colores: [WHITE, LIGHTGRAY, GRAY, DARKGRAY, "
					+ "BLACK, RED, PINK, ORANGE, YELLOW, GREEN, MAGENTA, CYAN, BLUE]");
			System.out.println("Color círculo? ");
			strcolor = entrada.nextLine();
			if (strcolor.isEmpty() == false) {
				strcolor = strcolor.trim(); // quito espacios en blanco
				if (strcolor.isEmpty() == false)
					strcolor = strcolor.toUpperCase(); // paso a mayúsculas
			}
		} while ((strcolor.isEmpty() == true) || ((color = isColor(strcolor)) == null));

		// Crear el rectangulo
		RectanguloGrafico rectangulo = new RectanguloGrafico(x1, y1, x2, y2, color);
		hpr.listFiguras.add(rectangulo);

		System.out.println("\n\nEl Rectángulo ha sido creado ...\n\n");
	}

	public static void crearCirculo(HerederoPolimorfismoReload hpr, Scanner entrada) {
		double radio, x, y;
		String opcion, strcolor;
		boolean isnum = false;
		Color color = null;

		System.out.println("\n\n\t\t*** 1. CREAR CIRCULO ***\n");
		do {
			opcion = "";
			x = -1;
			System.out.println("Posicion X círculo? ");
			opcion = entrada.nextLine();
			isnum = isDouble(opcion);
			if (isnum) {
				x = Double.parseDouble(opcion);
			}
		} while ((isnum == false) || (x < 0));

		do {
			opcion = "";
			y = -1;
			System.out.println("Posicion Y círculo? ");
			opcion = entrada.nextLine();
			isnum = isDouble(opcion);
			if (isnum) {
				y = Double.parseDouble(opcion);
				;
			}
		} while ((isnum == false) || (y < 0));

		do {
			opcion = "";
			radio = -1;
			System.out.println("Tamano del radio del círculo? ");
			opcion = entrada.nextLine();
			isnum = isDouble(opcion);
			if (isnum) {
				radio = Double.parseDouble(opcion);
			}
		} while ((isnum == false) || (radio < 1));

		do {
			strcolor = "";
			System.out.println("Colores: [WHITE, LIGHTGRAY, GRAY, DARKGRAY, "
					+ "BLACK, RED, PINK, ORANGE, YELLOW, GREEN, MAGENTA, CYAN, BLUE]");
			System.out.println("Color círculo? ");
			strcolor = entrada.nextLine();
			if (strcolor.isEmpty() == false) {
				strcolor = strcolor.trim(); // quito espacios en blanco
				if (strcolor.isEmpty() == false)
					strcolor = strcolor.toUpperCase(); // paso a mayúsculas
			}
		} while ((strcolor.isEmpty() == true) || ((color = isColor(strcolor)) == null));

		// Crear el círculo
		CirculoGrafico circulo = new CirculoGrafico(x, y, radio, color);
		hpr.listFiguras.add(circulo);

		System.out.println("\n\nEl Círculo ha sido creado ...\n\n");
	}

	public static void crearFiguras(HerederoPolimorfismoReload hpr, Scanner entrada) {
		String opcion;

		do {
			System.out.println("\n\n\t\t*** 1. CREAR FIGURAS ***\n");
			System.out.println("1. Crear Círculo");
			System.out.println("2. Crear Rectángulo");
			System.out.println("0. Volver al menú");
			System.out.print("\t>>>OPCION [0 - 2]? ");

			opcion = entrada.nextLine();
			if (isInt(opcion) == true) {
				int iop = Integer.parseInt(opcion);
				switch (iop) {
				case 1:
					crearCirculo(hpr, entrada);
					break;

				case 2:
					crearRectangulo(hpr, entrada);
					break;

				default:
					break;
				}
			}

		} while ("0".equals(opcion) == false);

		System.out.println("\n\n");
	}

	public static void listarFiguras(HerederoPolimorfismoReload hpr) {
		int cont = 0;
		System.out.println("\n\n\t\t*** 2. LISTAR FIGURAS ***\n");

		for (Geometria figura : hpr.listFiguras) {
			System.out.println(++cont + ". " + figura.toString());
		}

		System.out.println("\n\n");
	}

	public static void calcularPerimetro(HerederoPolimorfismoReload hpr, Scanner entrada) {
		String opcion = "";
		int num = 0;

		System.out.println("\n\n\t\t*** 3. CALCULAR AREA Y PERIMETRO DE FIGURA ***\n");

		if (hpr.listFiguras.isEmpty() == true) {
			System.out.println("La lista esta vacía. No se han agregado figuras.");
			return;
		}

		int lim = hpr.listFiguras.size();
		do {
			System.out.print("Ingrese el número de la figura a calcular [1 - " + lim + "]? ");
			opcion = entrada.nextLine();
			if (isInt(opcion) == true)
				num = Integer.parseInt(opcion) - 1;
			else
				opcion = "";

		} while ((opcion.isEmpty() == true) || (num < 0) || (num >= lim));

		System.out.println("\nFigura # " + (num + 1));
		System.out.println(hpr.listFiguras.get(num).toString());
		System.out.println("Area: " + hpr.listFiguras.get(num).area());
		System.out.println("Perímetro: " + hpr.listFiguras.get(num).perimetro());

		System.out.println("\n\n");

	}

	public static void dibujarLienzo(HerederoPolimorfismoReload hpr) throws Exception {
		int numfigmay = -1;
		int numfigmen = -1;
		Geometria figmay = null;
		Geometria figmen = null;

		System.out.println("\n\n\t\t*** 3. DIBUJAR LIENZO CON FIGURAS ***\n");

		if (hpr.listFiguras.isEmpty() == true) {
			System.out.println("La lista esta vacía. No se han agregado figuras.");
			return;
		}

		System.out.println("Dibujando... ");
		
		if(hpr.ventana==null) {
			hpr.ventana = new VentanaCerrable("DIBUJAR LIENZO CON FIGURAS");
			hpr.ventana.setSize(800, 600);
		}
		

		PanelDibujo mipanel = new PanelDibujo(hpr.listFiguras);

		hpr.ventana.add(mipanel);
		hpr.ventana.setVisible(true);

		figmay = hpr.listFiguras.get(0);
		figmen = hpr.listFiguras.get(0);
		numfigmay = 0;
		numfigmen = 0;
		Geometria fig = null;
		for (int i = 0; i < hpr.listFiguras.size(); i++) {
			fig = hpr.listFiguras.get(i);
			if (fig.area() > figmay.area()) {
				figmay = fig;
				numfigmay = i;
			} else if (fig.area() < figmen.area()) {
				figmen = fig;
				numfigmen = i;
			}
		}

		System.out.println("\nFigura MAYOR del dibujo. Figura # " + (numfigmay + 1));
		System.out.println(figmay.toString());
		System.out.println("Area: "+figmay.area());
		
		System.out.println("\nFigura MENOR del dibujo. Figura # " + (numfigmen + 1));
		System.out.println(figmen.toString());
		System.out.println("Area: "+figmen.area());

		System.out.println("\n\n");

	}

	public static void main(String[] args) throws Exception {
		String opcion;
		Scanner entrada = new Scanner(System.in);

		HerederoPolimorfismoReload hpr = new HerederoPolimorfismoReload();

		do {
			System.out.println("\t\t*** MENU ***\n");
			System.out.println("1. Crear figuras");
			System.out.println("2. Listar figuras");
			System.out.println("3. Calcular área de figura y perímetro");
			System.out.println("4. Dibujar lienzo");
			System.out.println("0. Salir");
			System.out.print("\t>>>OPCION [0 - 4]? ");

			opcion = entrada.nextLine();
			if (isInt(opcion) == true) {
				int iop = Integer.parseInt(opcion);
				switch (iop) {
				case 1:
					crearFiguras(hpr, entrada);
					break;
				case 2:
					listarFiguras(hpr);
					break;

				case 3:
					calcularPerimetro(hpr, entrada);
					break;

				case 4:
					dibujarLienzo(hpr);
					break;

				default:
					break;
				}
			}

		} while ("0".equals(opcion) == false);

		entrada.close();
		
		if(hpr.ventana!=null) {
			hpr.ventana.dispose();
			hpr.ventana= null;
		}

	}

}
