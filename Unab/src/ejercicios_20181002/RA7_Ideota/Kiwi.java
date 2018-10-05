package Compras;

public class Kiwi extends Fruta {
    public Kiwi() {
        super();
        this.Tipo = TipoFruta.KIWI;
        setNombre(Tipo.toString());
        this.Calorias = 85.4; // 61 cal/100 gr https://es.wikipedia.org/wiki/Kiwi_(fruta)
        this.Precio = 851; // http://www.exito.com/products/0000249189215342/Kiwi+a+Granel
        this.Peso = 140; // http://www.exito.com/products/0000249189215342/Kiwi+a+Granel
    }
}
