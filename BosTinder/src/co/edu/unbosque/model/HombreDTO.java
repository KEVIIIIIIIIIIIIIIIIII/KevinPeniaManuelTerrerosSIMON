package co.edu.unbosque.model;

public class HombreDTO extends PersonaDTO{
	
	private float ingreso;

	public HombreDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HombreDTO(float ingreso) {
		super();
		this.ingreso = ingreso;
	}

	public HombreDTO(String nombre, String apellido1, String apellido2, String sexo, int edad, int id, String usuario,
			String contraseña, String correo, String nacimiento, float ingreso) {
		super(nombre, apellido1, apellido2, sexo, edad, id, usuario, contraseña, correo, nacimiento);
		this.ingreso = ingreso;
	}

	public float getIngreso() {
		return ingreso;
	}

	public void setIngreso(float ingreso) {
		this.ingreso = ingreso;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux+=this.getId()+";"+this.getNombre()+";"+this.getApellido1()+";"+this.getApellido2()+";"+this.getSexo()+";"+this.getUsuario()+";"+this.getContraseña()
		+";"+this.getCorreo()+";"+this.getNacimiento()+";"+this.getEdad()+";"+this.ingreso + "\n";
		return aux;
	}

}
