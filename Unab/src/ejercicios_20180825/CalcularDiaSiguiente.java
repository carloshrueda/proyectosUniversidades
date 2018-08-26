package ejercicios_20180825;

/*
 * Calcular el dia de manana
 * 
 * Realizar un programa que pida una fecha (ano, mes, dia) y valide si es correcta (si puede existir)
 * inclusive teniendo encuenta el ano bisiesto
 * 
 * El programa debe calcular la fecha siguente. Si la fecha esta mal debe decirlo.
 * 
 * El programa deberá correr hasta que el usuario decida lo contrario
 */

import java.util.Scanner;

public class CalcularDiaSiguiente {

	private boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public boolean esBisiesto(int ano) {
		if ((ano % 4 == 0) && ((ano % 100 != 0) || (ano % 400 == 0)))
			return true;
		else
			return false;
	}

	public String diasiguiente(int dia, int mes, int ano) {
		int diasmes[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String fecha = "";

		//si es bisiesto febrero tiene 29
		if (esBisiesto(ano) == true) {
			diasmes[1] = 29;
		}

		dia = dia + 1;
		if (dia > diasmes[mes - 1]) {
			//si el dia resulta mayor a los que dias que puede tener el mes
			dia = 1;
			mes = mes + 1;

			if (mes > 12) {
				//si el mes es 12
				mes = 1;
				ano = ano + 1;
			}
		}

		// se agrega el dia en texto
		if (dia < 10) {
			fecha = "0";
		}
		fecha = fecha + String.valueOf(dia) + "/";

		// se agrega el mes en texto
		if (mes < 10) {
			fecha = fecha + "0";
		}
		fecha = fecha + String.valueOf(mes) + "/";

		// se agrega el ano en texto
		fecha = fecha + String.valueOf(ano);

		return fecha;
	}

	public int[] validarFormatoFecha(String fecha) {
		String strdia, strmes, strano;
		int intdia, intmes, intano;
		// dias del mes: ene feb mar abr may jun jul ago sep oct nov dic
		int diasmes[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		boolean bisiesto;

		// que no sea vacia
		if (fecha.isEmpty())
			return null;

		// que tenga longitud 10
		if (fecha.length() != 10)
			return null;

		// que este el caracter que divide las fechas /
		if (fecha.charAt(2) != '/' || fecha.charAt(5) != '/')
			return null;

		// si es numero el dia
		strdia = fecha.substring(0, 2);
		if (isNumeric(strdia) == false)
			return null;

		// si es numero el mes
		strmes = fecha.substring(3, 5);
		if (isNumeric(strmes) == false)
			return null;

		// si es numero el ano
		strano = fecha.substring(6);
		if (isNumeric(strano) == false)
			return null;

		// convierto los valores texto en enteros
		intdia = Integer.parseInt(strdia);
		intmes = Integer.parseInt(strmes);
		intano = Integer.parseInt(strano);

		// que el ano sea mayor que 0
		if (intano <= 0)
			return null;

		// Que el mes sea valido
		if ((intmes < 1) || (intmes > 12))
			return null;

		// Que los dias sean validos para los mes que no sean febrero
		if ((intmes != 2) && // que el mes no sea febrero
				((intdia < 1) || // Que no sean menores que 1
						(intdia > diasmes[intmes - 1]))) // Que el mes no tenga más días de los que corresponde
			return null;

		bisiesto = esBisiesto(intano);
		// Que los dias sean validos para febrero en ano no bisiestos
		if ((intmes == 2) && // es febrero
				(bisiesto == false) && // no es bisiesto
				(intdia > 28)) // dias mayores a 28
			return null;

		// Que los dias sean validos para febrero en ano bisiesto
		if ((intmes == 2) && // es febrero
				(bisiesto == true) && // es bisiesto
				(intdia > 29)) // dias mayores a 29
			return null;

		int[] datos = new int[3];
		datos[0] = intdia;
		datos[1] = intmes;
		datos[2] = intano;

		return datos;
	}

	public static void main(String[] args) {
		String fecha1 = "";
		String fecha2 = "";
		int[] datfecha;
		String opcion = "";

		Scanner scn = new Scanner(System.in);
		CalcularDiaSiguiente cds = new CalcularDiaSiguiente();

		do {
			System.out.print("Ingrese la fecha actual (formato: dd/mm/aaaa): ");
			fecha1 = scn.next();

			datfecha = cds.validarFormatoFecha(fecha1);
			if (datfecha != null) {
				fecha2 = cds.diasiguiente(datfecha[0], datfecha[1], datfecha[2]);
				System.out.println("La fecha siguiente es: " + fecha2);

			} else {
				System.out.println("Error. Fecha inválida. Formato de fecha: dd/mm/aaaa.");
			}
			System.out.print("\nDesea continuar (S/N)?: ");
			opcion = scn.next().toUpperCase();
			System.out.println("");
		} while (opcion.equals("S") == true);

		scn.close();
		System.out.print("\n*** Gracias por usar el software ***\n");
	}

}
