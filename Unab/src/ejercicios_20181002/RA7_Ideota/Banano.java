package ejercicios_20181002.RA7_Ideota;

public class Banano extends Fruta {
	public Banano() {
		super();
		this.Tipo = TipoFruta.BANANO;
		setNombre(Tipo.toString());
		this.Calorias = 293.7; // 89 cal/100 gr https://es.wikipedia.org/wiki/Pl%C3%A1tano_(fruto)
		this.Precio = 605; // http://www.exito.com/products/0000310733276701/Banano+Criollo+a+Granel
		this.Peso = 330; // http://www.exito.com/products/0000310733276701/Banano+Criollo+a+Granel
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banano [Nombre=");
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
