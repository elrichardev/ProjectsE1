package delgado.ricardo;

public class Usuarios {


	//DECLARACIÓN ARGUMENTOS
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private String email;
	private String fechaNacimiento;
	protected String telfMovil;
	protected String direccion;
	private char sexo;



	//CONSTRUCTOR CAMPOS OBLIGATORIOS

	public Usuarios(String nombre, String apellido1, String apellido2, String dni, String email, String fechaNacimiento) {
		setNombre(nombre);
		setApellido1(apellido1);
		setApellido2(apellido2);
		setDni(dni);
		setEmail(email);
		setFechaNacimiento(fechaNacimiento);
		setTelfMovil(telfMovil);
		setDireccion(direccion);
		setSexo(sexo);

	}

	//CONSTRUCTOR CAMPOS NO OBLIGATORIOS

	public Usuarios(String telfMovil, String direccion, char sexo) {
		super();
		setDireccion(direccion);
		setSexo(sexo);
		setTelfMovil(telfMovil);
	}

	//GETTERS Y SETTERS

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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelfMovil() {
		return telfMovil;
	}

	public void setTelfMovil(String telfMovil) {
		this.telfMovil = telfMovil;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}


