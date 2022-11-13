package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistance.FileHandler;

public class HombreDAO {
	
	private ArrayList<HombreDTO> listaHombre;
	
	public HombreDAO() {
		listaHombre = new ArrayList<HombreDTO>();
	}
	
	public void agregarUsuario(String nombre, String apellido1, String apellido2, String sexo, int edad, int id, String usuario,
			String contraseña, String correo, String nacimiento, float ingreso) {
		listaHombre.add(new HombreDTO(nombre,  apellido1,  apellido2,  sexo,  edad,  id,  usuario,
				 contraseña,  correo,  nacimiento,  ingreso));
	}
	
	public String mostrar() {
		String aux = "";
		for (HombreDTO s : listaHombre) {
			aux += s.toString();
		}
		return aux;
	}

}
