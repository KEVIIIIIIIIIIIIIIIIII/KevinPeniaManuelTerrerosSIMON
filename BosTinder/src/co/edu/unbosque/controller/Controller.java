package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import co.edu.unbosque.model.BosTinder;
import co.edu.unbosque.view.View;

public class Controller implements ActionListener{
	
	private View view;
	private BosTinder bosTinder;
	
	public Controller() {
		view = new View();
		bosTinder = new BosTinder();
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

        view.getpHombre().getGuardar().addActionListener(this);
        view.getpMujer().getAceptar().addActionListener(this);

        view.getpCita().getDerecha().addActionListener(this);
        view.getpCita().getIzquierda().addActionListener(this);
        view.getpCita().getCerrarSesion().addActionListener(this);
        view.getpCita().getEditarPerfil().addActionListener(this);
        view.getpCita().getLike().addActionListener(this);
	}

	@Override
    public void actionPerformed(ActionEvent e) {
        String aux = e.getActionCommand();

        switch (aux) {
        case "INICIAR":

            view.getpInicio().setVisible(false);
            view.getpCita().setVisible(true);

            break;

        case "REGISTRARSE":
            view.getpInicio().setVisible(false);
            view.getpRegistrarse().setVisible(true);
            break;

        case "SALIR":
            view.setVisible(false);
            System.exit(0);

            break;

        case "HOMBRE":
            view.getpRegistrarse().setVisible(false);
            view.getpHombre().setVisible(true);
            break;

        case "MUJER":
            view.getpRegistrarse().setVisible(false);
            view.getpMujer().setVisible(true);
            break;

        case "GUARDAR":
        
            view.getpHombre().setVisible(false);
            view.getpCita().setVisible(true);
            bosTinder.gestionarArchivo();
            JOptionPane.showMessageDialog(null,  bosTinder.getHombreDAO().mostrar());
            
        	
            break;

        case "GUARDAR2":
            view.getpMujer().setVisible(false);
            view.getpCita().setVisible(true);

            break;

        case "DERECHA":
            JOptionPane.showMessageDialog(null, "Me muevo a la derecha");
            break;

        case "IZQUIERDA":
            JOptionPane.showMessageDialog(null, "Me muevo a la izquierda");
            break;

        case "CERRAR":
            view.getpCita().setVisible(false);
            view.getpInicio().setVisible(true);
            break;

        case"EDITAR":
            JOptionPane.showMessageDialog(null, "Editando.....");
            break;

        case"LIKE":
            JOptionPane.showMessageDialog(null, "ME GUSTAS PAPI O MAMI UWU");
            break;


        default:
            break;
        }

    }

}
