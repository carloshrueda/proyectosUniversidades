package ejercicios_20181002.R7_MiPropioBanco;

public class Cliente {
	private String nombre;
	
	public Cliente() {
		this.nombre = "";
	}

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
