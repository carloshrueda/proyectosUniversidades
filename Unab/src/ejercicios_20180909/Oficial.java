package ejercicios_20180909;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Oficial [Nombre=" + nombre + "]";
	}

}
