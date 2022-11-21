package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistance.FileHandler;

public class HombreDAO {

	private ArrayList<HombreDTO> listaHombre;

	public HombreDAO() {
		listaHombre = new ArrayList<HombreDTO>();
		loadFile();

	}

	public void agregarUsuario(String id, String nombre, String apellido1, String apellido2, String sexo,
			String usuario, String contrasena, String correo, String nacimiento, String edad, String ingreso,
			String divorcio, String nLikesRecibido, String nLikesOtorgado, String matches, String estado) {
		listaHombre.add(new HombreDTO(id, nombre, apellido1, apellido2, sexo, usuario, contrasena, correo, nacimiento,
				edad, ingreso, divorcio, nLikesRecibido, nLikesOtorgado, matches, estado));
		FileHandler.writeFile("dats.csv", mostrar());
	}

	public String mostrar() {
		String aux = "";
		for (HombreDTO s : listaHombre) {
			aux += s.toString() + "\n";
		}
		return aux;
	}

	public void loadFile() {
		String content = FileHandler.loadFile("dats.csv");
		String[] lines = content.split("\n");
		for (String s : lines) {
			if (s.equals(""))
				continue;
			String[] columns = s.split("~");
			String id = columns[0], nombre = columns[1], apellido1 = columns[2], apellido2 = columns[3],
					sexo = columns[4], usuario = columns[5], contrasena = columns[6], correo = columns[7],
					nacimiento = columns[8], edad = columns[9], ingreso = columns[10], divorcio = columns[11],
					nLikesRecibido = columns[12], nLikesOtorgado = columns[13], matches = columns[14],
					estado = columns[15];
			agregarUsuario(id, nombre, apellido1, apellido2, sexo, usuario, contrasena, correo, nacimiento, edad,
					ingreso, divorcio, nLikesRecibido, nLikesOtorgado, matches, estado);
		}
	}

	public ArrayList<HombreDTO> getListaHombre() {
		return listaHombre;
	}

	public void setListaHombre(ArrayList<HombreDTO> listaHombre) {
		this.listaHombre = listaHombre;
	}

}
