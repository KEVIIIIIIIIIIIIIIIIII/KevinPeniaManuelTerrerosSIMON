package co.edu.unbosque.model;

public class HombreDTO extends PersonaDTO{
	
	private String ingreso;
	private String divorcio;

	public HombreDTO() {
		super();
		// TODO Auto-generated constructor stub
	}



	public HombreDTO(String ingreso, String divorsio) {
		super();
		this.ingreso = ingreso;
		this.divorcio = divorsio;
	}
	public HombreDTO(String id, String nombre, String apellido1, String apellido2, String sexo, String usuario,
			String contraseña, String correo, String nacimiento, String edad, String ingreso, String divorsio, String nLikesRecibido, String nLikesOtorgado,
			String matches, String estado) {
		this.ingreso = ingreso;
		this.divorcio = divorsio;
	}




	
	public String getIngreso() {
		return ingreso;
	}



	public void setIngreso(String ingreso) {
		this.ingreso = ingreso;
	}



	public String getDivorsio() {
		return divorcio;
	}



	public void setDivorsio(String divorsio) {
		this.divorcio = divorsio;
	}



	public String getDivorcio() {
		return divorcio;
	}



	public void setDivorcio(String divorcio) {
		this.divorcio = divorcio;
	}



	@Override
	public String toString() {
		String aux = "";
		aux+=this.getId()+";"+this.getNombre()+";"+this.getApellido1()+";"+this.getApellido2()+";"+this.getSexo()+";"+this.getUsuario()+";"+this.getContraseña()
		+";"+this.getCorreo()+";"+this.getNacimiento()+";"+this.getEdad()+";"+this.ingreso + ";"+this.divorcio+";"+this.getnLikesRecibido()+";"+this.getnLikesOtorgado()
		+";"+this.getMatches()+";"+this.getEstado()+"\n";
		return aux;
	}

}
