package co.edu.unbosque.view;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class View extends JFrame{
	
	private PanelInicio pInicio;
	private PanelRegistrarse pRegistrarse;
	private PanelHombre pHombre;
	private PanelMujer pMujer;
	private PanelCita pCita;
	
	public View() {
		setLayout(null);
		setTitle("Media Naranja");					
		setSize(1000,700);											
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
		getContentPane().setBackground(new Color(222, 184, 135));	
		getContentPane().setLayout(null);	
		setIconImage(new ImageIcon(getClass().getResource("/co/edu/unbosque/view/icono.png")).getImage());
		
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
		//add(pHombre);
		
		pMujer=new PanelMujer();
        pMujer.setBounds(0, 0, 1000, 700);
        add(pMujer);
        
        pCita=new PanelCita();
        pCita.setBounds(0, 0, 1000, 700);
        //add(pCita);
		
	}

	public PanelInicio getpInicio() {
		return pInicio;
	}

	public void setpInicio(PanelInicio pInicio) {
		this.pInicio = pInicio;
	}

	public PanelRegistrarse getpRegistrarse() {
		return pRegistrarse;
	}

	public void setpRegistrarse(PanelRegistrarse pRegistrarse) {
		this.pRegistrarse = pRegistrarse;
	}

	public PanelHombre getpHombre() {
		return pHombre;
	}

	public void setpHombre(PanelHombre pHombre) {
		this.pHombre = pHombre;
	}

	public PanelMujer getpMujer() {
		return pMujer;
	}

	public void setpMujer(PanelMujer pMujer) {
		this.pMujer = pMujer;
	}

	public PanelCita getpCita() {
		return pCita;
	}

	public void setpCita(PanelCita pCita) {
		this.pCita = pCita;
	}

}
