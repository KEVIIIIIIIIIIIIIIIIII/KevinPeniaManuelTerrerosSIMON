package co.edu.unbosque.view;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Fin {
	
	public void mostrarMensaje(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	public int volverAJugar(String msg) {
		return JOptionPane.showConfirmDialog(null, msg);
	}
}
