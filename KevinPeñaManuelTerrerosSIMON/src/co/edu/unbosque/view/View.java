package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class View extends JFrame{
	
	private PanelInicio panelInicio;
	private PanelDificultad panelDificultad;
	private PanelJuegoNorte panelJuegoNorte;
	private PanelJuegoCentro panelJuegoCentro;
	private PanelJuegoSur panelJuegoSur;
	private Fin fin;
	
	public View() {
		fin = new Fin();
		setLayout(null);
		setTitle("SIMON");					
		setSize(600,400);											
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);				
		getContentPane().setBackground(new Color(222, 184, 135));	
		getContentPane().setLayout(null);							
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void inicializarComponentes() {
		panelInicio = new PanelInicio ();
		panelInicio.setVisible(true);
		panelInicio.setBounds(0, 0, 600, 400);
		panelInicio.setBackground(new Color(71,255,43));
		getContentPane().add(panelInicio);
		
		panelDificultad = new PanelDificultad ();
		panelDificultad.setBackground(new Color(95, 158, 160));
		panelDificultad.setBounds(65, 70, 465, 200);
		getContentPane().add(panelDificultad);
	
		panelJuegoNorte = new PanelJuegoNorte ();
		panelJuegoNorte.setBounds(0, 0, 600, 50);
		panelJuegoNorte.setBackground(new Color(95, 158, 160));
		getContentPane().add(panelJuegoNorte);
		
		panelJuegoCentro = new PanelJuegoCentro ();
		panelJuegoCentro.setBounds(100, 51, 400, 260);
		getContentPane().add(panelJuegoCentro);
		
		panelJuegoSur = new PanelJuegoSur ();
		panelJuegoSur.setBounds(0, 312, 600, 50);
		panelJuegoSur.setBackground(new Color(95, 158, 160));
		getContentPane().add(panelJuegoSur);
		
	}

	public PanelInicio getPanelInicio() {
		return panelInicio;
	}

	public void setPanelInicio(PanelInicio panelInicio) {
		this.panelInicio = panelInicio;
	}

	public PanelDificultad getPanelDificultad() {
		return panelDificultad;
	}

	public void setPanelDificultad(PanelDificultad panelDificultad) {
		this.panelDificultad = panelDificultad;
	}

	public PanelJuegoNorte getPanelJuego() {
		return panelJuegoNorte;
	}

	public void setPanelJuego(PanelJuegoNorte panelJuego) {
		this.panelJuegoNorte = panelJuego;
	}

	public PanelJuegoNorte getPanelJuegoNorte() {
		return panelJuegoNorte;
	}

	public void setPanelJuegoNorte(PanelJuegoNorte panelJuegoNorte) {
		this.panelJuegoNorte = panelJuegoNorte;
	}

	public PanelJuegoCentro getPanelJuegoCentro() {
		return panelJuegoCentro;
	}

	public void setPanelJuegoCentro(PanelJuegoCentro panelJuegoCentro) {
		this.panelJuegoCentro = panelJuegoCentro;
	}

	public PanelJuegoSur getPanelJuegoSur() {
		return panelJuegoSur;
	}

	public void setPanelJuegoSur(PanelJuegoSur panelJuegoSur) {
		this.panelJuegoSur = panelJuegoSur;
	}

	public Fin getFin() {
		return fin;
	}

	public void setFin(Fin fin) {
		this.fin = fin;
	}
	
	
	
}
