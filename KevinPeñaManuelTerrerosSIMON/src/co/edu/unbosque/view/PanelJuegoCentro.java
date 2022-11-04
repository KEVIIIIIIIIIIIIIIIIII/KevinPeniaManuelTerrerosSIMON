package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelJuegoCentro extends JPanel{
	
	/**
	 * 
	 */
	private static final String N1 = "1";
	private static final String N2 = "2";
	private static final String N3 = "3";
	private static final String N4 = "4";
	private JButton n1;
	private JButton n2;
	private JButton n3;
	private JButton n4;
	
	public PanelJuegoCentro() {
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		setLayout(new GridLayout(2,2));
		
		n1 = new JButton("1");
		n1.setFont(new Font("", 40, 40));
		n1.setBackground(new Color(255, 255, 224));
		n1.setActionCommand(N1);
		n2 = new JButton("2");
		n2.setFont(new Font("", 40, 40));
		n2.setBackground(new Color(255, 255, 224));
		n2.setActionCommand(N2);
		n3 = new JButton("3");
		n3.setFont(new Font("", 40, 40));
		n3.setBackground(new Color(255, 255, 224));
		n3.setActionCommand(N3);
		n4 = new JButton("4");
		n4.setFont(new Font("", 40, 40));
		n4.setBackground(new Color(255, 255, 224));
		n4.setActionCommand(N4);
		
		add(n1);
		add(n2);
		add(n3);
		add(n4);
		
	}

	public JButton getN1() {
		return n1;
	}

	public void setN1(JButton n1) {
		this.n1 = n1;
	}

	public JButton getN2() {
		return n2;
	}

	public void setN2(JButton n2) {
		this.n2 = n2;
	}

	public JButton getN3() {
		return n3;
	}

	public void setN3(JButton n3) {
		this.n3 = n3;
	}

	public JButton getN4() {
		return n4;
	}

	public void setN4(JButton n4) {
		this.n4 = n4;
	}
	

}
