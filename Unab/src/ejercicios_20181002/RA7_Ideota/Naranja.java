package ejercicios_20181002.RA7_Ideota;

public class Naranja extends Fruta {
    public Naranja() {
        super();
        this.Tipo = TipoFruta.NARANJA;
        setNombre(Tipo.toString());
        this.Calorias = 197.4; // 47 cal/100 gr https://es.wikipedia.org/wiki/Naranja
        this.Precio = 1714; // http://www.exito.com/products/0000060180062112/Mango+Tommy+a+Granel
        this.Peso = 800; // http://www.exito.com/products/0000060180062112/Mango+Tommy+a+Granel
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Naranja [Nombre=");
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
