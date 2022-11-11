package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.JFrame;

public class View extends JFrame{
	
	private PanelInicio pInicio;
	private PanelRegistrarse pRegistrarse;
	private PanelHombre pHombre;
	
	public View() {
		setLayout(null);
		setTitle("Media Naranja");					
		setSize(1000,700);											
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
		getContentPane().setBackground(new Color(222, 184, 135));	
		getContentPane().setLayout(null);							
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void inicializarComponentes() {
	
		pInicio = new PanelInicio();
		pInicio.setBounds(0, 0, 1000, 700);
		//add(pInicio);
		
		pRegistrarse = new PanelRegistrarse();
		pRegistrarse.setBounds(0, 0, 1000, 700);
		//add(pRegistrarse);
		
		pHombre = new PanelHombre();
		pHombre.setBounds(0, 0, 1000, 700);
		add(pHombre);
		
	}

}
