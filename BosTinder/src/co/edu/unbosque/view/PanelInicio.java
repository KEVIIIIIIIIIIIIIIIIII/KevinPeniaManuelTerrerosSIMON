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
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelInicio extends JPanel{
	
	private static final String INICIAR = "INICIAR";
    private static final String REGISTRARSE = "REGISTRARSE";
    private static final String SALIR = "SALIR";
	
	private JLabel fondo;
	private JLabel titulo;
	private JLabel usuario;
	private JLabel contraseña;
	
	private JTextField campo1;
	private JPasswordField campo2;
	
	private JButton iniciar;
	private JButton registrarse;
	private JButton salir;
	
	private ImageIcon icon2;
	private ImageIcon icon3;
	
	public PanelInicio() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}

	private void inicializarComponentes() {
		
		titulo = new JLabel("MEDIA NARANJA");
		titulo.setFont(new Font("", 70,50));
		titulo.setForeground(Color.BLACK);
		titulo.setBounds(300, 50, 500, 50);
		
		
		usuario = new JLabel("USUARIO:");
		usuario.setFont(new Font("", 20,20));
		usuario.setForeground(Color.BLACK);
		usuario.setBounds(200, 200, 100, 30);
		
		campo1 = new JTextField("DIGITE SU USUARIO AQUI!!");
		campo1.setFont(new Font("", 20,20));
		campo1.setBounds(310, 200, 450, 30);
		
		contraseña = new JLabel("CONTRASEÑA:");
		contraseña.setFont(new Font("", 20,20));
		contraseña.setForeground(Color.BLACK);
		contraseña.setBounds(200, 250, 150, 30);
		
		campo2 = new JPasswordField();
		campo2.setFont(new Font("", 20,20));
		campo2.setBounds(350, 250, 410, 30);
		
		iniciar = new JButton("INICIAR SESION");
		iniciar.setFont(new Font("", 20,20));
		iniciar.setActionCommand(INICIAR);
		iniciar.setBounds(270, 350, 200, 30);
		
		registrarse = new JButton("REGISTRARSE");
		registrarse.setFont(new Font("", 20,20));
		registrarse.setBounds(500, 350, 200, 30);
		registrarse.setActionCommand(REGISTRARSE);
		
		salir = new JButton("SALIR");
		salir.setActionCommand(SALIR);
		salir.setFont(new Font("", 20,20));
		salir.setBounds(400, 500, 100, 30);
		
		fondo = new JLabel();
		fondo.setBounds(0, 0, 1000, 700);
		fondo.setOpaque(true);
		
		 BufferedImage bi1 = null;
	        try {
	            bi1 = ImageIO.read(new File("./img/fondo1.jpg"));
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	        Image redimensionado1 = bi1.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);

	        fondo.setIcon(new ImageIcon(redimensionado1));
		
		
		add(titulo);
		add(usuario);
		add(campo1);
		add(contraseña);
		add(campo2);
		add(iniciar);
		add(registrarse);
		add(salir);
		add(fondo);
	}
	
	public JLabel getContraseña() {
        return contraseña;
    }

    public void setContraseña(JLabel contraseña) {
        this.contraseña = contraseña;
    }

    public JTextField getCampo1() {
        return campo1;
    }

    public void setCampo1(JTextField campo1) {
        this.campo1 = campo1;
    }

    public JPasswordField getCampo2() {
        return campo2;
    }

    public void setCampo2(JPasswordField campo2) {
        this.campo2 = campo2;
    }

    public JButton getIniciar() {
        return iniciar;
    }

    public void setIniciar(JButton iniciar) {
        this.iniciar = iniciar;
    }

    public JButton getRegistrarse() {
        return registrarse;
    }

    public void setRegistrarse(JButton registrarse) {
        this.registrarse = registrarse;
    }

    public JButton getSalir() {
        return salir;
    }

    public void setSalir(JButton salir) {
        this.salir = salir;
    }
}
