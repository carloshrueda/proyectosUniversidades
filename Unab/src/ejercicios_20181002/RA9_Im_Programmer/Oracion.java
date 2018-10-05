package ejercicios_20181002.RA9_Im_Programmer;

public class Oracion {
	private String sujeto;
	private String verbo;

	public Oracion() {
		sujeto = "";
		verbo = "";
	}

	public Oracion(String sujeto, String verbo) {
		this.sujeto = sujeto;
		this.verbo = verbo;
	}

	public String getSujeto() {
		return sujeto;
	}

	public String getVerbo() {
		return verbo;
	}

	public void setSujeto(String sujeto) {
		this.sujeto = sujeto;
	}

	public void setVerbo(String verbo) {
		this.verbo = verbo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Oracion [sujeto=");
		builder.append(sujeto);
		builder.append(", verbo=");
		builder.append(verbo);
		builder.append("]");
		return builder.toString();
	}

}
