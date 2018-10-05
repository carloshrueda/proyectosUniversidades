package ejercicios_20181002.RA8_La_Vieja_Libreria;

public enum Mensaje {
	CODIGONOEXISTE(-1), NOTIENEEXISTENCIAS(-2);

	private int valor;

	private Mensaje(int valor) {
		this.setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	private void setValor(int valor) {
		this.valor = valor;
	}

}
