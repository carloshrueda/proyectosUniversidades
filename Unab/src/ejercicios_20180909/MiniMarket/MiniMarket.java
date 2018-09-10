package ejercicios_20180909.MiniMarket;

import java.util.ArrayList;
import java.util.Date;

public class MiniMarket {
	public ArrayList<Producto> lstProductos = new ArrayList<Producto>();

	public void addAlimento(String nombre, int valor, int existencia, int reorden, String unidadmedida, double peso) {
		Alimentos a = new Alimentos(nombre, valor, existencia, reorden, unidadmedida, peso);
		lstProductos.add(a);
	}

	public void addMedicamento(String nombre, int valor, int existencia, int reorden, String laboratorio, int lote,
			Date fechaven, Double tempalmacen) {
		Medicamentos m = new Medicamentos(nombre, valor, existencia, reorden, laboratorio, lote, fechaven, tempalmacen);
		lstProductos.add(m);
	}

	public void addRopa(String nombre, int valor, int existencia, int reorden, char genero, String talla,
			String material, String color) {
		Ropa r = new Ropa(nombre, valor, existencia, reorden, genero, talla, material, color);
		lstProductos.add(r);
	}

}
