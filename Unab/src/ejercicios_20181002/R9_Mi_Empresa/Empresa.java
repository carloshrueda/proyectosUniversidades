package ejercicios_20181002.R9_Mi_Empresa;

import java.util.ArrayList;

public class Empresa {
	private static int nivelJerarquia;
	private ArrayList<Cargo> listCargos;
	private ArrayList<Empleado> listEmpleados;
	
	public Empresa() {
		listCargos= new ArrayList<Cargo>();
		listEmpleados = new ArrayList<Empleado>();
		nivelJerarquia = 0;
	}

	public ArrayList<Cargo> getListCargos() {
		return listCargos;
	}

	public ArrayList<Empleado> getListEmpleados() {
		return listEmpleados;
	}
	
	public void agregarCargo(Cargo cargo) {
		nivelJerarquia += 1;
		cargo.setJerarquia(nivelJerarquia);
		listCargos.add(cargo);
	}
	
	public void agregarEmpleado(Empleado empleado) {
		listEmpleados.add(empleado);
	}

}
