
public  class CSV {

	// Atributos de la clase
	private String[][] datos;
	
	// �Constructor?
	
	// M�todos abstractos
	public  boolean cargarCSV(String ruta) {
		return false;
	}
	public abstract boolean guardarCSV(String ruta);
	
	public abstract void addFila();			// A�ade al final
	public abstract void addFila(int orden);// A�ade en la posici�n indicada
	public abstract void delFila(); 		// Elimina la final
	public abstract void delFila(int orden);// Elimina la fila indicada
	
	public abstract void addColumna();			// A�ade al final
	public abstract void addColumna(int orden);	// A�ade en la posici�n indicada
	public abstract void delColumna();			// Elimina la final
	public abstract void delColumna(int orden);	// Elimina la fila indicada
	
	// M�todos finales
	public final boolean modificarValor(int fila, int columna, String valor) {
		boolean resultado = false;
		
		// Si fila y columna est�n dentro de los l�mites de la matriz...
		if (fila < this.datos.length &&
			columna < this.datos[0].length) {
			
			this.datos[fila][columna] = valor;
			resultado = true;			
		}
	
		return resultado;
	}
	
	// M�todos
	public String getValor(int fila, int columna) {
		return this.datos[fila][columna];
	}
	
	// Getters y Setters (para datos)
	public String[][] getDatos() {
		return datos;
	}
	public void setDatos(String[][] datos) {
		this.datos = datos;
	}
}