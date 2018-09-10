package ejercicios_20180909.HerederoPolimorfismoReloaded;

// fichero PanelDibujo.java
import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class PanelDibujo extends Panel {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// variable miembro
	private ArrayList<Geometria> v;

// constructor
	public PanelDibujo(ArrayList<Geometria> va) {
		super(new FlowLayout());
		this.v = va;
	}

// redefinición del método paint()
	public void paint(Graphics g) {
		Dibujable dib;
		Iterator<Geometria> it;
		it = v.iterator();
		while (it.hasNext()) {
			dib = (Dibujable) it.next();
			dib.dibujar(g);
		}
	}
} // Fin de la clase PanelDibujo