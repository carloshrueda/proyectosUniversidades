package ejercicios_20180909;

public class Operario extends Empleado {

	public Operario(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Operario [Nombre=" + nombre + "]";
	}

}
