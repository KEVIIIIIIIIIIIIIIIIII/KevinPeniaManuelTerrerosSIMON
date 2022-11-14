package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistance.FileHandler;

public class HombreDAO {
	
	private ArrayList<HombreDTO> listaHombre;
	
	
	public HombreDAO() {
		listaHombre = new ArrayList<HombreDTO>();
	}
	

	
	public void agregarUsuario(String id, String nombre, String apellido1, String apellido2, String sexo, String usuario,
			String contraseña, String correo, String nacimiento, String edad, String ingreso, String divorcio, String nLikesRecibido, String nLikesOtorgado,
			String matches, String estado) {
		listaHombre.add(new HombreDTO(id, nombre, apellido1, apellido2, sexo, usuario, contraseña, correo, nacimiento, edad,ingreso,divorcio,nLikesRecibido,
				nLikesOtorgado, matches, estado));
	}
	
	public String mostrar() {
		String aux = "";
		for (HombreDTO s : listaHombre) {
			aux += s.getId()+";"+s.getNombre()+";"+s.getApellido1()+";"+s.getApellido2()+";"+s.getSexo()+";"+s.getUsuario()+";"+s.getContraseña()
			+";"+s.getCorreo()+";"+s.getNacimiento()+";"+s.getEdad()+";"+s.getIngreso() + ";"+s.getDivorcio()+";"+s.getnLikesRecibido()+";"+s.getnLikesOtorgado()
			+";"+s.getMatches()+";"+s.getEstado()+"\n";
		}
		return aux;
	}



	public ArrayList<HombreDTO> getListaHombre() {
		return listaHombre;
	}



	public void setListaHombre(ArrayList<HombreDTO> listaHombre) {
		this.listaHombre = listaHombre;
	}

}
