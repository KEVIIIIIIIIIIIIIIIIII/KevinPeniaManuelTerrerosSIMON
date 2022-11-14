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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PanelHombre extends JPanel{
	
	private static final String GUARDAR = "GUARDAR";
	
	private JLabel nombre;
	private JLabel alias;
	private JLabel edad;
	private JLabel correo;
	private JLabel estatura;
	private JLabel ingreso;
	private JLabel fondo;
	private JLabel apellido1;
	private JLabel apellido2;
	private JLabel textDia;
	private JLabel textMes;
	private JLabel contraseña;
	private JLabel confirmarContraseña;
	
	private JTextField campoNombre;
	private JTextField campoAlias;
	private JTextField campoEdad;
	private JTextField campoCorreo;
	private JTextField campoEstatura;
	private JTextField campoIngreso;
	private JTextField campoApellido1;
	private JTextField campoApellido2;
	
	private JButton guardar;
	private ImageIcon img1;
	
	private JLabel fecha;
	private JComboBox<Integer> dia;
	private JComboBox<Integer> mes;
	private JLabel año;
	private JTextField campoAño;
	private JPasswordField contra1;
	private JPasswordField confirmarContra1;
	
	public PanelHombre() {
		
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {
		
		nombre = new JLabel("Nombre:");
		nombre.setFont(new Font("", 20,20));
		nombre.setForeground(Color.BLACK);
		nombre.setBounds(100, 50, 200, 20);
		
		campoNombre = new JTextField();
		campoNombre.setBounds(197, 54, 200, 20);
		
		apellido1 = new JLabel("Apellido 1:");
		apellido1.setFont(new Font("", 20,20));
		apellido1.setForeground(Color.BLACK);
		apellido1.setBounds(100, 150, 200, 20);
		
		campoApellido1 = new JTextField();
		campoApellido1.setBounds(197, 154, 200, 20);
		
		apellido2 = new JLabel("Apellido 2:");
		apellido2.setFont(new Font("", 20,20));
		apellido2.setForeground(Color.BLACK);
		apellido2.setBounds(100, 250, 200, 20);
		
		campoApellido2 = new JTextField();
		campoApellido2.setBounds(197, 254, 200, 20);
		
		alias = new JLabel("Alias:");
		alias.setFont(new Font("", 20,20));
		alias.setForeground(Color.BLACK);
		alias.setBounds(100, 350, 200, 20);
		
		campoAlias = new JTextField();
		campoAlias.setBounds(197, 354, 200, 20);
		
		edad = new JLabel("Edad:");
		edad.setFont(new Font("", 20,20));
		edad.setForeground(Color.BLACK);
		edad.setBounds(500, 50, 200, 20);
		
		campoEdad = new JTextField();
		campoEdad.setBounds(600, 50, 200, 20);
		
		estatura = new JLabel("Estatura:");
		estatura.setFont(new Font("", 20,20));
		estatura.setForeground(Color.BLACK);
		estatura.setBounds(500, 150, 200, 20);
		
		campoEstatura = new JTextField();
		campoEstatura.setBounds(600, 150, 200, 20);
		
		correo = new JLabel("Correo:");
		correo.setFont(new Font("", 20,20));
		correo.setForeground(Color.BLACK);
		correo.setBounds(500, 250, 200, 20);
		
		campoCorreo = new JTextField();
		campoCorreo.setBounds(600, 254, 200, 20);
		
		
		ingreso = new JLabel("Ingresos:");
		ingreso.setFont(new Font("", 20,20));
		ingreso.setForeground(Color.BLACK);
		ingreso.setBounds(500, 350, 200, 20);
		
		campoIngreso = new JTextField();
		campoIngreso.setBounds(600, 354, 200, 20);
		
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
		
        guardar = new JButton();
        img1 = new ImageIcon("./img/guardar.png");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.setBounds(650, 570, 70, 70);
        guardar.setBorderPainted(false);
        guardar.setContentAreaFilled(false);
        guardar.setActionCommand(GUARDAR);
        guardar.setOpaque(false);
        guardar.setIcon(new ImageIcon(img1.getImage().getScaledInstance(guardar.getWidth(), guardar.getHeight(), Image.SCALE_SMOOTH)));
        
        fecha = new JLabel("<html>Fecha de nacimiento:<html>");
        fecha.setFont(new Font("", 20,20));
        fecha.setForeground(Color.BLACK);
        fecha.setBounds(50, 400, 110, 100);
        
        textDia = new JLabel("Dia");
        textDia.setFont(new Font("", 20,20));
        textDia.setForeground(Color.BLACK);
        textDia.setBounds(160, 448, 50, 30);
        
		dia = new JComboBox<Integer>();
        dia.addItem(1);
        dia.addItem(2);
        dia.addItem(3);
        dia.addItem(4);
        dia.addItem(5);
        dia.addItem(6);
        dia.addItem(7);
        dia.addItem(8);
        dia.addItem(9);
        dia.addItem(10);
        dia.addItem(11);
        dia.addItem(12);
        dia.addItem(13);
        dia.addItem(14);
        dia.addItem(15);
        dia.addItem(16);
        dia.addItem(17);
        dia.addItem(18);
        dia.addItem(19);
        dia.addItem(20);
        dia.addItem(21);
        dia.addItem(22);
        dia.addItem(23);
        dia.addItem(24);
        dia.addItem(25);
        dia.addItem(26);
        dia.addItem(27);
        dia.addItem(28);
        dia.addItem(29);
        dia.addItem(30);
        dia.addItem(31);
        
        dia.setBounds(195, 448, 50, 30);
        
        mes = new JComboBox<Integer>();
        mes.addItem(1);
        mes.addItem(2);
        mes.addItem(3);
        mes.addItem(4);
        mes.addItem(5);
        mes.addItem(6);
        mes.addItem(7);
        mes.addItem(8);
        mes.addItem(9);
        mes.addItem(10);
        mes.addItem(11);
        mes.addItem(12);
        
        mes.setBounds(300, 448, 50, 30);
        
        textMes = new JLabel("Mes");
        textMes.setFont(new Font("", 20,20));
        textMes.setForeground(Color.BLACK);
        textMes.setBounds(250, 448, 50, 30);
		
        año = new JLabel("Año");
        año.setFont(new Font("", 20,20));
        año.setForeground(Color.BLACK);
        año.setBounds(360, 448, 50, 30);
		
		campoAño = new JTextField();
		campoAño.setBounds(400, 448, 50, 30);
		
        contraseña = new JLabel("Contraseña:");
        contraseña.setFont(new Font("", 20,20));
        contraseña.setForeground(Color.BLACK);
        contraseña.setBounds(500, 440, 150, 30);
        
        contra1 = new JPasswordField();
        contra1.setBounds(613, 440, 200, 30);
        
        confirmarContraseña = new JLabel("Confirmar contraseña:");
        confirmarContraseña.setFont(new Font("", 20,20));
        confirmarContraseña.setForeground(Color.BLACK);
        confirmarContraseña.setBounds(500, 520, 200, 30);
        
        confirmarContra1 = new JPasswordField();
        confirmarContra1.setBounds(710, 520, 200, 30);
				
		add(nombre);
		add(campoNombre);
		add(apellido1);
		add(campoApellido1);
		add(apellido2);
		add(campoApellido2);
		add(alias);
		add(campoAlias);
		add(edad);
		add(campoEdad);
		add(estatura);
		add(campoEstatura);
		add(correo);
		add(campoCorreo);
		add(ingreso);
		add(campoIngreso);
		add(fecha);
		add(dia);
		add(textDia);
		add(mes);
		add(textMes);
		add(año);
		add(campoAño);
		add(contraseña);
		add(contra1);
		add(confirmarContraseña);
		add(confirmarContra1);
		add(guardar);
		add(fondo);
		
	}

	public JTextField getCampoNombre() {
		return campoNombre;
	}

	public void setCampoNombre(JTextField campoNombre) {
		this.campoNombre = campoNombre;
	}

	public JTextField getCampoAlias() {
		return campoAlias;
	}

	public void setCampoAlias(JTextField campoAlias) {
		this.campoAlias = campoAlias;
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

	public JTextField getCampoIngreso() {
		return campoIngreso;
	}

	public void setCampoIngreso(JTextField campoIngreso) {
		this.campoIngreso = campoIngreso;
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

	public JButton getGuardar() {
		return guardar;
	}

	public void setGuardar(JButton guardar) {
		this.guardar = guardar;
	}

	public JTextField getCampoAño() {
		return campoAño;
	}

	public void setCampoAño(JTextField campoAño) {
		this.campoAño = campoAño;
	}

	public JComboBox<Integer> getDia() {
		return dia;
	}

	public void setDia(JComboBox<Integer> dia) {
		this.dia = dia;
	}

	public JComboBox<Integer> getMes() {
		return mes;
	}

	public void setMes(JComboBox<Integer> mes) {
		this.mes = mes;
	}

	public JPasswordField getContra1() {
		return contra1;
	}

	public void setContra1(JPasswordField contra1) {
		this.contra1 = contra1;
	}

	public JPasswordField getConfirmarContra1() {
		return confirmarContra1;
	}

	public void setConfirmarContra1(JPasswordField confirmarContra1) {
		this.confirmarContra1 = confirmarContra1;
	}


}
