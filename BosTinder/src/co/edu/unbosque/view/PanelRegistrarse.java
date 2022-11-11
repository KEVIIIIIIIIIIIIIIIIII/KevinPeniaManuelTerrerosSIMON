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

public class PanelRegistrarse extends JPanel{
	
	private JLabel titulo;
	private JButton hombre;
	private JButton mujer;
	private JLabel fondo;
	private JButton otro;
	
	public PanelRegistrarse() {
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {

		titulo = new JLabel("SELECCIONAR GENERO");
		titulo.setFont(new Font("",Font.BOLD,30));
		titulo.setForeground(Color.BLACK);
		titulo.setBounds(300, 40, 400, 40);
		
		fondo = new JLabel();
		fondo.setBounds(0, 0, 1000, 700);
		fondo.setOpaque(true);
		
		 BufferedImage bi1 = null;
	        try {
	            bi1 = ImageIO.read(new File("./img/fondo2.jpg"));
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	        Image redimensionado1 = bi1.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);

	        fondo.setIcon(new ImageIcon(redimensionado1));
	        
	        
	    hombre = new JButton();
	    hombre.setBounds(100, 150, 250, 400);
	    
		 BufferedImage bi2 = null;
	        try {
	            bi2 = ImageIO.read(new File("./img/hombre.jpg"));
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	        Image redimensionado2 = bi2.getScaledInstance(hombre.getWidth(), hombre.getHeight(), Image.SCALE_SMOOTH);

	        hombre.setIcon(new ImageIcon(redimensionado2));
	        
	     mujer = new JButton();
	     mujer.setBounds(630, 150, 250, 400);
	    
		 BufferedImage bi3 = null;
	        try {
	            bi3 = ImageIO.read(new File("./img/mujer.jpg"));
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	        Image redimensionado3 = bi3.getScaledInstance(mujer.getWidth(), mujer.getHeight(), Image.SCALE_SMOOTH);

	        mujer.setIcon(new ImageIcon(redimensionado3));
	        
	        
	     otro = new JButton();
	     otro.setBounds(880, 570, 100, 80);
	    
		 BufferedImage bi4 = null;
	        try {
	            bi4 = ImageIO.read(new File("./img/otro1.png"));
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	        Image redimensionado4 = bi4.getScaledInstance(otro.getWidth(), otro.getHeight(), Image.SCALE_SMOOTH);

	        otro.setIcon(new ImageIcon(redimensionado4));
		
		add(titulo);
		add(hombre);
		add(mujer);
		add(otro);
		add(fondo);
		
	}

}
