package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelInicio  extends JPanel{
	
	private ImageIcon imagenFondo;
	private JButton botonInicio;
	private JLabel fondo;
	private JLabel titulo;
	public static final String INICIO = "Inicio";
	
	public PanelInicio() {
		setLayout(new BorderLayout());
		
		inicializarComponentes();
		
		setVisible(true);
	}

	private void inicializarComponentes() {
		String tit = "EL JUEGO "+ "\n" +" DEL SIMON";
		imagenFondo = new ImageIcon("./img/fondo1.png");
		fondo = new JLabel();
		fondo.setBounds(0, 0, 600, 400);
		fondo.setIcon(new ImageIcon(imagenFondo.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH)));
		fondo.setOpaque(true);
		
		botonInicio = new JButton("INICIO");
		botonInicio.setBounds(235, 200, 100, 50);
		botonInicio.setFont(new Font("", 20, 20));
		botonInicio.setBackground(new Color(255, 255, 224));
		botonInicio.setActionCommand(INICIO);
		
		titulo = new JLabel(tit);
		titulo.setForeground(new Color(7, 245, 247));
		titulo.setBounds(150, 115, 600, 50);
		titulo.setFont(new Font("", 25, 25));
		
		add(titulo);
		add(botonInicio);
		add(fondo);
	}

	public JButton getBotonInicio() {
		return botonInicio;
	}

	public void setBotonInicio(JButton botonInicio) {
		this.botonInicio = botonInicio;
	}

}
