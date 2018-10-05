package Compras;

public class Mango extends Fruta {
    public Mango() {
        super();
        this.Tipo = TipoFruta.MANGO;
        setNombre(Tipo.toString());
        this.Calorias = 252; // 60 cal/100 gr https://es.wikipedia.org/wiki/Mango_(fruta)
        this.Precio = 4416; // http://www.exito.com/products/0000060338062208/Naranja+Tangelo+Mineola+a+Granel
        this.Peso = 420; // http://www.exito.com/products/0000060338062208/Naranja+Tangelo+Mineola+a+Granel
    }
}
