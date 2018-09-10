package ejercicios_20180909.MiniMarket;

public class Producto {
	private String nombre;
	private int valor;
	private int existencia;
	private int reorden;

	public Producto() {
		setNombre("");
		setValor(0);
		setExistencia(0);
		setReorden(0);
	}

	public Producto(String nombre, int valor, int existencia, int reorden) {
		setNombre(nombre);
		setValor(valor);
		setExistencia(existencia);
		setReorden(reorden);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		if (valor < 0)
			valor = 0;
		this.valor = valor;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		if (existencia < 0)
			existencia = 0;
		this.existencia = existencia;
	}

	public int getReorden() {
		return reorden;
	}

	public void setReorden(int reorden) {
		if (reorden < 0)
			reorden = 0;
		this.reorden = reorden;
	}

}
