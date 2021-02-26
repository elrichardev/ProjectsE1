import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GestionCSVControlador {
	private GestionCSVModelo modelo;
	private GestorCSVista vista;
	
	//Constructor
	public GestionCSVControlador(GestionCSVModelo modelo, GestorCSVista vista) {
		this.modelo = modelo;
		this.vista  = vista;
		
		//Boton cargar csv
		vista.btnCargarCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modelo.cargarCSV(ruta);     //llamar a x metodo
			}
		});
		
		
		//Boton guardar csv
		vista.btnGuardarCsv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.guardarCSV(ruta);  //llamar x
			}
		});
		
		
		//Boton añadir fila
		vista.btnAadirFila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.addFila();
			}
		});
		
		
		//Boton eliminar fila
		vista.btnEliminarFila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.delFila();
				
			}
		});
		
		//Botón añadir columna
		vista.btnAadirColumna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.addColumna();
			}
		});
		
		//Boton eliminar columna
		
		vista.btnEliminarColumna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.delColumna();
			}
		});
		
		
		//Boton eliminar fila en:
		vista.btnEliminarFilaEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.delFila(orden);
			}
		});
		
		//Boton añadir fila en:
		vista.btnAadirFilaEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				modelo.addFila(orden);			}
		});
		
		//Boton añadir columna en:
		vista.btnAadirColumnaEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.addColumna(orden);
			}
		});
		
		//Boton eliminar columna en:
		vista.btnEliminarColumnaEn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modelo.delColumna(orden);
			}
		});

		
		
		
		
		
	}
}