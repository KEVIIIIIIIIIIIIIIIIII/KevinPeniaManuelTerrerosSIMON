package co.edu.unbosque.model;

import co.edu.unbosque.model.persistance.FileHandler;

public class BosTinder {
	
	private HombreDAO hombreDAO;
	private MujerDAO mujerDAO;
	
	public BosTinder() {
		hombreDAO = new HombreDAO();
		mujerDAO = new MujerDAO();
	}


	public MujerDAO getMujerDAO() {
		return mujerDAO;
	}

	public void setMujerDAO(MujerDAO mujerDAO) {
		this.mujerDAO = mujerDAO;
	}

	public HombreDAO getHombreDAO() {
		return hombreDAO;
	}


	public void setHombreDAO(HombreDAO hombreDAO) {
		this.hombreDAO = hombreDAO;
	}



}
