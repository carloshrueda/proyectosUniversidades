package ejercicios_20180909.MiniMarket;

import java.util.Date;

public class Medicamentos extends Producto {
	private String laboratorio;
	private int lote;
	private Date fechaven;
	private Double tempalmacen;

	public Medicamentos() {
		super();
		setLaboratorio("");
		setLote(0);
		setFechaven(null);
		setTempalmacen(0.0);
	}

	public Medicamentos(String nombre, int valor, int existencia, int reorden) {
		super(nombre, valor, existencia, reorden);
		setLaboratorio("");
		setLote(0);
		setFechaven(null);
		setTempalmacen(0.0);
	}

	public Medicamentos(String nombre, int valor, int existencia, int reorden, String laboratorio, int lote,
			Date fechaven, Double tempalmacen) {
		super(nombre, valor, existencia, reorden);
		setLaboratorio(laboratorio);
		setLote(lote);
		setFechaven(fechaven);
		setTempalmacen(tempalmacen);
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public int getLote() {
		return lote;
	}

	public Date getFechaven() {
		return fechaven;
	}

	public Double getTempalmacen() {
		return tempalmacen;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public void setLote(int lote) {
		if (lote < 0)
			lote = 0;
		this.lote = lote;
	}

	public void setFechaven(Date fechaven) {
		this.fechaven = fechaven;
	}

	public void setTempalmacen(Double tempalmacen) {
		if (tempalmacen < 0.0)
			tempalmacen = 0.0;
		this.tempalmacen = tempalmacen;
	}

}
