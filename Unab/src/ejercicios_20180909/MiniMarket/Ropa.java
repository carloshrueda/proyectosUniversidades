package ejercicios_20180909.MiniMarket;

public class Ropa extends Producto {
	private char Genero;
	private String Talla;
	private String material;
	private String Color;

	public Ropa() {
		super();
		setGenero('F');
		setTalla("XS");
		setMaterial("Algodo");
		setColor("Azul");
		
	}

	public Ropa(String nombre, int valor, int existencia, int reorden) {
		super(nombre, valor, existencia, reorden);
	}

	public Ropa(String nombre, int valor, int existencia, int reorden, char genero, String talla, String material,
			String color) {
		super(nombre, valor, existencia, reorden);
		setGenero(genero);
		setTalla(talla);
		setMaterial(material);
		setColor(color);
	}

	public char getGenero() {
		return Genero;
	}

	public String getTalla() {
		return Talla;
	}

	public String getMaterial() {
		return material;
	}

	public String getColor() {
		return Color;
	}

	public void setGenero(char genero) {
		Genero = genero;
	}

	public void setTalla(String talla) {
		Talla = talla;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setColor(String color) {
		Color = color;
	}

}
