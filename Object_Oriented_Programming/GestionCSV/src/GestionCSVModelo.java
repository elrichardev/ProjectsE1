
public class GestionCSVModelo {

	// Atributos de la clase
	private String[][] datos;
	
	// M�todos 
	public  boolean cargarCSV(String ruta) {
		return false;
		
	}
	public  boolean guardarCSV(String ruta) {
		return false;
		
	}
	
	public  void addFila() {
		// A�ade al final
	}
	public  void addFila(int orden) {
		// A�ade en la posici�n indicada
	}
	public  void delFila() {
		// Elimina la final
	}
	public  void delFila(int orden) {
		// Elimina la fila indicada
	}
	
	public  void addColumna() {
		// A�ade al final
	}
	public  void addColumna(int orden) {
		// A�ade en la posici�n indicada
	}
	public  void delColumna() {
		// Elimina la final
	}
	public void delColumna(int orden) {
		// Elimina la fila indicada
	}
	

	//Metodo modificar valor (Finalizado)
	public final boolean modificarValor(int fila, int columna, String valor) {
		boolean resultado = false;
		
		if (fila < this.datos.length &&
			columna < this.datos[0].length) {
			
			this.datos[fila][columna] = valor;
			resultado = true;			
		}
	
		return resultado;
	}
	
	//Metodo getValor (Finalizado)
	public String getValor(int fila, int columna) {
		return this.datos[fila][columna];
	}
	
	// Getters y Setters
	public String[][] getDatos() {
		return datos;
	}
	public void setDatos(String[][] datos) {
		this.datos = datos;
	}
}