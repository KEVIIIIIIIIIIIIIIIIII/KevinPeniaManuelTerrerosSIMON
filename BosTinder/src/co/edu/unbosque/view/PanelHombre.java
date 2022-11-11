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
import javax.swing.JTextField;

public class PanelHombre extends JPanel{
	
	private JLabel nombre;
	private JLabel alias;
	private JLabel edad;
	private JLabel correo;
	private JLabel estatura;
	private JLabel ingreso;
	private JLabel fondo;
	
	private JTextField campoNombre;
	private JTextField campoAlias;
	private JTextField campoEdad;
	private JTextField campoCorreo;
	private JTextField campoEstatura;
	private JTextField campoIngresos;
	
	private JButton continuar;
	private ImageIcon img1;
	
	public PanelHombre() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(true);
	}

	public void inicializarComponentes() {
		
		nombre = new JLabel("Nombre:");
		nombre.setFont(new Font("", 20,20));
		nombre.setForeground(Color.BLACK);
		nombre.setBounds(100, 50, 200, 20);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(180, 54, 200, 20);
		
		alias = new JLabel("Alias:");
		alias.setFont(new Font("", 20,20));
		alias.setForeground(Color.BLACK);
		alias.setBounds(100, 150, 200, 20);
		
		campoAlias = new JTextField();
		campoAlias.setBounds(180, 154, 200, 20);
		
		edad = new JLabel("Edad:");
		edad.setFont(new Font("", 20,20));
		edad.setForeground(Color.BLACK);
		edad.setBounds(100, 250, 200, 20);
		
		campoEdad = new JTextField();
		campoEdad.setBounds(180, 254, 200, 20);
		
		correo = new JLabel("Correo:");
		correo.setFont(new Font("", 20,20));
		correo.setForeground(Color.BLACK);
		correo.setBounds(100, 350, 200, 20);
		
		campoCorreo = new JTextField();
		campoCorreo.setBounds(180, 354, 200, 20);
		
		estatura = new JLabel("Estatura:");
		estatura.setFont(new Font("", 20,20));
		estatura.setForeground(Color.BLACK);
		estatura.setBounds(100, 450, 200, 20);
		
		campoEstatura = new JTextField();
		campoEstatura.setBounds(180, 454, 200, 20);
		
		ingreso = new JLabel("Ingresos:");
		ingreso.setFont(new Font("", 20,20));
		ingreso.setForeground(Color.BLACK);
		ingreso.setBounds(100, 550, 200, 20);
		
		campoIngresos = new JTextField();
		campoIngresos.setBounds(180, 554, 200, 20);
		
		fondo = new JLabel();
		fondo.setBounds(0, 0, 1000, 700);
		fondo.setOpaque(true);
		 BufferedImage bi1 = null;
	        try {
	            bi1 = ImageIO.read(new File("./img/fondo3.jpg"));
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	        Image redimensionado1 = bi1.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);

	        fondo.setIcon(new ImageIcon(redimensionado1));
		
        continuar = new JButton();
        img1 = new ImageIcon("./img/guardar.png");
        continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        continuar.setBounds(600, 400, 200, 200);
        continuar.setBorderPainted(false);
        continuar.setContentAreaFilled(false);
        continuar.setOpaque(false);
        continuar.setIcon(new ImageIcon(img1.getImage().getScaledInstance(continuar.getWidth(), continuar.getHeight(), Image.SCALE_SMOOTH)));
				
		add(nombre);
		add(campoNombre);
		add(alias);
		add(campoAlias);
		add(edad);
		add(campoEdad);
		add(correo);
		add(campoCorreo);
		add(estatura);
		add(campoEstatura);
		add(continuar);
		add(fondo);
		
	}

}
