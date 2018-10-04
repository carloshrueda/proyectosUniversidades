package ejercicios_20181002.R7_MiPropioBanco;

import java.util.ArrayList;

public class MiBanco {
	private static long numcuenta;
	private ArrayList<Cuenta> listCuentas;

	public MiBanco() {
		numcuenta = 0;
		listCuentas = new ArrayList<Cuenta>();
	}

	public static long getNumcuenta() {
		return numcuenta;
	}

	public ArrayList<Cuenta> getListCuentas() {
		return listCuentas;
	}

	/*
	 * private static void setNumcuenta(int numcuenta) { MiBanco.numcuenta =
	 * numcuenta; }
	 * 
	 * private void setListCuentas(ArrayList<Cuenta> listCuentas) { this.listCuentas
	 * = listCuentas; }
	 */

	private long nuevoNumCuenta() {
		numcuenta = numcuenta + 1;
		return numcuenta;
	}

	public void agregarCuenta(String nomCliente, long saldo) {
		listCuentas.add(new Cuenta(nomCliente, saldo, nuevoNumCuenta()));
	}

	public Cuenta buscarCuenta(long numcuenta) {
		Cuenta cuenta = null;

		for (Cuenta c : listCuentas) {
			if (c.getNumcuenta() == numcuenta) {
				cuenta = c;
				break;
			}
		}

		return cuenta;
	}
	
	public boolean hayCuentas() {
		return (getListCuentas().size() > 0);
	}

	public void eliminarCuenta(Cuenta cuenta) {
		if (hayCuentas()) {
			getListCuentas().remove(cuenta);
		}
	}
}
