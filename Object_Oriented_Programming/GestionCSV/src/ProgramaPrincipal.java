
public class ProgramaPrincipal {

	public static void main(String[] args) {

		
		//Declaramos modelo, vista y controlador
		
		GestionCSVModelo modelo = new GestionCSVModelo();
		GestorCSVista vista = new GestorCSVista();
		GestionCSVControlador comtrolador = new GestionCSVControlador(modelo, vista);
		
		
		vista.setVisible(true);
		
		
		
	}

}
