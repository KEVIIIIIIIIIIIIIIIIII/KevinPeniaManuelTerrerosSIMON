package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class PanelCita extends JPanel{
	
	private JLabel imagenCentro;
	private JLabel fondo;
	private JTextArea informacion;
	private JLabel cantidadLike;
	private JButton izquierda;
	private JButton derecha;
	private JButton like;
	private JButton cerrarSesion;
	private JButton editarPerfil;
	private ImageIcon imgBoton1;
	private ImageIcon imgBoton2;
	private ImageIcon imgBoton3;
	private ImageIcon imgBoton4;
	private ImageIcon imgBoton5;
	
	public PanelCita() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
		
	}

	public void inicializarComponentes() {
		
        cantidadLike = new JLabel("510648");
        cantidadLike.setFont(new Font("",Font.BOLD,30));
        cantidadLike.setForeground(Color.BLACK);
        cantidadLike.setBounds(720, 359, 200, 40);
	        
        informacion = new JTextArea();
        informacion.setBounds(150, 430, 670, 200);
        informacion.setEditable(false);
        
        
        derecha = new JButton();
        imgBoton1 = new ImageIcon("./img/adelante.png");
        derecha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        derecha.setBounds(840, 200, 100, 100);
        derecha.setBorderPainted(false);
        derecha.setContentAreaFilled(false);
        derecha.setOpaque(false);
        derecha.setIcon(new ImageIcon(imgBoton1.getImage().getScaledInstance(derecha.getWidth(), derecha.getHeight(), Image.SCALE_SMOOTH)));
        
        izquierda = new JButton();
        imgBoton2 = new ImageIcon("./img/izquierda.png");
        izquierda.setBounds(30, 200, 100, 100);
        izquierda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        izquierda.setBorderPainted(false);
        izquierda.setContentAreaFilled(false);
        izquierda.setOpaque(false);
        izquierda.setIcon(new ImageIcon(imgBoton2.getImage().getScaledInstance(izquierda.getWidth(), izquierda.getHeight(), Image.SCALE_SMOOTH)));
        

        
		imagenCentro = new JLabel();
		imagenCentro.setBounds(150, 50, 670, 350);
		
		 BufferedImage bi1 = null;
	        try {
	            bi1 = ImageIO.read(new File("./img/prueba.jpg"));
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	        Image redimensionado1 = bi1.getScaledInstance(imagenCentro.getWidth(), imagenCentro.getHeight(), Image.SCALE_SMOOTH);
	
	        imagenCentro.setIcon(new ImageIcon(redimensionado1));
	        
	        
        like = new JButton();
        imgBoton3 = new ImageIcon("./img/corazon.png");
        like.setBounds(675, 360, 40, 40);
        like.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        like.setBorderPainted(false);
        like.setContentAreaFilled(false);
        like.setOpaque(false);
        like.setIcon(new ImageIcon(imgBoton3.getImage().getScaledInstance(like.getWidth(), like.getHeight(), Image.SCALE_SMOOTH)));
        
        cerrarSesion = new JButton();
        imgBoton4 = new ImageIcon("./img/cerrar-sesion.png");
        cerrarSesion.setBounds(930, 20, 40, 40);
        cerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarSesion.setBorderPainted(false);
        cerrarSesion.setContentAreaFilled(false);
        cerrarSesion.setOpaque(false);
        cerrarSesion.setIcon(new ImageIcon(imgBoton4.getImage().getScaledInstance(cerrarSesion.getWidth(), cerrarSesion.getHeight(), Image.SCALE_SMOOTH)));
        
        editarPerfil = new JButton();
        imgBoton5 = new ImageIcon("./img/escritura.png");
        editarPerfil.setBounds(930, 70, 40, 40);
        editarPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editarPerfil.setBorderPainted(false);
        editarPerfil.setContentAreaFilled(false);
        editarPerfil.setOpaque(false);
        editarPerfil.setIcon(new ImageIcon(imgBoton5.getImage().getScaledInstance(editarPerfil.getWidth(), editarPerfil.getHeight(), Image.SCALE_SMOOTH)));
        
        
		fondo = new JLabel();
		fondo.setBounds(0, 0, 1000, 700);
		fondo.setOpaque(true);
		
		 BufferedImage bi3 = null;
	        try {
	            bi3 = ImageIO.read(new File("./img/fondo5.jpg"));
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	        Image redimensionado3 = bi3.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);

	        fondo.setIcon(new ImageIcon(redimensionado3));
        
        
        
        add(like);
	    add(cantidadLike);
	    add(imagenCentro);
	    add(informacion);
	    add(derecha);
	    add(izquierda);
	    add(cerrarSesion);
	    add(editarPerfil);
	    add(fondo);
		
	}

}
