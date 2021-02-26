

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JInternalFrame;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;

public class GestorCSVista {

	private JFrame frmFicherosCsv;
	private JTable table;
	
	
    //Declaración JButton
	JButton btnCargarCsv;
	JButton btnGuardarCsv;
	JButton btnAadirFila;
	JButton btnEliminarFila;
	JButton btnAadirColumna;
	JButton btnEliminarColumna;
	JButton btnEliminarFilaEn;
	JButton btnAadirFilaEn;
	JButton btnAadirColumnaEn;
	JButton btnEliminarColumnaEn;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestorCSVista window = new GestorCSVista();
					window.frmFicherosCsv.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GestorCSVista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFicherosCsv = new JFrame();
		frmFicherosCsv.setFont(new Font("Dialog", Font.BOLD, 12));
		frmFicherosCsv.setTitle("VISOR CSV");
		frmFicherosCsv.setBounds(100, 100, 464, 564);
		frmFicherosCsv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFicherosCsv.getContentPane().setLayout(null);
		
		btnCargarCsv = new JButton("Cargar CSV");
		btnCargarCsv.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCargarCsv.setBounds(12, 13, 191, 25);
		frmFicherosCsv.getContentPane().add(btnCargarCsv);
		
		btnGuardarCsv = new JButton("Guardar CSV");
		btnGuardarCsv.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnGuardarCsv.setBounds(240, 13, 191, 25);
		frmFicherosCsv.getContentPane().add(btnGuardarCsv);
		
		
		
		
		table = new JTable();
		table.setBackground(Color.BLACK);
		table.setBounds(432, 495, -419, -276);
		frmFicherosCsv.getContentPane().add(table);
		
		btnAadirColumna = new JButton("Añadir Columna");
		btnAadirColumna.setBounds(12, 137, 133, 25);
		frmFicherosCsv.getContentPane().add(btnAadirColumna);
		
		btnEliminarColumna = new JButton("Eliminar Columna");
		btnEliminarColumna.setBounds(12, 175, 133, 25);
		frmFicherosCsv.getContentPane().add(btnEliminarColumna);
		
		btnAadirFila = new JButton("Añadir Fila");
		btnAadirFila.setBounds(12, 61, 133, 25);
		frmFicherosCsv.getContentPane().add(btnAadirFila);
		
		btnEliminarFila = new JButton("Eliminar Fila");
		btnEliminarFila.setBounds(12, 99, 133, 25);
		frmFicherosCsv.getContentPane().add(btnEliminarFila);
		
	    btnEliminarFilaEn = new JButton("Eliminar fila en:");
		btnEliminarFilaEn.setBounds(157, 99, 153, 25);
		frmFicherosCsv.getContentPane().add(btnEliminarFilaEn);
		
		btnAadirFilaEn = new JButton("Añadir fila en:");
		btnAadirFilaEn.setBounds(157, 61, 153, 25);
		frmFicherosCsv.getContentPane().add(btnAadirFilaEn);
		
		btnAadirColumnaEn = new JButton("Añadir columna en:");
		btnAadirColumnaEn.setBounds(157, 137, 153, 25);
		frmFicherosCsv.getContentPane().add(btnAadirColumnaEn);
		
		btnEliminarColumnaEn = new JButton("Eliminar columna en:");
		btnEliminarColumnaEn.setBounds(157, 175, 153, 25);
		frmFicherosCsv.getContentPane().add(btnEliminarColumnaEn);
		
		textField = new JTextField();
		textField.setBounds(322, 62, 116, 22);
		frmFicherosCsv.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(322, 100, 116, 22);
		frmFicherosCsv.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(322, 138, 116, 22);
		frmFicherosCsv.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(322, 176, 116, 22);
		frmFicherosCsv.getContentPane().add(textField_3);
	}

	public void setVisible(boolean b) {
		
	}
}
