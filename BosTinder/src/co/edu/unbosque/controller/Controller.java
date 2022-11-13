package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import co.edu.unbosque.model.BosTinder;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private View view;
	private BosTinder bosTinder;
	
	public Controller() {
		view = new View();
		bosTinder = new BosTinder();
		asignarOyentes();
	}

	public void asignarOyentes() {
		
		view.getpHombre().getGuardar().addActionListener(this);
		view.getpMujer().getAceptar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String aux = e.getActionCommand();
		
		switch (aux) {
		case "GUARDAR":
			bosTinder.getHombreDAO().agregarUsuario("Julio el gay","sapo","cualquier marikada","mujer",2,467,"suputamadre.com","1234","ahd asv","el dia que nacio", 6545);
			bosTinder.gestionarArchivo();
			break;
			
		case "GUARDAR2":
			bosTinder.getMujerDAO().agregarUsuario("Juliana la lesbiana","sapa","Feminista","Women",34,468,"niñaslindas.com","4321","escribeme","toy vieja", "Si 12 veces y estoy orgullosa");
			bosTinder.gestionarArchivo2();
			break;

		default:
			break;
		}
		
	}

}
