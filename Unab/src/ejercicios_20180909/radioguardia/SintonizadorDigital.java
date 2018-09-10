package ejercicios_20180909.radioguardia;

import java.io.IOException;
import java.util.Scanner;

public class SintonizadorDigital {
	private Dial dial;

	public SintonizadorDigital() {
		dial = new Dial();
	}

	public void controlador(char control) {
		if (control == 'A') // <-- down
			dial.bajarFrecuencia();
		else if (control == 'D') // --> up
			dial.subirFrecuencia();
	}

	public String pantalla() {
		return String.valueOf(dial.getFrecuencia());
	}

	public static void main(String[] args) throws IOException {
		String comando;
		char letra;
		boolean swerror;
		boolean salida;
		Scanner perilla = new Scanner(System.in);

		System.out.println(">>> Uso perilla, presione A para subir, D para bajar frecuencia.");
		System.out.println(">>> Uso perilla, presione Q para salir.\n\n");

		SintonizadorDigital sd = new SintonizadorDigital();
		System.out.println("\nFrecuencia: " + sd.pantalla());

		do {
			System.out.print("Perilla? ");
			swerror = false;
			salida = false;
			comando = "";
			comando = perilla.nextLine();
			if (comando.isEmpty() == false) { // no esta vacio
				comando= comando.toUpperCase();
				for (int i = 0; i < comando.length(); i++) {
					letra = comando.charAt(i);
					if (letra == 'A' || letra == 'D') { // hay una A o una D
						sd.controlador(letra);

					} else if (letra != 'Q') { // Hay algo diferente a una A, D o Q => Error
						swerror = true;

					} else { // es una Q
						salida = true;
					}
				}

			} else // está vacio
				swerror = true;

			System.out.println("\nFrecuencia: " + sd.pantalla());
			
			if (swerror == true) { // si hay un error
				System.out.println("\n>>> Uso perilla, presione A para subir, D para bajar frecuencia.");
				System.out.println(">>> Uso perilla, presione Q para salir.\n\n");
			}

		} while (salida == false);

		perilla.close();
	}

}
