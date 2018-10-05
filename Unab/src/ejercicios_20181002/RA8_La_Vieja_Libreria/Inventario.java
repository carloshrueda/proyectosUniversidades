package ejercicios_20181002.RA8_La_Vieja_Libreria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Inventario {
	ArrayList<Libro> listLibros;

	public Inventario() {
		listLibros = new ArrayList<Libro>();
	}

	public void agregarLibro(Libro libro) {
		listLibros.add(libro);
	}

	public Libro buscarLibro(int codigo) {
		Libro libroresult = null;

		for (Libro libro : listLibros) {
			if (libro.getCodigo() == codigo) {
				libroresult = libro;
				break;
			}
		}

		return libroresult;
	}

	public int eliminarExistenciaLibro(int codigo) {
		int existenciasLibro = 0;
		Libro libroresult = buscarLibro(codigo);

		if (libroresult != null) {
			// existe el libro
			existenciasLibro = libroresult.getExistencias();
			if (existenciasLibro > 0) {
				// tiene existencias;
				existenciasLibro -= 1;
				libroresult.setExistencias(existenciasLibro);

			} else {
				// no se puede eliminar existencias por que no tiene
				existenciasLibro = Mensaje.NOTIENEEXISTENCIAS.getValor();
			}

		} else {
			// no se encontró el libro con ese código
			existenciasLibro = Mensaje.CODIGONOEXISTE.getValor();
		}

		return existenciasLibro;
	}

	public int anadirExistenciaLibro(int codigo) {
		int existenciasLibro = 0;
		Libro libroresult = buscarLibro(codigo);

		if (libroresult != null) {
			// existe el libro
			existenciasLibro = libroresult.getExistencias() + 1;
			libroresult.setExistencias(existenciasLibro);

		} else {
			// no se encontró el libro con ese código
			existenciasLibro = Mensaje.CODIGONOEXISTE.getValor();
		}

		return existenciasLibro;
	}
	
	public ArrayList<Libro> librosMasCaros() {
		ArrayList<Libro> listresult = new ArrayList<Libro>();
		
		//ordena los libros por el codigo de mayor a menor
		Collections.sort(listLibros, new Comparator<Libro>() {
		    @Override
		    public int compare(Libro o1, Libro o2) {
		    	if (o1.getCodigo() > o2.getCodigo()) {
					return -1;
				}
				if (o1.getCodigo() < o2.getCodigo()) {
					return 1;
				}
				return 0;
		    }
		});
		
		/*Collections.sort(listLibros, new Comparator<Libro>() {
		    @Override
		    public int compare(Libro o1, Libro o2) {
		        return new Integer(o1.getCodigo()).compareTo(o2.getCodigo());
		    }
		});
		
		Collections.sort(listLibros, (o1, o2) -> new Integer(o1.getCodigo()).compareTo(o2.getCodigo()));
		*/
		
		int cont = 0;
		for (Libro libro : listLibros) {
			listresult.add(libro);
			++cont;
			if (cont == 3) {
				//solo agrega 3 libros mas caros
				break;
			}
			
		}
		
		return listresult;
	}

}
