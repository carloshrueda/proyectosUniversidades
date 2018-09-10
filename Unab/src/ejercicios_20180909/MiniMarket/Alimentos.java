package ejercicios_20180909.MiniMarket;

public class Alimentos extends Producto {
	private String unidadmedida;
	private double peso;

	public Alimentos() {
		super("", 0, 0, 0);
		setUnidadmedida("");
		setPeso(0.0);
		this.peso = 0.0;

	}

	public Alimentos(String nombre, int valor, int existencia, int reorden, String unidadmedida, double peso) {
		super(nombre, valor, existencia, reorden);
		setUnidadmedida(unidadmedida);
		setPeso(peso);
	}

	public String getUnidadmedida() {
		return unidadmedida;
	}

	public void setUnidadmedida(String unidadmedida) {
		this.unidadmedida = unidadmedida;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso < 0.0)
			peso = 0.0;
		this.peso = peso;
	}

}
