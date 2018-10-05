package ejercicios_20181002.RA7_Ideota;

public class Kiwi extends Fruta {
	public Kiwi() {
		super();
		this.Tipo = TipoFruta.KIWI;
		setNombre(Tipo.toString());
		this.Calorias = 85.4; // 61 cal/100 gr https://es.wikipedia.org/wiki/Kiwi_(fruta)
		this.Precio = 851; // http://www.exito.com/products/0000249189215342/Kiwi+a+Granel
		this.Peso = 140; // http://www.exito.com/products/0000249189215342/Kiwi+a+Granel
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Kiwi [Nombre=");
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
