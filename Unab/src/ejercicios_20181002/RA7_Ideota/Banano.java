package Compras;

public class Banano extends Fruta {
    public Banano() {
        super();
        this.Tipo = TipoFruta.BANANO;
        setNombre(Tipo.toString());
        this.Calorias = 293.7; // 89 cal/100 gr https://es.wikipedia.org/wiki/Pl%C3%A1tano_(fruto)
        this.Precio = 605; // http://www.exito.com/products/0000310733276701/Banano+Criollo+a+Granel
        this.Peso = 330; // http://www.exito.com/products/0000310733276701/Banano+Criollo+a+Granel
    }
}
