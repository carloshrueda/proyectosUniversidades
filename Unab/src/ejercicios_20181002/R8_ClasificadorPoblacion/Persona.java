package ejercicios_20181002.R8_ClasificadorPoblacion;

public class Persona {
	private String nombre;
	private String direccion;
	private long telefono;
	private short edad;
	private Sexo sexo;

	public Persona() {
		nombre = "";
		direccion = "";
		telefono = Long.MIN_VALUE;
		edad = Short.MIN_VALUE;
		sexo = null;
	}

	public Persona(String nombre, String dirección, long telefono, short edad, Sexo sexo) {
		this.nombre = nombre;
		this.direccion = dirección;
		this.telefono = telefono;
		this.edad = edad;
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public long getTelefono() {
		return telefono;
	}

	public short getEdad() {
		return edad;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setDireccion(String dirección) {
		this.direccion = dirección;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nEdad: " + edad
				+ "\nSexo: " + sexo;
	}

}
