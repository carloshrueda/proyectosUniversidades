package ejercicios_20181002.RA7_Ideota;

import java.util.ArrayList;

public class Carro {
	private ArrayList<Fruta> lstFrutas;
	private double pesoTotal;
	private double caloriasTotal;
	private long precioTotal;

	public Carro() {
        this.pesoTotal = 0.0;
        this.caloriasTotal = 0.0;
        this.precioTotal = 0;
        lstFrutas = new ArrayList<Fruta>();
    }

	public void addFruta(Fruta fruta) {
		if (fruta != null) {
			this.pesoTotal += fruta.getPeso();
			this.caloriasTotal += fruta.getCalorias();
			this.precioTotal += fruta.getPrecio();
			lstFrutas.add(fruta);
		}
	}

	public ArrayList<Fruta> getLstFrutas() {
		return lstFrutas;
	}

	public double getPesoTotal() {
		return pesoTotal;
	}

	public double getCaloriasTotal() {
		return caloriasTotal;
	}

	public long getPrecioTotal() {
		return precioTotal;
	}

	public void setLstFrutas(ArrayList<Fruta> lstFrutas) {
		this.lstFrutas = lstFrutas;
	}

	public void setPesoTotal(double pesoTotal) {
		this.pesoTotal = pesoTotal;
	}

	public void setCaloriasTotal(double caloriasTotal) {
		this.caloriasTotal = caloriasTotal;
	}

	public void setPrecioTotal(long precioTotal) {
		this.precioTotal = precioTotal;
	}

}
