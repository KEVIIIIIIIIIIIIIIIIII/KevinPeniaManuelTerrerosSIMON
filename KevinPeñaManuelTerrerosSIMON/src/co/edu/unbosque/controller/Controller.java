package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.Simon;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private View vista;
	private Simon simon;
	
	public Controller() {
		vista = new View();
		simon = new Simon();
		

		asignarOyentes();
		
	}

	private void asignarOyentes() {
		
		vista.getPanelInicio().getBotonInicio().addActionListener(this);
		vista.getPanelDificultad().getButContinuar().addActionListener(this);
		vista.getPanelJuegoCentro().getN1().addActionListener(this);
		vista.getPanelJuegoCentro().getN2().addActionListener(this);
		vista.getPanelJuegoCentro().getN3().addActionListener(this);
		vista.getPanelJuegoCentro().getN4().addActionListener(this);
		vista.getPanelJuegoSur().getTerminar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
			String aux1 = "";
			
			String comando = e.getActionCommand();
			switch (comando) {
			case "Inicio":
				vista.getPanelInicio().setVisible(false);
				vista.getPanelDificultad().setVisible(true);
				break;
				
			case "Continuar":
				
				if(vista.getPanelDificultad().getBoxElegir().getSelectedItem().toString().equals("¿Puedo jugar papi?")) {
					cambiarListaNumeros(2000);
					
				}else if(vista.getPanelDificultad().getBoxElegir().getSelectedItem().toString().equals("No me hagas daño")){
					cambiarListaNumeros(1000);
					
				}else if(vista.getPanelDificultad().getBoxElegir().getSelectedItem().toString().equals("Soy la muerte encarnada!")){
					cambiarListaNumeros(350);
					
				}
				break;
				
			case "1":
			case "2":
			case "3":
			case "4":
				simon.getEstructuraJuego().recibirCadenaIngresada(comando);
				break;
				
			case "TERMINAR":
				
				terminarJuego(aux1);
				vista.setVisible(false);
			default:
				break;
			}
	}

	public void terminarJuego(String cadena) {
		String cadenaIngresada = cadena;
		vista.getPanelJuegoNorte().setVisible(false);
		vista.getPanelJuegoCentro().setVisible(false);
		vista.getPanelJuegoSur().setVisible(false);
		if(simon.getEstructuraJuego().compararRespuestas() == true) {
			vista.getFin().mostrarMensaje( vista.getPanelDificultad().getTxtEspacio().getText() + " Sos todo un crack" + "\n" + "SECUENCIA EXITOSA!");
		}else {
			vista.getFin().mostrarMensaje( vista.getPanelDificultad().getTxtEspacio().getText() + ":" + "\n" +"FALLASTE!");
		}
	}

	public void cambiarListaNumeros(int tiempoLimite) {
		Timer timer = new Timer();
		simon.getEstructuraJuego().generarNumeroRandom();
		vista.getPanelDificultad().setVisible(false);
		vista.getPanelJuegoNorte().getCuadroNum1().setText(String.valueOf(simon.getEstructuraJuego().getNumRad1()));
		vista.getPanelJuegoNorte().getCuadroNum2().setText(String.valueOf(simon.getEstructuraJuego().getNumRad2()));
		vista.getPanelJuegoNorte().getCuadroNum3().setText(String.valueOf(simon.getEstructuraJuego().getNumRad3()));
		vista.getPanelJuegoNorte().getCuadroNum4().setText(String.valueOf(simon.getEstructuraJuego().getNumRad4()));
		vista.getPanelJuegoNorte().setVisible(true);
		TimerTask timerTask = new TimerTask() {
			
			@Override
			public void run() {
				
				vista.getPanelJuegoNorte().setVisible(false);
				
			}
		};
		timer.schedule(timerTask, tiempoLimite);

		vista.getPanelJuegoCentro().setVisible(true);
		vista.getPanelJuegoSur().setVisible(true);
		
	}	
	
}
