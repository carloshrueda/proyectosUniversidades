package ejercicios_20181002.RA7_Ideota;

import java.util.Arrays;

public class Carro {
    int[] CantidadTipoFrutas = new int[TipoFruta.values().length];
    double pesoTotal;
    double caloriasTotal;
    long precioTotal;
    
     public Carro() {
        this.pesoTotal = 0.0;
        this.caloriasTotal = 0.0;
        this.precioTotal = 0;
        Arrays.fill(CantidadTipoFrutas, 0);
    }
     
    public void addFruta(Fruta fruta) {
        if (fruta != null) {
            this.pesoTotal += fruta.getPeso();
            this.caloriasTotal += fruta.getCalorias();
            this.precioTotal += fruta.getPrecio();
            ++this.CantidadTipoFrutas[fruta.getTipo().ordinal()];
        }
    }
    
}
