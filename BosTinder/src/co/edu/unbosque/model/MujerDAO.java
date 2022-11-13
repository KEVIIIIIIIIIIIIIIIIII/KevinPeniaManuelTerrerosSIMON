package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistance.FileHandler;

public class MujerDAO {
	
	private ArrayList<MujerDTO> listaMujer;
	
	public MujerDAO() {
		listaMujer = new ArrayList<MujerDTO>();
	}
	
	public void agregarUsuario(String nombre, String apellido1, String apellido2, String sexo, int edad, int id, String usuario,
			String contraseña, String correo, String nacimiento, String divorcio) {
		listaMujer.add(new MujerDTO(nombre,  apellido1,  apellido2,  sexo,  edad,  id,  usuario,
				 contraseña,  correo,  nacimiento,  divorcio));
	}
	
	public String mostrar() {
		String aux = "";
		for (MujerDTO s : listaMujer) {
			aux += s.toString();
		}
		return aux;
	}

}
