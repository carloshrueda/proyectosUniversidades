package ejercicios_20180909.radioguardia;

public class Dial {
	private double frecuencia;
	private final double frecmin = 80.0;
	private final double frecmax = 180.0;
	private final double paso = 0.5;

	public Dial() {
		frecuencia = frecmin;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public double subirFrecuencia() {
		if ((frecuencia + paso) <= frecmax)
			this.frecuencia += paso;
		else
			this.frecuencia = frecmin;

		return this.frecuencia;
	}

	public double bajarFrecuencia() {
		if ((frecuencia - paso) >= frecmin)
			this.frecuencia -= paso;
		else
			this.frecuencia = frecmax;

		return this.frecuencia;
	}

}
