package ejercicios_20181002.RA7_Ideota;

public class Mango extends Fruta {
    public Mango() {
        super();
        this.Tipo = TipoFruta.MANGO;
        setNombre(Tipo.toString());
        this.Calorias = 252; // 60 cal/100 gr https://es.wikipedia.org/wiki/Mango_(fruta)
        this.Precio = 4416; // http://www.exito.com/products/0000060338062208/Naranja+Tangelo+Mineola+a+Granel
        this.Peso = 420; // http://www.exito.com/products/0000060338062208/Naranja+Tangelo+Mineola+a+Granel
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mango [Nombre=");
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
