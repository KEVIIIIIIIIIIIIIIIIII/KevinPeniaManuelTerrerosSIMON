package co.edu.unbosque.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.persistance.FileHandler;

public class MujerDAO {
	
	private ArrayList<MujerDTO> listaMujer;
	
	public MujerDAO() {
		listaMujer = new ArrayList<MujerDTO>();
	}
	
//	public void loadFile() {
//        //String content = FileHandler.loadFile("datos.csv");
//      //  String[] lines = content.split("\n");
//        for (String s : lines) {
//            if (s.equals(""))
//                continue;
//            String[] columns = s.split(";");
//            listaMujer.add(new MujerDTO(Integer.parseInt(columns[0]),columns[1],columns[2],columns[3],columns[4],columns[5],columns[6],columns[7],columns[8],
//            		Integer.parseInt(columns[9]),columns[10],columns[11],Integer.parseInt(columns[12]),Integer.parseInt(columns[13]),Integer.parseInt(columns[14]),
//            		columns[15]));
//        }
//	}
	
	public void agregarUsuario(String id, String nombre, String apellido1, String apellido2, String sexo, String usuario,
			String contraseña, String correo, String nacimiento, int edad, String ingreso, String divorcio, int nLikesRecibido, int nLikesOtorgado,
			int matches, String estado) {
		listaMujer.add(new MujerDTO(id, nombre, apellido1, apellido2, sexo, usuario, contraseña, correo, nacimiento, edad,ingreso,divorcio,nLikesRecibido,
				nLikesOtorgado, matches, estado));
	}
	
	public String mostrar() {
		String aux = "";
		for (MujerDTO s : listaMujer) {
			aux += s.toString();
		}
		return aux;
	}
	
	
	

}
