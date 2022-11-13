package co.edu.unbosque.model;

public class MujerDTO extends PersonaDTO{
	
	private String divorcio;

	public MujerDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public MujerDTO(String divorcio) {
		super();
		this.divorcio = divorcio;
	}

	public MujerDTO(String nombre, String apellido1, String apellido2, String sexo, int edad, int id, String usuario,
			String contraseña, String correo, String nacimiento, String divorcio) {
		super(nombre, apellido1, apellido2, sexo, edad, id, usuario, contraseña, correo, nacimiento);
		this.divorcio = divorcio;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux+=this.getId()+";"+this.getNombre()+";"+this.getApellido1()+";"+this.getApellido2()+";"+this.getSexo()+";"+this.getUsuario()+";"+this.getContraseña()
		+";"+this.getCorreo()+";"+this.getNacimiento()+";"+this.getEdad()+";"+this.divorcio + "\n";
		return aux;
	}

}
