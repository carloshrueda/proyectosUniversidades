package ejercicios_20181002.RA8_La_Vieja_Libreria;

public class Libro {
	private int codigo;
	private String titulo;
	private String autor;
	private int precio;
	private int existencias;

	public Libro() {
		codigo = Integer.MIN_VALUE;
		titulo = "";
		autor = "";
		precio = Integer.MIN_VALUE;
		existencias = Integer.MIN_VALUE;
	}

	public Libro(int codigo, String titulo, String autor, int precio, int existencias) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		if (precio > 0) {
			this.precio = precio;
		} else {
			this.precio = 0;
		}
		if (existencias > 0) {
			this.existencias = existencias;
		} else {
			this.precio = 0;
		}
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getPrecio() {
		return precio;
	}

	public int getExistencias() {
		return existencias;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DATOS DEL LIBRO:\n Codigo: ");
		builder.append(codigo);
		builder.append("\n Título: ");
		builder.append(titulo);
		builder.append("\n Autor: ");
		builder.append(autor);
		builder.append("\n Precio: ");
		builder.append(precio);
		builder.append("\n Existencias: ");
		builder.append(existencias);

		return builder.toString();
	}
}
