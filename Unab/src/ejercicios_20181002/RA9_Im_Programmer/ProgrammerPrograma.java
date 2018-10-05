package ejercicios_20181002.RA9_Im_Programmer;

public class ProgrammerPrograma {

	public static void main(String[] args) {
		Parrafo parrafo = new Parrafo();

		// Se crea un objeto de la clase Oracion
		Oracion oracion1 = parrafo.principal(); // el m�todo principal de la clase p�rrafo es polim�rfico

		// Se crea un objeto de la clase Oracion2
		Oracion2 oracion2 = (Oracion2) parrafo.principal(); // el m�todo principal de la clase p�rrafo es polim�rfico

		// Se arma una oracion con Sujeto y verbo
		oracion1.setSujeto("Yo");
		oracion1.setVerbo("pas�");
		// Se imprime la oraci�n
		System.out.println("Oracion1: " + oracion1.getSujeto() + " " + oracion1.getVerbo());

		// Se arma una oracion con Sujeto, verbo y complemento
		oracion2.setSujeto("Yo");
		oracion2.setVerbo("estudio");
		oracion2.setComplemento("Algoritmos y programaci�n");
		// Se imprime la oraci�n
		System.out.println(
				"\nOracion1: " + oracion2.getSujeto() + " " + oracion2.getVerbo() + " " + oracion2.getComplemento());

	}

}
