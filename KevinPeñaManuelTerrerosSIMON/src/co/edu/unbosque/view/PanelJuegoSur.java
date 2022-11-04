package co.edu.unbosque.view;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelJuegoSur extends JPanel{
	
	/**
	 * 
	 */
	private static final String TERMINAR = "TERMINAR";
	private JButton terminar;
	
	public PanelJuegoSur() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		 setLayout(new GridLayout(3,0));
		  
		 terminar = new JButton("TERMINAR");
		 terminar.setFont(new Font("", 20, 18));
		 terminar.setActionCommand(TERMINAR);
		 
		 add(new JLabel(""));
		 add(terminar);
		 add(new JLabel(""));
		 
		
	}

	public JButton getTerminar() {
		return terminar;
	}

	public void setTerminar(JButton terminar) {
		this.terminar = terminar;
	}

}
