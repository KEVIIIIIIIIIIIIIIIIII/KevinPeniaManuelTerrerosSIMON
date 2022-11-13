package co.edu.unbosque.view;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelMujer extends JPanel{
	
	private static final String GUARDAR = "GUARDAR2";
	
	private JLabel nombre;
	private JLabel apellido1;
	private JLabel apellido2;
	private JLabel usuario;
	private JLabel contraseña;
	private JLabel nacimiento;
	private JLabel edad;
	private JLabel correo;
	private JLabel estatura;
	private JLabel divorcio;
	private JButton aceptar;
	private ImageIcon imagBoton1;
	private JRadioButton check1;
	private JRadioButton check2;
	private JRadioButton check3;
	private ButtonGroup grupo;
	
	
	private JLabel fondo;

	private JTextField campoNombre;
	private JTextField campoApellido1;
	private JTextField campoApellido2;
	private JTextField campoUsuario;
	private JTextField campoContraseña;
	private JTextField campoNacimiento;
	private JTextField campoEdad;
	private JTextField campoCorreo;
	private JTextField campoEstatura;
	
	
	public PanelMujer() {
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
		
		apellido1 = new JLabel("1 apellido");
		apellido1.setFont(new Font("", 20,20));
		apellido1.setForeground(Color.BLACK);
		apellido1.setBounds(100, 150, 200, 20);
		
		campoApellido1 = new JTextField();
		campoApellido1.setBounds(200, 150, 200, 20);
		
		apellido2 = new JLabel("2 apellido");
		apellido2.setFont(new Font("", 20,20));
		apellido2.setForeground(Color.BLACK);
		apellido2.setBounds(100, 250, 200, 20);
		
		campoApellido2 = new JTextField();
		campoApellido2.setBounds(200, 254, 200, 20);
		
		usuario = new JLabel("Usuario:");
		usuario.setFont(new Font("", 20,20));
		usuario.setForeground(Color.BLACK);
		usuario.setBounds(500, 50, 200, 20);
		
		campoUsuario = new JTextField();
		campoUsuario.setBounds(580, 54, 200, 20);
		
		contraseña = new JLabel("Contraseña:");
		contraseña.setFont(new Font("", 20,20));
		contraseña.setForeground(Color.BLACK);
		contraseña.setBounds(500, 150, 200, 20);
		
		campoContraseña = new JTextField();
		campoContraseña.setBounds(610, 152, 200, 20);
		
		nacimiento = new JLabel("Fecha de nacimiento:");
		nacimiento.setFont(new Font("", 20,20));
		nacimiento.setForeground(Color.BLACK);
		nacimiento.setBounds(500, 250, 200, 20);
		
		campoNacimiento = new JTextField();
		campoNacimiento.setBounds(690, 250, 200, 20);
		
		edad = new JLabel("Edad:");
		edad.setFont(new Font("", 20,20));
		edad.setForeground(Color.BLACK);
		edad.setBounds(100, 350, 200, 20);
		
		campoEdad = new JTextField();
		campoEdad.setBounds(180, 354, 200, 20);
		
		correo = new JLabel("Correo:");
		correo.setFont(new Font("", 20,20));
		correo.setForeground(Color.BLACK);
		correo.setBounds(100, 450, 200, 20);
		
		campoCorreo = new JTextField();
		campoCorreo.setBounds(180, 454, 200, 20);
		
		estatura = new JLabel("Estatura:");
		estatura.setFont(new Font("", 20,20));
		estatura.setForeground(Color.BLACK);
		estatura.setBounds(100, 550, 200, 20);
		
		campoEstatura = new JTextField();
		campoEstatura.setBounds(180, 554, 200, 20);
		
		divorcio=new JLabel("Divorcio");
		divorcio.setFont(new Font("", 20,20));
		divorcio.setForeground(Color.BLACK);
		divorcio.setBounds(500, 350, 200, 20);
		
		
		
		
		check1=new JRadioButton();
		check1.setText("SI");
		check1.setOpaque(false);
		check1.setBounds(580, 320, 40, 80);
		
		
		check2 = new JRadioButton();
		check2.setOpaque(false);
		check2.setText("NO");
		check2.setBounds(620, 320, 50, 80);
		
		check3 = new JRadioButton();
		check3.setOpaque(false);
		check3.setText("NO APLICA");
		check3.setBounds(680, 320, 100, 80);
	
		grupo=new ButtonGroup();
		
		grupo.add(check1);
		grupo.add(check2);
		grupo.add(check3);
		
		aceptar= new JButton();
        imagBoton1 = new  ImageIcon ( "./img/guardar.png" );
        aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptar.setBounds(600, 500, 100, 100);
        aceptar.setBorderPainted(false);
        aceptar.setContentAreaFilled(false);
        aceptar.setActionCommand(GUARDAR);
        aceptar.setOpaque(false);
        aceptar.setIcon(new ImageIcon(imagBoton1.getImage().getScaledInstance(aceptar.getWidth(), aceptar.getHeight(), Image.SCALE_SMOOTH)));
        
        
		fondo = new JLabel();
		fondo.setBounds(0, 0, 1000, 700);
		fondo.setOpaque(true);
		 BufferedImage bi1 = null;
	        try {
	            bi1 = ImageIO.read(new File("./img/fondoMujer.jpeg"));
	        } catch (IOException e1) {
	            e1.printStackTrace();
	        }
	        Image redimensionado1 = bi1.getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_SMOOTH);

	        fondo.setIcon(new ImageIcon(redimensionado1));
		
	        
		
		add(nombre);
		add(campoNombre);
		add(apellido1);
		add(campoApellido1);
		add(apellido2);
		add(campoApellido2);
		add(usuario);
		add(campoUsuario);
		add(contraseña);
		add(campoContraseña);
		add(edad);
		add(campoEdad);
		add(nacimiento);
		add(campoNacimiento);
		add(correo);
		add(campoCorreo);
		add(estatura);
		add(campoEstatura);
		add(divorcio);
		add(check1);
		add(check2);
		add(check3);
		add(aceptar);
		add(fondo);
		
	
		
		
	}

	public JButton getAceptar() {
		return aceptar;
	}

	public void setAceptar(JButton aceptar) {
		this.aceptar = aceptar;
	}

	public JRadioButton getCheck1() {
		return check1;
	}

	public void setCheck1(JRadioButton check1) {
		this.check1 = check1;
	}

	public JRadioButton getCheck2() {
		return check2;
	}

	public void setCheck2(JRadioButton check2) {
		this.check2 = check2;
	}

	public JRadioButton getCheck3() {
		return check3;
	}

	public void setCheck3(JRadioButton check3) {
		this.check3 = check3;
	}

	public JTextField getCampoNombre() {
		return campoNombre;
	}

	public void setCampoNombre(JTextField campoNombre) {
		this.campoNombre = campoNombre;
	}

	public JTextField getCampoApellido1() {
		return campoApellido1;
	}

	public void setCampoApellido1(JTextField campoApellido1) {
		this.campoApellido1 = campoApellido1;
	}

	public JTextField getCampoApellido2() {
		return campoApellido2;
	}

	public void setCampoApellido2(JTextField campoApellido2) {
		this.campoApellido2 = campoApellido2;
	}

	public JTextField getCampoUsuario() {
		return campoUsuario;
	}

	public void setCampoUsuario(JTextField campoUsuario) {
		this.campoUsuario = campoUsuario;
	}

	public JTextField getCampoContraseña() {
		return campoContraseña;
	}

	public void setCampoContraseña(JTextField campoContraseña) {
		this.campoContraseña = campoContraseña;
	}

	public JTextField getCampoNacimiento() {
		return campoNacimiento;
	}

	public void setCampoNacimiento(JTextField campoNacimiento) {
		this.campoNacimiento = campoNacimiento;
	}

	public JTextField getCampoEdad() {
		return campoEdad;
	}

	public void setCampoEdad(JTextField campoEdad) {
		this.campoEdad = campoEdad;
	}

	public JTextField getCampoCorreo() {
		return campoCorreo;
	}

	public void setCampoCorreo(JTextField campoCorreo) {
		this.campoCorreo = campoCorreo;
	}

	public JTextField getCampoEstatura() {
		return campoEstatura;
	}

	public void setCampoEstatura(JTextField campoEstatura) {
		this.campoEstatura = campoEstatura;
	}

}
