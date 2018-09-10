package ejercicios_20180909.HerederoPolimorfismoReloaded;

// Fichero VentanaCerrable.java
import java.awt.*;
import java.awt.event.*;

class VentanaCerrable extends Frame implements WindowListener {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// constructores
	public VentanaCerrable() {
		super();
		//setModalExclusionType(Dialog.ModalExclusionType.NO_EXCLUDE);
	}

	public VentanaCerrable(String title) {
		super(title);
		setSize(800, 600);
		//setModalExclusionType(Dialog.ModalExclusionType.NO_EXCLUDE);
		addWindowListener(this);
	}

// métodos de la interface WindowsListener
	public void windowActivated(WindowEvent e) {
		;
	}

	public void windowClosed(WindowEvent e) {
		;
	}

	public void windowClosing(WindowEvent e) {
		//System.exit(0);
		this.setVisible(false);
	}

	public void windowDeactivated(WindowEvent e) {
		;
	}

	public void windowDeiconified(WindowEvent e) {
		;
	}

	public void windowIconified(WindowEvent e) {
		;
	}

	public void windowOpened(WindowEvent e) {
		;
	}
} // fin de la clase VentanaCerrable