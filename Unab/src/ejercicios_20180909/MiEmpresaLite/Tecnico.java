package ejercicios_20180909.MiEmpresaLite;

public class Tecnico extends Operario {

	public Tecnico(String nombre) {
		super(nombre);
	}

	@Override
	public String toString() {
		return "Tecnico [Nombre=" + nombre + "]";
	}

}
