package ejercicios_20181002.R9_Mi_Empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Empresa {
	private static int nivelJerarquia;
	private ArrayList<Cargo> listCargos;
	private ArrayList<Empleado> listEmpleados;

	public Empresa() {
		listCargos = new ArrayList<Cargo>();
		listEmpleados = new ArrayList<Empleado>();
		nivelJerarquia = 0;
	}

	public ArrayList<Cargo> getListCargos() {
		return listCargos;
	}

	public ArrayList<Empleado> getListEmpleados() {
		return listEmpleados;
	}

	public void agregarCargo(String nombre, int sueldo) {
		nivelJerarquia += 1;
		listCargos.add(new Cargo(nombre, sueldo, nivelJerarquia));
	}

	public void agregarEmpleado(Empleado empleado) {
		listEmpleados.add(empleado);
	}

	public Cargo buscarCargo(String nombreCargo) {
		if (nombreCargo.trim().isEmpty())
			return null;

		else {
			for (Cargo cargo : listCargos) {
				if (cargo.getNombre().indexOf(nombreCargo) > -1) {
					// Encontro un cargo con ese nombre
					return cargo;
				}
			}
		}

		return null;
	}

	public Cargo buscarCargoExacto(String nombreCargo) {
		if (nombreCargo.trim().isEmpty())
			return null;

		else {
			for (Cargo cargo : listCargos) {
				if (nombreCargo.equals(cargo.getNombre())) {
					// Encontro un cargo con ese nombre
					return cargo;
				}
			}
		}

		return null;
	}

	public void ajustarNivelJerarquia() {
		// Este método ajusta el nivel de jerarquia al mayor que existe para que en una
		// próxima asignación se pueda seguir con el consecutivo

		if (listCargos.size() > 0) {
			// hay cargos
			int maxjerarquia = listCargos.get(0).getJerarquia();
			for (Cargo cargo : listCargos) {
				if (cargo.getJerarquia() > maxjerarquia) {
					maxjerarquia = cargo.getJerarquia();
				}
			}
			nivelJerarquia = maxjerarquia;

		} else {
			nivelJerarquia = 0;
		}
	}

	public ArrayList<Empleado> ordenarCargoNombre() {
		ArrayList<Empleado> listEmpleadosOrdenada = listEmpleados;

		if (listEmpleadosOrdenada.size() == 0)
			return listEmpleadosOrdenada;

		// ordena los libros por el codigo de mayor a menor
		Collections.sort(listEmpleadosOrdenada, new Comparator<Empleado>() {
			@Override
			/*
			 * public int compare(Empleado o1, Empleado o2) { //primero comparo por el
			 * nombre del cargo int resultado =
			 * o1.getCargo().getNombre().compareTo(o2.getCargo().getNombre()); if (resultado
			 * != 0 ) { //Si no es igual devuelvo el resultado return resultado; }
			 * 
			 * // Si el nombre del cargo es igual, comparo por el nombre del empleado
			 * resultado = o1.getNombre().compareTo(o2.getNombre()); return resultado; }
			 */

			public int compare(Empleado o1, Empleado o2) {
				// concateno el nombre del cargo con el nombre del empleado y lo comparo con el
				// otro objeto
				int resultado = (o1.getCargo().getNombre() + " " + o1.getNombre())
						.compareTo(o2.getCargo().getNombre() + " " + o2.getNombre());
				return resultado;

			}

		});

		return listEmpleadosOrdenada;
	}

	public int calcularNomina() {
		int nomina = 0;

		for (Empleado e : listEmpleados) {
			nomina += e.getCargo().getSueldo();
		}

		return nomina;
	}

}
