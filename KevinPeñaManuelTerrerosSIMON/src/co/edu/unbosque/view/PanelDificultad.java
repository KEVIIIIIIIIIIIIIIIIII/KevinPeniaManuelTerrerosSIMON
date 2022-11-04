package co.edu.unbosque.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

public class PanelDificultad extends JPanel{
	
	private static final long serialVersionUID = 1L;

	private JLabel labEntrada;
	private JTextField txtEspacio;
	private JButton butContinuar;
	private JComboBox <String> boxElegir;
	public static final String CONTINUAR = "Continuar";
	
	public PanelDificultad() {
		setLayout(new BorderLayout());
		inicializarComponentes();
		setVisible(false);
	}

	private void inicializarComponentes() {
		
		

		setLayout( new GridLayout(3,3,10,10));
		TitledBorder border = BorderFactory.createTitledBorder("JUEGAS O MIEDO");
		border.setTitleColor(Color.BLACK);
		setBorder( border );
		labEntrada = new JLabel("¿Quien esta jugando?");
		txtEspacio = new JTextField("");
		txtEspacio.setForeground(Color.BLACK);
		txtEspacio.setBackground(new Color(255, 255, 224));
		butContinuar = new JButton("Continuar");
		butContinuar.setBackground(new Color(255, 255, 224));
		butContinuar.setActionCommand(CONTINUAR);
		boxElegir = new JComboBox <String>();
		boxElegir.setBackground(new Color(255, 255, 224));
		boxElegir.addItem("¿Puedo jugar papi?");
		boxElegir.addItem("No me hagas danio");
		boxElegir.addItem("Soy la muerte encarnada!");
		
		add(labEntrada);
		add(new JLabel(""));
		add(txtEspacio);
		add(new JLabel("Elegir una Dificultad"));
		add(new JLabel(""));
		add(boxElegir);
		add(new JLabel(""));
		add(butContinuar, BorderLayout.CENTER);
		add(new JLabel(""));
	}

	public JTextField getTxtEspacio() {
		return txtEspacio;
	}

	public void setTxtEspacio(JTextField txtEspacio) {
		this.txtEspacio = txtEspacio;
	}

	public JButton getButContinuar() {
		return butContinuar;
	}

	public void setButContinuar(JButton butContinuar) {
		this.butContinuar = butContinuar;
	}

	public JComboBox<String> getBoxElegir() {
		return boxElegir;
	}

	public void setBoxElegir(JComboBox<String> boxElegir) {
		this.boxElegir = boxElegir;
	}


}
