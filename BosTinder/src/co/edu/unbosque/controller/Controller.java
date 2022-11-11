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
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
