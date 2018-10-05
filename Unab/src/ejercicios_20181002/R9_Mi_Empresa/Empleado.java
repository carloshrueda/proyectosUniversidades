package ejercicios_20181002.R9_Mi_Empresa;

public class Empleado {
	private String nombre;
	private Cargo cargo;

	public Empleado() {
		this.nombre = "";
		cargo = new Cargo();
	}

	public Empleado(String nombre, Cargo cargo) {
		this.nombre = nombre;
		this.cargo = cargo;
	}

	public String getNombre() {
		return nombre;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EMPLEADO \n Nombre: ");
		builder.append(nombre);
		builder.append("\n " + cargo.toString());
		return builder.toString();
	}

}
