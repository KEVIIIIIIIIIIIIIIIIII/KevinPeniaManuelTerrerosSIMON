package co.edu.unbosque.model;

public class PersonaDTO {

	private String nombre;
	private String apellido1;
	private String apellido2;
	private String sexo;
	private int edad;
	private int id;
	private String usuario;
	private String contraseña;
	private String correo;
	private String nacimiento;
	
	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}

	public PersonaDTO(String nombre, String apellido1, String apellido2, String sexo, int edad, int id, String usuario,
			String contraseña, String correo, String nacimiento) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.sexo = sexo;
		this.edad = edad;
		this.id = id;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.correo = correo;
		this.nacimiento = nacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	
	

}
