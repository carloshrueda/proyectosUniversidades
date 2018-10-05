package ejercicios_20181002.R9_Mi_Empresa;

public class Cargo {
	private String nombre;
	private int sueldo;
	private int jerarquia;

	public Cargo() {
		this.nombre = "";
		this.sueldo = 0;
		this.jerarquia = 0;
	}

	public Cargo(String nombre, int sueldo, int jerarquia) {
		super();
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.jerarquia = jerarquia;
	}

	public String getNombre() {
		return nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public int getJerarquia() {
		return jerarquia;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public void setJerarquia(int jerarquia) {
		this.jerarquia = jerarquia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CARGO \n Nombre: ");
		builder.append(nombre);
		builder.append("\n Sueldo: ");
		builder.append(sueldo);
		builder.append("\n Jerarquia: ");
		builder.append(jerarquia);
		return builder.toString();
	}

}
