package ejercicios_20180909.HerederoPolimorfismo;

public class Triangulo extends Figura {
	private double lado1, lado2, lado3;

	public Triangulo() {
		super();
		this.lado1 = 0;
		this.lado2 = 0;
		this.lado3 = 0;
	}

	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		setLado1(lado1);
		setLado2(lado2);
		setLado3(lado3);
	}

	@Override
	public double calcularArea() {
		// La fórmula de Herón se utiliza para hallar el área de un triángulo conociendo
		// sus tres lados.
		// area= raiz(p * (p-a) * (p-b) * (p-c))
		// p : perimetro

		double p = calcularSemiPerimetro();
		setArea(Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3)));
		return getArea();
	}

	@Override
	public double calcularPerimetro() {
		setPerimetro(lado1 + lado2 + lado3);
		return getPerimetro();
	}

	public double calcularSemiPerimetro() {
		return (calcularPerimetro() / 2);
	}

	@Override
	public TipoFigura tipoFigura() {
		return TipoFigura.Triangulo;
	}

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (this.lado1 > 0)
			this.lado1 = lado1;
		else
			this.lado1 = 0;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (this.lado2 > 0)
			this.lado2 = lado2;
		else
			this.lado2 = 0;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if (this.lado3 > 0)
			this.lado3 = lado3;
		else
			this.lado3 = 0;
	}

	@Override
	public void setLado(double lado) {
		// para un triangulo equilatero
		this.lado1 = lado;
		this.lado2 = lado;
		this.lado3 = lado;
	}

	public void setLados(double lado1, double lado2, double lado3) {
		if (lado1 > 0)
			this.lado1 = lado1;
		else
			this.lado1 = 0;

		if (lado2 > 0)
			this.lado2 = lado2;
		else
			this.lado2 = 0;

		if (lado3 > 0)
			this.lado3 = lado3;
		else
			this.lado3 = 0;
	}

}
