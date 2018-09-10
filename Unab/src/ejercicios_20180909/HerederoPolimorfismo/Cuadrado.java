package ejercicios_20180909.HerederoPolimorfismo;

public class Cuadrado extends Figura {
	private double lado;

	public Cuadrado() {
		super();
		this.lado = 0;
	}

	public Cuadrado(double lado) {
		super();
		setLado(lado);
	}

	@Override
	public double calcularArea() {
		setArea(lado * lado);
		return getArea();
	}

	@Override
	public double calcularPerimetro() {
		setPerimetro(4 * lado);
		return getPerimetro();
	}

	@Override
	public TipoFigura tipoFigura() {
		return TipoFigura.Cuadrado;
	}

	public double getLado() {
		return lado;
	}

	@Override
	public void setLado(double lado) {
		if (lado > 0)
			this.lado = lado;
		else
			this.lado = 0;
	}

}
