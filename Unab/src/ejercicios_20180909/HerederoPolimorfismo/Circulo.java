package ejercicios_20180909.HerederoPolimorfismo;

public class Circulo extends Figura {
	private double radio;

	public Circulo() {
		super();
		radio = 0;
	}

	public Circulo(double radio) {
		super();
		setLado(radio);
	}

	@Override
	public double calcularArea() {
		setArea(Math.PI * radio * radio);
		return getArea();
	}

	@Override
	public double calcularPerimetro() {
		setPerimetro(2 * radio * Math.PI);
		return getPerimetro();
	}

	@Override
	public TipoFigura tipoFigura() {
		return TipoFigura.Circulo;
	}
	
	@Override
	public void setLado(double lado) {
		if (lado > 0)
			this.radio = lado;
		else
			this.radio = 0;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		if (radio > 0)
			this.radio = radio;
		else
			this.radio = 0;
	}

}
