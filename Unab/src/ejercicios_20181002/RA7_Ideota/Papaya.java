package ejercicios_20181002.RA7_Ideota;

public class Papaya extends Fruta {
	public Papaya() {
		super();
		this.Tipo = TipoFruta.PAPAYA;
		setNombre(Tipo.toString());
		this.Calorias = 1290.0; // 43 cal/100 gr https://es.wikipedia.org/wiki/Carica_papaya
		this.Precio = 4560; // http://www.exito.com/products/0000060342062211/Papaya+Comun
		this.Peso = 3000.0; // http://www.exito.com/products/0000060342062211/Papaya+Comun
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Papaya [Nombre=");
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
