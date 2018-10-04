package ejercicios_20181002.R8_ClasificadorPoblacion;

import java.util.ArrayList;

public class ListPersonas {
	private ArrayList<Persona> listPersonas;
	private Persona personaMasVieja;
	private Persona personaMasJoven;
	private int sumEdad;
	private short promEdad;
	private int sumEdadMujeres;
	private int cantMujeres;
	private short promEdadMujeres;
	private int sumEdadHombres;
	private int cantHombres;
	private short promEdadHombres;

	// Constructores
	public ListPersonas() {
		this.listPersonas = new ArrayList<Persona>();
		this.personaMasVieja = null;
		this.personaMasJoven = null;
		this.promEdad = Short.MIN_VALUE;
		this.promEdadMujeres = Short.MIN_VALUE;
		this.promEdadHombres = Short.MIN_VALUE;
		this.sumEdad = 0;
		this.sumEdadMujeres = 0;
		this.sumEdadHombres = 0;
		this.cantMujeres = 0;
		this.cantHombres = 0;
	}

	// Getter and Setter
	public ArrayList<Persona> getListPersonas() {
		return listPersonas;
	}

	public Persona getPersonaMasVieja() {
		return personaMasVieja;
	}

	public Persona getPersonaMasJoven() {
		return personaMasJoven;
	}

	public short getPromEdad() {
		return promEdad;
	}

	public short getPromEdadMujeres() {
		return promEdadMujeres;
	}

	public short getPromEdadHombre() {
		return promEdadHombres;
	}

	/*private void setPersonaMasVieja(Persona personaMasVieja) {
		this.personaMasVieja = personaMasVieja;
	}

	private void setPersonaMasJoven(Persona personaMasJoven) {
		this.personaMasJoven = personaMasJoven;
	}

	private void setPromEdad(short promEdad) {
		this.promEdad = promEdad;
	}

	private void setPromEdadMujeres(short promEdadMujeres) {
		this.promEdadMujeres = promEdadMujeres;
	}

	private void setPromEdadHombre(short promEdadHombre) {
		this.promEdadHombres = promEdadHombre;
	}

	private int getSumEdad() {
		return sumEdad;
	}

	private int getSumEdadMujeres() {
		return sumEdadMujeres;
	}

	private int getSumEdadHombres() {
		return sumEdadHombres;
	}

	private void setSumEdad(int sumEdad) {
		this.sumEdad = sumEdad;
	}

	private void setSumEdadMujeres(int sumEdadMujeres) {
		this.sumEdadMujeres = sumEdadMujeres;
	}

	private void setSumEdadHombres(int sumEdadHombres) {
		this.sumEdadHombres = sumEdadHombres;
	}
	*/

	// Metodos

	public void agregarPersona(Persona persona) {
		this.listPersonas.add(persona);

		// Calcular promedio edad total
		this.sumEdad += persona.getEdad();
		this.promEdad = (short) (this.sumEdad / listPersonas.size());

		if (persona.getSexo() == Sexo.FEMENINO) {
			// Calcular promedio edad mujeres
			this.cantMujeres += 1;
			this.sumEdadMujeres += persona.getEdad();
			this.promEdadMujeres = (short) (this.sumEdadMujeres / this.cantMujeres);

		} else { // Es un hombre
			// Calcular promedio edad hombres
			this.cantHombres += 1;
			this.sumEdadHombres += persona.getEdad();
			this.promEdadHombres = (short) (this.sumEdadHombres / this.cantHombres);
		}

		// Calcular persona más vieja
		if (this.listPersonas.size() > 1) {
			// No es el primera persona que se anade
			if (persona.getEdad() < this.personaMasJoven.getEdad()) {
				// La persona que se está anadiendo es mas joven
				this.personaMasJoven = persona;

			} else if (persona.getEdad() > this.personaMasVieja.getEdad()) {
				// La persona que se está anadiendo es mas vieja
				this.personaMasVieja = persona;
			}

		} else {
			// Es el primera persona que se anade
			this.personaMasJoven = persona;
			this.personaMasVieja = persona;
		}
	}

	public boolean hayPersonas() {
		return (getListPersonas().size() > 0);
	}

	public void eliminarPersona(Persona persona) {
		if (hayPersonas() == true) {
			getListPersonas().remove(persona);
		}
	}

	public int cantPersonas() {
		return listPersonas.size();
	}

	public ArrayList<Persona> buscarPersona(String nombre) {
		ArrayList<Persona> lstper = new ArrayList<Persona>();

		nombre = nombre.trim().toUpperCase();
		if (nombre.length() > 0) {
			for (Persona persona : this.listPersonas) {
				if (persona.getNombre().toUpperCase().indexOf(nombre) > -1) {
					lstper.add(persona);
				}
			}
		}

		return lstper;
	}

}
