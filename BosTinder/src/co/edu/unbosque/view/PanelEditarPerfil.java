package co.edu.unbosque.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelEditarPerfil extends JPanel{
	
	
	private JLabel nombre;
	private JLabel apellido1;
	private JLabel apellido2;
	private JLabel alias;
	private JLabel estatura;
	private JLabel ingreso;
	private JLabel estado;
	private JLabel correo;
	private JLabel contrasenia;
	
	private JLabel tit1;
	private JLabel tit2;
	
	private JLabel fondo;
	
	private JTextField campoNombre;
	private JTextField campoApellido1;
	private JTextField campoApellido2;
	private JTextField campoAlias;
	private JTextField campoEstatura;
	private JTextField campoIngreso;
	private JTextField campoEstado;
	private JTextField campoCorreo;
	private JTextField campoContrasenia;
	
	private JTextField campoNombreNuevo;
	private JTextField campoApellido1Nuevo;
	private JTextField campoApellido2Nuevo;
	private JTextField campoAliasNuevo;
	private JTextField campoEstaturaNuevo;
	private JTextField campoIngresoNuevo;
	private JTextField campoEstadoNuevo;
	private JTextField campoCorreoNuevo;
	private JTextField campoContraseniaNuevo;
	
	
	public PanelEditarPerfil() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		
		tit1 = new JLabel("ANTERIOR");
		tit1.setFont(new Font("",Font.BOLD,30));
		tit1.setForeground(Color.red);
		tit1.setBounds(350,50,200,40);
		
		tit2 = new JLabel("NUEVO");
		tit2.setFont(new Font("",Font.BOLD,30));
		tit2.setForeground(Color.red);
		tit2.setBounds(650,50,200,40);
		
		//----------------------------------------
		
		nombre = new JLabel("Nombre:");
		nombre.setFont(new Font("",Font.BOLD,30));
		nombre.setForeground(Color.red);
		nombre.setBounds(50,100,200,40);
		
		apellido1 = new JLabel("Apellido 1:");
		apellido1.setFont(new Font("",Font.BOLD,30));
		apellido1.setForeground(Color.red);
		apellido1.setBounds(50,150,200,40);
		
		apellido2 = new JLabel("Apellido 2:");
		apellido2.setFont(new Font("",Font.BOLD,30));
		apellido2.setForeground(Color.red);
		apellido2.setBounds(50,200,200,40);
		
		alias = new JLabel("Alias:");
		alias.setFont(new Font("",Font.BOLD,30));
		alias.setForeground(Color.red);
		alias.setBounds(50,250,200,40);
		
		estatura = new JLabel("Estatura:");
		estatura.setFont(new Font("",Font.BOLD,30));
		estatura.setForeground(Color.red);
		estatura.setBounds(50,300,200,40);
		
		ingreso = new JLabel("Ingreso:");
		ingreso.setFont(new Font("",Font.BOLD,30));
		ingreso.setForeground(Color.red);
		ingreso.setBounds(50,350,200,40);
		
		estado = new JLabel("Estado:");
		estado.setFont(new Font("",Font.BOLD,30));
		estado.setForeground(Color.red);
		estado.setBounds(50,400,200,40);
		
		correo = new JLabel("Correo:");
		correo.setFont(new Font("",Font.BOLD,30));
		correo.setForeground(Color.red);
		correo.setBounds(50,450,200,40);
		
		contrasenia = new JLabel("Contrasenia:");
		contrasenia.setFont(new Font("",Font.BOLD,30));
		contrasenia.setForeground(Color.red);
		contrasenia.setBounds(50,500,200,40);
		
		//----------------------------------------------------
		
		campoNombre = new JTextField("Nombre:");
		campoNombre.setFont(new Font("",Font.BOLD,30));
		campoNombre.setEditable(false);
		campoNombre.setBounds(350,100,200,40);
		
		campoApellido1 = new JTextField("Apellido 1:");
		campoApellido1.setFont(new Font("",Font.BOLD,30));
		campoApellido1.setEditable(false);
		campoApellido1.setBounds(350,150,200,40);
		
		campoApellido2 = new JTextField("Apellido 2:");
		campoApellido2.setFont(new Font("",Font.BOLD,30));
		campoApellido2.setEditable(false);
		campoApellido2.setBounds(350,200,200,40);
		
		campoAlias = new JTextField("Alias:");
		campoAlias.setFont(new Font("",Font.BOLD,30));
		campoAlias.setEditable(false);
		campoAlias.setBounds(350,250,200,40);
		
		campoEstatura = new JTextField("Estatura:");
		campoEstatura.setFont(new Font("",Font.BOLD,30));
		campoEstatura.setEditable(false);
		campoEstatura.setBounds(350,300,200,40);
		
		campoIngreso = new JTextField("Ingreso:");
		campoIngreso.setFont(new Font("",Font.BOLD,30));
		campoIngreso.setEditable(false);
		campoIngreso.setBounds(350,350,200,40);
		
		campoEstado = new JTextField("Estado:");
		campoEstado.setFont(new Font("",Font.BOLD,30));
		campoEstado.setEditable(false);
		campoEstado.setBounds(350,400,200,40);
		
		campoCorreo = new JTextField("Correo:");
		campoCorreo.setFont(new Font("",Font.BOLD,30));
		campoCorreo.setEditable(false);
		campoCorreo.setBounds(350,450,200,40);
		
		campoContrasenia = new JTextField("Contrasenia:");
		campoContrasenia.setFont(new Font("",Font.BOLD,30));
		campoContrasenia.setEditable(false);
		campoContrasenia.setBounds(350,500,200,40);
		
		//--------------------------------------------------
		
		campoNombreNuevo = new JTextField("Nombre:");
		campoNombreNuevo.setFont(new Font("",Font.BOLD,30));
		campoNombreNuevo.setBounds(650,100,200,40);
		
		campoApellido1Nuevo = new JTextField("Apellido 1:");
		campoApellido1Nuevo.setFont(new Font("",Font.BOLD,30));
		campoApellido1Nuevo.setBounds(650,150,200,40);
		
		campoApellido2Nuevo = new JTextField("Apellido 2:");
		campoApellido2Nuevo.setFont(new Font("",Font.BOLD,30));
		campoApellido2Nuevo.setBounds(650,200,200,40);
		
		campoAliasNuevo = new JTextField("Alias:");
		campoAliasNuevo.setFont(new Font("",Font.BOLD,30));
		campoAliasNuevo.setBounds(650,250,200,40);
		
		campoEstaturaNuevo = new JTextField("Estatura:");
		campoEstaturaNuevo.setFont(new Font("",Font.BOLD,30));
		campoEstaturaNuevo.setBounds(650,300,200,40);
		
		campoIngresoNuevo = new JTextField("Ingreso:");
		campoIngresoNuevo.setFont(new Font("",Font.BOLD,30));
		campoIngresoNuevo.setBounds(650,350,200,40);
		
		campoEstadoNuevo = new JTextField("Estado:");
		campoEstadoNuevo.setFont(new Font("",Font.BOLD,30));
		campoEstadoNuevo.setBounds(650,400,200,40);
		
		campoCorreoNuevo = new JTextField("Correo:");
		campoCorreoNuevo.setFont(new Font("",Font.BOLD,30));
		campoCorreoNuevo.setBounds(650,450,200,40);
		
		campoContraseniaNuevo = new JTextField("Contrasenia:");
		campoContraseniaNuevo.setFont(new Font("",Font.BOLD,30));
		campoContraseniaNuevo.setBounds(650,500,200,40);
		
		//-------------------------------------------
		
		fondo = new JLabel();
		fondo.setBounds(0, 0, 1000, 700);
		fondo.setOpaque(true);
		 BufferedImage bi1 = null;
	        try {
	            bi1 = ImageIO.read(new File("./img/fondo6.jpg"));
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	        Image redimensionado1 = bi1.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);

	        fondo.setIcon(new ImageIcon(redimensionado1));
		
		add(nombre);
		add(apellido1);
		add(apellido2);
		add(alias);
		add(estatura);
		add(ingreso);
		add(estado);
		add(correo);
		add(contrasenia);
		
		add(campoNombre);
		add(campoApellido1);
		add(campoApellido2);
		add(campoAlias);
		add(campoEstatura);
		add(campoIngreso);
		add(campoEstado);
		add(campoCorreo);
		add(campoContrasenia);
		
		add(campoNombreNuevo);
		add(campoApellido1Nuevo);
		add(campoApellido2Nuevo);
		add(campoAliasNuevo);
		add(campoEstaturaNuevo);
		add(campoIngresoNuevo);
		add(campoEstadoNuevo);
		add(campoCorreoNuevo);
		add(campoContraseniaNuevo);
		
		add(tit1);
		add(tit2);
		
		add(fondo);
		
	}


}
