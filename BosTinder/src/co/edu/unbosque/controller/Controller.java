package co.edu.unbosque.controller;

import co.edu.unbosque.model.BosTinder;
import co.edu.unbosque.view.View;

public class Controller {
	
	private View view;
	private BosTinder bosTinder;
	
	public Controller() {
		view = new View();
		bosTinder = new BosTinder();
	}

}
