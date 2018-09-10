package ejercicios_20180909.HerederoPolimorfismoReloaded;

// fichero Dibujable.java
import java.awt.Graphics;

public interface Dibujable {
	public void setPosicion(double x, double y);

	public void dibujar(Graphics dw);
}