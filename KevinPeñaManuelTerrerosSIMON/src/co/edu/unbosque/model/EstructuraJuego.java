package co.edu.unbosque.model;

import java.util.Random;

public class EstructuraJuego {
	private int numRad1;
	private int numRad2;
	private int numRad3;
	private int numRad4;
	private Random rd;
	private String cadena;
	private String cadenaIngresada;
	
	public EstructuraJuego() {
		numRad1 = 0;
		numRad2 = 0;
		numRad3 = 0;
		numRad4 = 0;
		cadena = "";
		cadenaIngresada = "";
		rd = new Random();
	}
	
	public void generarNumeroRandom() {
		numRad1 = rd.nextInt(4)+1;
		numRad2 = rd.nextInt(4)+1;
		numRad3 = rd.nextInt(4)+1;
		numRad4 = rd.nextInt(4)+1;
		
		cadena = ""+numRad1+numRad2+numRad3+numRad4;
		
	}
	
	public void recibirCadenaIngresada(String cad) {
		this.cadenaIngresada += cad;
	}
	
	public boolean compararRespuestas() {
		if (cadena.equals(cadenaIngresada)) {
			return true;
		}else {
			return false;
		}
	}

	public Random getRd() {
		return rd;
	}

	public void setRd(Random rd) {
		this.rd = rd;
	}

	public String getCadenaIngresada() {
		return cadenaIngresada;
	}

	public void setCadenaIngresada(String cadenaIngresada) {
		this.cadenaIngresada = cadenaIngresada;
	}

	public String getCadena() {
		return cadena;
	}

	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	public int getNumRad1() {
		return numRad1;
	}
	public void setNumRad1(int numRad1) {
		this.numRad1 = numRad1;
	}
	public int getNumRad2() {
		return numRad2;
	}
	public void setNumRad2(int numRad2) {
		this.numRad2 = numRad2;
	}
	public int getNumRad3() {
		return numRad3;
	}
	public void setNumRad3(int numRad3) {
		this.numRad3 = numRad3;
	}
	public int getNumRad4() {
		return numRad4;
	}
	public void setNumRad4(int numRad4) {
		this.numRad4 = numRad4;
	}
	
}
