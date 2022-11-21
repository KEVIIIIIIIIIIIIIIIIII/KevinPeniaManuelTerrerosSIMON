package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.text.TabStop;

import co.edu.unbosque.model.BosTinder;
import co.edu.unbosque.model.HombreDAO;
import co.edu.unbosque.model.MujerDAO;
import co.edu.unbosque.view.View;

public class Controlador implements ActionListener {

	private View view;
	private int cont = 466;
	private int likeHombre = 140;
	private int likeMujer = 140;
	private int likeotorH = 0;
	private int likeotorM = 0;
	private BosTinder bT;

	public Controlador() {
		view = new View();
		bT = new BosTinder();

	}

	public void iniciar() {
		view.getpInicio().setVisible(true);
		asignarOyentes();
	}

	public void asignarOyentes() {

		view.getpHombre().getGuardar().addActionListener(this);
		view.getpMujer().getAceptar().addActionListener(this);
		view.getpInicio().getIniciar().addActionListener(this);
		view.getpInicio().getRegistrarse().addActionListener(this);
		view.getpInicio().getSalir().addActionListener(this);

		view.getpRegistrarse().getHombre().addActionListener(this);

		view.getpRegistrarse().getMujer().addActionListener(this);

		view.getpCita().getDerecha().addActionListener(this);
		view.getpCita().getIzquierda().addActionListener(this);
		view.getpCita().getCerrarSesion().addActionListener(this);
		view.getpCita().getEditarPerfil().addActionListener(this);
		view.getpCita().getLike().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand() == "INICIAR") {
			view.getpInicio().setVisible(false);
			view.getpCita().setVisible(true);
		}
		if (e.getActionCommand() == "REGISTRARSE") {
			view.getpInicio().setVisible(false);
			view.getpRegistrarse().setVisible(true);
		}
		if (e.getActionCommand() == "SALIR") {
			view.setVisible(false);
			System.exit(0);
		}
		if (e.getActionCommand() == "HOMBRE") {

			view.getpHombre().setVisible(true);
			view.getpRegistrarse().setVisible(false);

		}
		if (e.getActionCommand() == "MUJER") {
			view.getpRegistrarse().setVisible(false);
			view.getpMujer().setVisible(true);
		}
		if (view.getpHombre().GUARDAR.equals(e.getActionCommand())) {

				System.out.println("hh");
				String nombre = view.getpHombre().getCampoNombre().getText();
				String apellido1 = view.getpHombre().getCampoApellido1().getText();
				String apellido2 = view.getpHombre().getCampoApellido2().getText();
				String sexo = "H";
				String usuario = view.getpHombre().getCampoAlias().getText();
				String contrasena = view.getpHombre().getContra1().getText();
				String correo = view.getpHombre().getCampoCorreo().getText();
				String dia = String.valueOf(view.getpHombre().getDia().getSelectedIndex());
				String mes = String.valueOf(view.getpHombre().getMes().getSelectedIndex());
				String anio = view.getpHombre().getCampoAño().getText();
				String edad = view.getpHombre().getCampoEdad().getText();
				String ingreso = view.getpHombre().getCampoIngreso().getText();
				String divorcio = "No aplica";
				String like = String.valueOf(likeHombre);
				String likeot = String.valueOf(likeotorH);
				String matche = "0";
				String estado = "Disponible";
				try {
	
					bT.getHombreDAO().agregarUsuario(String.valueOf(cont), nombre, apellido1, apellido2, sexo, usuario, contrasena, correo,
							dia + "/" + mes + "/" + anio, edad, ingreso, divorcio, like, likeot, matche, estado);
					view.getpHombre().setVisible(false);
					view.getpCita().setVisible(true);
	
				} catch (Exception e2) {
					// JOptionPane.showMessageDialog(null, "Datos incorrectos");
				}

		}
		if (e.getActionCommand() == "GUARDAR2") {
			view.getpMujer().setVisible(false);
			view.getpCita().setVisible(true);
			System.out.println("hh");
			cont++;
			String nombre1 = "sapoperro"+view.getpMujer().getCampoNombre().getText();
			String apellido3 = view.getpMujer().getCampoApellido1().getText();
			String apellido4 = view.getpMujer().getCampoApellido2().getText();
			String sexo1 = "H";
			String usuario1 = view.getpMujer().getCampoUsuario().getText();
			String contrasena1 = view.getpMujer().getCampoContrasena().getText();
			String correo1 = view.getpMujer().getCampoCorreo().getText();
			String dia1 = String.valueOf(view.getpMujer().getDia().getSelectedIndex());
			String mes1 = String.valueOf(view.getpMujer().getMes().getSelectedIndex());
			String anio1 = view.getpMujer().getCampoAnio().getText();
			String edad1 = view.getpMujer().getCampoEdad().getText();
			String ingreso1 = "0";

			String divorcio1 = "";
			if (view.getpMujer().getCheck1().isSelected()) {
				divorcio1 = "SI";
			} else if (view.getpMujer().getCheck2().isSelected()) {
				divorcio1 = "NO";
			}
			String like1 = String.valueOf(likeMujer);
			String likeot1 = String.valueOf(likeotorM);
			String matche1 = "0";
			String estado1 = "Disponible";
			try {

				bT.getMujerDAO().agregarUsuario(String.valueOf(cont), nombre1, apellido3, apellido4, sexo1, usuario1, contrasena1, correo1,
						dia1 + "/" + mes1 + "/" + anio1, edad1, ingreso1, divorcio1, like1, likeot1, matche1, estado1);


			} catch (Exception e2) {
				// JOptionPane.showMessageDialog(null, "Datos incorrectos");
			}

		}
		if (e.getActionCommand() == "DERECHA") {

			JOptionPane.showMessageDialog(null, "Me muevo a la derecha");

		}
		if (e.getActionCommand() == "IZQUIERDA") {
			JOptionPane.showMessageDialog(null, "Me muevo a la izquierda");
		}
		if (e.getActionCommand() == "CERRAR") {
			view.getpCita().setVisible(false);
			view.getpInicio().setVisible(true);
		}
		if (e.getActionCommand() == "EDITAR") {
			view.getpCita().setVisible(false);
			view.getpEditar().setVisible(true);
		}

		if (e.getActionCommand() == "LIKE")
			// likeotor++;
			JOptionPane.showMessageDialog(null, "ME GUSTAS PAPI O MAMI UWU");
	}
}
