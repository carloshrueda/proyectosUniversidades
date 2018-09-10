package ejercicios_20180909.HerederoPolimorfismo;

public abstract class Figura {
	private double area;
	private double perimetro;

	public Figura() {
		super();
		this.area = 0;
		this.perimetro = 0;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}

	public Comparacion compararArea(Figura fig1) {
		// Resultado 0: area fig1 = area fig2
		// Resultado 1: area fig1 > area fig2
		// Resultado -1: area fig1 < area fig2
		Comparacion resultado;

		if (this.getArea() > fig1.getArea())
			resultado = Comparacion.Mayor;
		else if (this.getArea() < fig1.getArea())
			resultado = Comparacion.Menor;
		else
			resultado = Comparacion.Igual;

		return resultado;
	}

	// METODO ABSTRACTO => no se implementa en la clase abstracta pero si en la
	// clases hijas
	public abstract double calcularArea();

	public abstract double calcularPerimetro();

	public abstract TipoFigura tipoFigura();

	public abstract void setLado(double lado);
}
