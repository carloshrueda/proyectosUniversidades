package ejercicios_20181002.RA7_Ideota;

public class Fruta {

	protected String Nombre;
	protected TipoFruta Tipo;
	protected double Peso;
	protected double Calorias;
	protected int Precio;

	public Fruta() {
		this.Nombre = "";
		this.Peso = 0.0;
		this.Calorias = 0.0;
		this.Precio = 0;
		// TODO
		this.Tipo = null;
	}

	public String getNombre() {
		return Nombre;
	}

	protected void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public double getPeso() {
		return Peso;
	}

	private void setPeso(double Peso) {
		this.Peso = Peso;
	}

	public double getCalorias() {
		return Calorias;
	}

	protected void setCalorias(double Calorias) {
		this.Calorias = Calorias;
	}

	public int getPrecio() {
		return Precio;
	}

	private void setPrecio(int Precio) {
		this.Precio = Precio;
	}

	// TODO
	public TipoFruta getTipo() {
		return this.Tipo;
	}

	// TODO
	public static Fruta getFruta(TipoFruta tipoFruta) {
		switch (tipoFruta) {
		case PAPAYA:
			return new Papaya();
		case KIWI:
			return new Kiwi();
		case NARANJA:
			return new Naranja();
		case MANGO:
			return new Mango();
		case BANANO:
			return new Banano();
		default:
			return null;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Fruta [Nombre=");
		builder.append(Nombre);
		builder.append(", Tipo=");
		builder.append(Tipo);
		builder.append(", Peso=");
		builder.append(Peso);
		builder.append(", Calorias=");
		builder.append(Calorias);
		builder.append(", Precio=");
		builder.append(Precio);
		builder.append("]");
		return builder.toString();
	}
}
