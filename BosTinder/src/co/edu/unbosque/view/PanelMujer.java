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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelMujer extends JPanel {

	private static final String GUARDAR2 = "GUARDAR2";

	private JLabel nombre;
	private JLabel apellido1;
	private JLabel apellido2;

	private JLabel textDia;
	private JLabel textMes;
	private JLabel anio;

	private JLabel usuario;
	private JLabel contrasena;
	private JLabel nacimiento;
	private JLabel edad;
	private JLabel correo;
	private JLabel estatura;
	private JLabel divorcio;
	private JButton aceptar;
	private ImageIcon imagBoton1;
	private JRadioButton check1;
	private JRadioButton check2;
	private ButtonGroup grupo;

	private JLabel fondo;
	private JComboBox<Integer> dia;
	private JComboBox<Integer> mes;
	private JTextField campoNombre;
	private JTextField campoApellido1;
	private JTextField campoApellido2;
	private JTextField campoUsuario;

	private JTextField campoAnio;
	private JTextField campoContrasena;
	
	private JTextField campoEdad;
	private JTextField campoCorreo;
	private JTextField campoEstatura;

	public PanelMujer() {
		setLayout(null);
		inicializarComponentes();
		setVisible(false);
	}

	public void inicializarComponentes() {

		nombre = new JLabel("Nombre:");
		nombre.setFont(new Font("", 20, 20));
		nombre.setForeground(Color.BLACK);
		nombre.setBounds(100, 50, 200, 20);

		campoNombre = new JTextField();
		campoNombre.setBounds(180, 54, 200, 20);

		apellido1 = new JLabel("1 apellido");
		apellido1.setFont(new Font("", 20, 20));
		apellido1.setForeground(Color.BLACK);
		apellido1.setBounds(100, 150, 200, 20);

		campoApellido1 = new JTextField();
		campoApellido1.setBounds(200, 150, 200, 20);

		apellido2 = new JLabel("2 apellido");
		apellido2.setFont(new Font("", 20, 20));
		apellido2.setForeground(Color.BLACK);
		apellido2.setBounds(100, 250, 200, 20);

		campoApellido2 = new JTextField();
		campoApellido2.setBounds(200, 254, 200, 20);

		usuario = new JLabel("Usuario:");
		usuario.setFont(new Font("", 20, 20));
		usuario.setForeground(Color.BLACK);
		usuario.setBounds(500, 50, 200, 20);

		campoUsuario = new JTextField();
		campoUsuario.setBounds(580, 54, 200, 20);

		contrasena = new JLabel("Contraseña:");
		contrasena.setFont(new Font("", 20, 20));
		contrasena.setForeground(Color.BLACK);
		contrasena.setBounds(500, 150, 200, 20);

		campoContrasena = new JTextField();
		campoContrasena.setBounds(610, 152, 200, 20);

		nacimiento = new JLabel("Fecha de nacimiento:");
		nacimiento.setFont(new Font("", 20, 20));
		nacimiento.setForeground(Color.BLACK);
		nacimiento.setBounds(500, 250, 200, 20);

		

		edad = new JLabel("Edad:");
		edad.setFont(new Font("", 20, 20));
		edad.setForeground(Color.BLACK);
		edad.setBounds(100, 350, 200, 20);

		campoEdad = new JTextField();
		campoEdad.setBounds(180, 354, 200, 20);

		correo = new JLabel("Correo:");
		correo.setFont(new Font("", 20, 20));
		correo.setForeground(Color.BLACK);
		correo.setBounds(100, 450, 200, 20);

		campoCorreo = new JTextField();
		campoCorreo.setBounds(180, 454, 200, 20);

		estatura = new JLabel("Estatura:");
		estatura.setFont(new Font("", 20, 20));
		estatura.setForeground(Color.BLACK);
		estatura.setBounds(100, 550, 200, 20);

		campoEstatura = new JTextField();
		campoEstatura.setBounds(180, 554, 200, 20);

		divorcio = new JLabel("Divorcio");
		divorcio.setFont(new Font("", 20, 20));
		divorcio.setForeground(Color.BLACK);
		divorcio.setBounds(500, 350, 200, 20);

		check1 = new JRadioButton();
		check1.setText("SI");
		check1.setOpaque(false);
		check1.setBounds(580, 320, 40, 80);

		check2 = new JRadioButton();
		check2.setOpaque(false);
		check2.setText("NO");
		check2.setBounds(620, 320, 50, 80);

		grupo = new ButtonGroup();
		grupo.add(check1);
		grupo.add(check2);

		textDia = new JLabel("Dia");
		textDia.setFont(new Font("", 20, 20));
		textDia.setForeground(Color.BLACK);
		textDia.setBounds(550, 300, 50, 30);

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

		dia.setBounds(585, 300, 50, 30);

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

		mes.setBounds(695, 300, 50, 30);

		textMes = new JLabel("Mes");
		textMes.setFont(new Font("", 20, 20));
		textMes.setForeground(Color.BLACK);
		textMes.setBounds(650, 300, 50, 30);

		anio = new JLabel("Año");
		anio.setFont(new Font("", 20, 20));
		anio.setForeground(Color.BLACK);
		anio.setBounds(760, 300, 50, 30);

		campoAnio = new JTextField();
		campoAnio.setBounds(800, 300, 50, 30);

		aceptar = new JButton();
		imagBoton1 = new ImageIcon("./img/guardar.png");
		aceptar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		aceptar.setBounds(600, 500, 100, 100);
		aceptar.setBorderPainted(false);
		aceptar.setContentAreaFilled(false);
		aceptar.setActionCommand(GUARDAR2);
		aceptar.setOpaque(false);
		aceptar.setIcon(new ImageIcon(
				imagBoton1.getImage().getScaledInstance(aceptar.getWidth(), aceptar.getHeight(), Image.SCALE_SMOOTH)));

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
		add(contrasena);
		add(campoContrasena);
		add(edad);
		add(campoEdad);
		add(nacimiento);
		
		add(correo);
		add(campoCorreo);
		add(estatura);
		add(campoEstatura);
		add(divorcio);
		add(check1);
		add(check2);
		add(campoAnio);
		add(dia);
		add(mes);
		add(anio);
		add(textMes);
		add(textDia);

		add(aceptar);
		add(fondo);
		

	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getApellido1() {
		return apellido1;
	}

	public void setApellido1(JLabel apellido1) {
		this.apellido1 = apellido1;
	}

	public JLabel getApellido2() {
		return apellido2;
	}

	public void setApellido2(JLabel apellido2) {
		this.apellido2 = apellido2;
	}

	public JLabel getTextDia() {
		return textDia;
	}

	public void setTextDia(JLabel textDia) {
		this.textDia = textDia;
	}

	public JLabel getTextMes() {
		return textMes;
	}

	public void setTextMes(JLabel textMes) {
		this.textMes = textMes;
	}

	public JLabel getAnio() {
		return anio;
	}

	public void setAnio(JLabel anio) {
		this.anio = anio;
	}

	public JLabel getUsuario() {
		return usuario;
	}

	public void setUsuario(JLabel usuario) {
		this.usuario = usuario;
	}

	public JLabel getContrasena() {
		return contrasena;
	}

	public void setContrasena(JLabel contrasena) {
		this.contrasena = contrasena;
	}

	public JLabel getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(JLabel nacimiento) {
		this.nacimiento = nacimiento;
	}

	public JLabel getEdad() {
		return edad;
	}

	public void setEdad(JLabel edad) {
		this.edad = edad;
	}

	public JLabel getCorreo() {
		return correo;
	}

	public void setCorreo(JLabel correo) {
		this.correo = correo;
	}

	public JLabel getEstatura() {
		return estatura;
	}

	public void setEstatura(JLabel estatura) {
		this.estatura = estatura;
	}

	public JLabel getDivorcio() {
		return divorcio;
	}

	public void setDivorcio(JLabel divorcio) {
		this.divorcio = divorcio;
	}

	public JButton getAceptar() {
		return aceptar;
	}

	public void setAceptar(JButton aceptar) {
		this.aceptar = aceptar;
	}

	public ImageIcon getImagBoton1() {
		return imagBoton1;
	}

	public void setImagBoton1(ImageIcon imagBoton1) {
		this.imagBoton1 = imagBoton1;
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

	public ButtonGroup getGrupo() {
		return grupo;
	}

	public void setGrupo(ButtonGroup grupo) {
		this.grupo = grupo;
	}

	public JLabel getFondo() {
		return fondo;
	}

	public void setFondo(JLabel fondo) {
		this.fondo = fondo;
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

	public JTextField getCampoAnio() {
		return campoAnio;
	}

	public void setCampoAnio(JTextField campoAnio) {
		this.campoAnio = campoAnio;
	}

	public JTextField getCampoContrasena() {
		return campoContrasena;
	}

	public void setCampoContrasena(JTextField campoContrasena) {
		this.campoContrasena = campoContrasena;
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

	public static String getGuardar2() {
		return GUARDAR2;
	}



}
