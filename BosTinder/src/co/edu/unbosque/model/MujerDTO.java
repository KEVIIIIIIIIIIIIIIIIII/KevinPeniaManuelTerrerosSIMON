package co.edu.unbosque.model;


public class MujerDTO extends PersonaDTO{
	
	private String divorcio;
	private String ingreso;

	public MujerDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public MujerDTO(String ingreso, String divorcio) {
		super();
		this.ingreso = ingreso;
		this.divorcio = divorcio;
	}
	public MujerDTO(String id, String nombre, String apellido1, String apellido2, String sexo, String usuario,
			String contraseña, String correo, String nacimiento, int edad, String ingreso, String divorsio, int nLikesRecibido, int nLikesOtorgado,
			int matches, String estado) {
		this.ingreso = ingreso;
		this.divorcio = divorsio;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux+=/**this.getId()+**/";"+this.getNombre()+";"+this.getApellido1()+";"+this.getApellido2()+";"+this.getSexo()+";"+this.getUsuario()+";"+this.getContraseña()
		+";"+this.getCorreo()+";"+this.getNacimiento()+";"+this.getEdad()+";"+this.ingreso + ";"+this.divorcio+";"+this.getnLikesRecibido()+";"+this.getnLikesOtorgado()
		+";"+this.getMatches()+";"+this.getEstado()+"\n";
		return aux;
	}

}
