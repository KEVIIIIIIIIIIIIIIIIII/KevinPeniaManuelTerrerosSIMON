package co.edu.unbosque.model;

public class PersonaDTO {

	private String id;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String sexo;
	private String usuario;
	
	private String contraseña;
	private String correo;
	
	private String nacimiento;
	private String edad;
	
	private String nLikesRecibido;
	
	private String nLikesOtorgado;
	private String matches;
	private String estado;
	
	public PersonaDTO() {
		// TODO Auto-generated constructor stub
	}



	public PersonaDTO(String id, String nombre, String apellido1, String apellido2, String sexo, String usuario,
			String contraseña, String correo, String nacimiento, String edad, String nLikesRecibido, String nLikesOtorgado,
			String matches, String estado) {
		this.id = id;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.sexo = sexo;
		this.usuario = usuario;
		this.contraseña = contraseña;
		this.correo = correo;
		this.nacimiento = nacimiento;
		this.edad = edad;
		this.nLikesRecibido = nLikesRecibido;
		this.nLikesOtorgado = nLikesOtorgado;
		this.matches = matches;
		this.estado = estado;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
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



	public String getEdad() {
		return edad;
	}



	public void setEdad(String edad) {
		this.edad = edad;
	}



	public String getnLikesRecibido() {
		return nLikesRecibido;
	}



	public void setnLikesRecibido(String nLikesRecibido) {
		this.nLikesRecibido = nLikesRecibido;
	}



	public String getnLikesOtorgado() {
		return nLikesOtorgado;
	}



	public void setnLikesOtorgado(String nLikesOtorgado) {
		this.nLikesOtorgado = nLikesOtorgado;
	}



	public String getMatches() {
		return matches;
	}



	public void setMatches(String matches) {
		this.matches = matches;
	}



	public String getEstado() {
		return estado;
	}



	public void setEstado(String estado) {
		this.estado = estado;
	}



}
