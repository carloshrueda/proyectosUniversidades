package ejercicios_20180909;

public class Empleado {
	public String nombre;

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre= nombre;
	}
	
	@Override
	public String toString() {
		return "Empleado [Nombre=" + nombre + "]";
	}
}
