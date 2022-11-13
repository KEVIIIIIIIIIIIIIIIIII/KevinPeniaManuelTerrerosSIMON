package co.edu.unbosque.model;

import co.edu.unbosque.model.persistance.FileHandler;

public class BosTinder {
	
	private HombreDAO hombreDAO;
	private FileHandler file;
	private MujerDAO mujerDAO;
	
	public BosTinder() {
		hombreDAO = new HombreDAO();
		file = new FileHandler();
		mujerDAO = new MujerDAO();
	}
	
	public void gestionarArchivo() {
		file.escribirArchivo(hombreDAO.mostrar());
	}
	public void gestionarArchivo2() {
		file.escribirArchivo(mujerDAO.mostrar());
	}


	public FileHandler getFile() {
		return file;
	}

	public void setFile(FileHandler file) {
		this.file = file;
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
