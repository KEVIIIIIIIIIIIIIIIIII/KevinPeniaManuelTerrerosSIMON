package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelJuegoNorte  extends JPanel{
	
	private JLabel titulo;
	private JLabel cuadroNum1;
	private JLabel cuadroNum2;
	private JLabel cuadroNum3;
	private JLabel cuadroNum4;
	private String nuevoCuadroNum1;
	private String nuevoCuadroNum2;
	private String nuevoCuadroNum3;
	private String nuevoCuadroNum4;
	
	public PanelJuegoNorte() {
		nuevoCuadroNum1= "";
		nuevoCuadroNum2= "";
		nuevoCuadroNum3= "";
		nuevoCuadroNum4= "";
				
		
		inicializarComponentes();
		setVisible(false);
	}
	
	public void inicializarComponentes() {
		setLayout(new GridLayout(0,5));
		
		titulo = new JLabel("Numeros: ");
		cuadroNum1 = new JLabel("0");
		cuadroNum2 = new JLabel("0");
		cuadroNum3 = new JLabel("0");
		cuadroNum4 = new JLabel("0");
		
		
		titulo.setFont(new Font("", 20, 20));
		cuadroNum1.setFont(new Font("", 20, 20));
		cuadroNum2.setFont(new Font("", 20, 20));
		cuadroNum3.setFont(new Font("", 20, 20));
		cuadroNum4.setFont(new Font("", 20, 20));
		
		add(titulo);
		add(cuadroNum1);
		add(cuadroNum2);
		add(cuadroNum3);
		add(cuadroNum4);
		
	}
	
	public void actualizar() {
		titulo = new JLabel("Numeros: ");
		cuadroNum1 = new JLabel(nuevoCuadroNum1);
		cuadroNum2 = new JLabel(nuevoCuadroNum2);
		cuadroNum3 = new JLabel(nuevoCuadroNum3);
		cuadroNum4 = new JLabel(nuevoCuadroNum4);
		
		
		titulo.setFont(new Font("", 20, 20));
		cuadroNum1.setFont(new Font("", 20, 20));
		cuadroNum2.setFont(new Font("", 20, 20));
		cuadroNum3.setFont(new Font("", 20, 20));
		cuadroNum4.setFont(new Font("", 20, 20));
		
		add(titulo);
		add(cuadroNum1);
		add(cuadroNum2);
		add(cuadroNum3);
		add(cuadroNum4);
	}

	public JLabel getCuadroNum1() {
		return cuadroNum1;
	}

	public void setCuadroNum1(JLabel cuadroNum1) {
		this.cuadroNum1 = cuadroNum1;
	}

	public JLabel getCuadroNum2() {
		return cuadroNum2;
	}

	public void setCuadroNum2(JLabel cuadroNum2) {
		this.cuadroNum2 = cuadroNum2;
	}

	public JLabel getCuadroNum3() {
		return cuadroNum3;
	}

	public void setCuadroNum3(JLabel cuadroNum3) {
		this.cuadroNum3 = cuadroNum3;
	}

	public JLabel getCuadroNum4() {
		return cuadroNum4;
	}

	public void setCuadroNum4(JLabel cuadroNum4) {
		this.cuadroNum4 = cuadroNum4;
	}

	public String getNuevoCuadroNum1() {
		return nuevoCuadroNum1;
	}

	public void setNuevoCuadroNum1(String nuevoCuadroNum1) {
		this.nuevoCuadroNum1 = nuevoCuadroNum1;
	}

	public String getNuevoCuadroNum2() {
		return nuevoCuadroNum2;
	}

	public void setNuevoCuadroNum2(String nuevoCuadroNum2) {
		this.nuevoCuadroNum2 = nuevoCuadroNum2;
	}

	public String getNuevoCuadroNum3() {
		return nuevoCuadroNum3;
	}

	public void setNuevoCuadroNum3(String nuevoCuadroNum3) {
		this.nuevoCuadroNum3 = nuevoCuadroNum3;
	}

	public String getNuevoCuadroNum4() {
		return nuevoCuadroNum4;
	}

	public void setNuevoCuadroNum4(String nuevoCuadroNum4) {
		this.nuevoCuadroNum4 = nuevoCuadroNum4;
	}
	
}
