package ejercicios_20181002.RA9_Im_Programmer;

public class ProgrammerPrograma {

	public static void main(String[] args) {
		Parrafo parrafo = new Parrafo();

		// Se crea un objeto de la clase Oracion
		Oracion oracion1 = parrafo.principal(); // el método principal de la clase párrafo es polimórfico

		// Se crea un objeto de la clase Oracion2
		Oracion2 oracion2 = (Oracion2) parrafo.principal(); // el método principal de la clase párrafo es polimórfico

		// Se arma una oracion con Sujeto y verbo
		oracion1.setSujeto("Yo");
		oracion1.setVerbo("pasé");
		// Se imprime la oración
		System.out.println("Oracion1: " + oracion1.getSujeto() + " " + oracion1.getVerbo());

		// Se arma una oracion con Sujeto, verbo y complemento
		oracion2.setSujeto("Yo");
		oracion2.setVerbo("estudio");
		oracion2.setComplemento("Algoritmos y programación");
		// Se imprime la oración
		System.out.println(
				"\nOracion1: " + oracion2.getSujeto() + " " + oracion2.getVerbo() + " " + oracion2.getComplemento());

	}

}
