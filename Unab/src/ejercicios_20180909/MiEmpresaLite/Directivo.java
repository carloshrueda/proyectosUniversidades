package ejercicios_20180909.MiEmpresaLite;

public class Directivo extends Empleado {

	public Directivo(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Directivo [Nombre=" + nombre + "]";
	}

}
