package delgado.ricardo;

public class UsuarioPremium extends Usuarios {


	//DECLARACIÓN ARGUMENTOS

	private String instagram;
	private String numerocuenta;
	private String estudios;
	private String estadocivil;


	//CONSTRUCTOR CAMPOS OBLIGATORIOS

	public UsuarioPremium(String nombre, String apellido1, String apellido2, String dni, String email, 
			String fechaNacimiento, String numerocuenta, String telfMovil) {

		super(nombre, apellido1, apellido2, dni, email, fechaNacimiento);

		setNumerocuenta(numerocuenta);
		setTelfMovil(telfMovil);

	}

	//CONSTRUCTOR CAMPOS NO OBLIGATORIOS

	public UsuarioPremium(String nombre, String apellido1, String apellido2, String dni, String email,
			String fechaNacimiento, String instagram, String numerocuenta, String estudios, String estadocivil, char sexo) {

		super(nombre, apellido1, apellido2, dni, email, fechaNacimiento);

		setNumerocuenta(numerocuenta);
		setTelfMovil(telfMovil);
		setDireccion(direccion);
		setSexo(sexo);
		setInstagram(instagram);
		setEstudios(estudios);
		setEstadocivil(estadocivil);

	}

	//GETTERS Y SETTERS

	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getNumerocuenta() {
		return numerocuenta;
	}
	public void setNumerocuenta(String numerocuenta) {
		this.numerocuenta = numerocuenta;
	}
	public String getEstudios() {
		return estudios;
	}
	public void setEstudios(String estudios) {
		this.estudios = estudios;
	}

	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}

}
