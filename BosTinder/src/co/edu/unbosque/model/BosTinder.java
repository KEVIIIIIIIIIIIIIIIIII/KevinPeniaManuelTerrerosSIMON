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
		hombreDAO.agregarUsuario("470","jualia","erino","mmguevo","H","elmariquita","ickkck","16/45/16196","ala", "4","5165165","feliz","12","4561","23","felizmente soltero");
		file.escribirArchivo(hombreDAO.mostrar());
		//file.leerArchivo(hombreDAO.getListaHombre());
		
		
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
