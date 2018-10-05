package ejercicios_20181002.RA9_Im_Programmer;

public class Oracion2 extends Oracion {
	private String complemento;

	public Oracion2() {
		super();
		complemento = "";
	}

	public Oracion2(String sujeto, String verbo) {
		super(sujeto, verbo);
		complemento = "";
	}
	
	public Oracion2(String sujeto, String verbo, String complemento) {
		super(sujeto, verbo);
		this.complemento = complemento;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	

}
