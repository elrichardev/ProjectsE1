package delgado.ricardo;
import java.util.Scanner;

/**--------------------------------|
|   @author (C) RD.Fernández       |
|   @version 27 Dic.2018           |
|   programa: EstudianteDemo.java  |
|--------------------------------**/

/**
 * CLASE ESTUDIANTEDEMO.
 * Encargada de pedir presentar, mostrar y pedir los datos 
 * necesarios por pantalla.
 * Esta CLASE se divide en tres MÉTODOS: {main, menu, datos}
 **/

public class EstudianteDemo {


	//DECLARACIÓN DE VARIABLES

	static Scanner scan = new Scanner(System.in);
	static String nombre, apellidos;
	static int numeroexp;


	/**
	 * MÉTODO MAIN.
	 * Función con la que se introduce el programa y ejecuta 
	 * el siguiente MÉTODO: {menu}.
	 **/

	public static void main(String[] args) {

		//Introducción del programa
		System.out.println("");
		System.out.println("・ーーーーーーーーーーーーーーーーーーー・");
		System.out.println("《            ESTUDIANTE  v1.0      》");
		System.out.println("・ーーーーーーーーーーーーーーーーーーー・");

		//Llamamos a la función Menu
		//esta función llamará a la siguientes funciones sucesivamente
		menu(scan, nombre, numeroexp, apellidos);	
	}

	/**
	 * MÉTODO MENU.
	 * Método con un simple menu que permite al usario 
	 * ejecutar el programa o salir del mismo.
	 **/

	public static void menu(Scanner scan, String nombre, int numeroexp, String apellidos) {
		//Definimos las variables necesarias 
		Scanner scanner = new Scanner(System.in);

		//Variable necesaria para comprobar opción elegida
		int entrarsalir;                            
		System.out.println("╔════════════════════════╗");
		System.out.println("║ ¿Qué desea realizar?   ║");
		System.out.println("║ ● EJECUTAR (Pulse 1)   ║");
		System.out.println("║ ● SALIR    (Pulse 2)   ║");
		System.out.println("╚════════════════════════╝");

		//Determinamos los pasos a serguir según el número introducido
		if (scanner.hasNextInt()) {
			entrarsalir = scanner.nextInt();
			switch(entrarsalir) {
			case 1:
				System.out.println("✔ Has elegido [EJECUTAR]");
				System.out.println("");
				datos(scan, nombre, numeroexp, apellidos);
				break;
			case 2:
				System.err.println("\n ➤ Programa finalizado con éxito");
				System.out.close();
				break;
			default:{
				System.out.println("Carácter introducido no válido");
				menu(scan, nombre, numeroexp, apellidos);
			}
			}	
		} else {
			System.err.println("Carácter introducido no válido");
			menu(scan, nombre, numeroexp, apellidos);
		}
		scanner.close();
	}

	/**
	 * MÉTODO DATOS.
	 * Método que pide datos a una persona y que los almacena en variables
	 * esta función muestra al mismo tiempo el resultado por pantalla.
	 **/

	private static void  datos(Scanner scan, String nombre, int numeroexp, String apellidos) {

		//NOMBRE
		System.out.println("⁃ Introduce el nombre del alumno:");
		nombre = scan.nextLine().toUpperCase();
		System.out.println(" ");

		//APELLIDOS
		System.out.println("⁃ Introduce los apellidos del alumno:");
		apellidos = scan.nextLine().toUpperCase();
		System.out.println(" ");

		//NUMERO DE EXPEDIENTE

		System.out.println("⁃ Introduce el Nº Expediente:");
		numeroexp = scan.nextInt();	
		System.out.println(" ");

		//------------------------------------------------------------//
		//                  PRESENTACIÓN DE RESULTADOS                //
		//------------------------------------------------------------//


		//CALCULA MEDIA DE LAS NOTAS Y PRESENTA RESULTADO POR PANTALLA
		Estudiante.evalua();
		System.out.print(" <--- Media notas ✎ \n");

		//PRESENTA EL NOMBRE + APELLIDOS POR PANTALLA
		System.out.println( nombre + " " + apellidos + " <--- Nombre ✎ " );

		//PRESENTA EL NÚMERO DE EXPEDIENTE DEL ALUMNO
		System.out.println(numeroexp + " <--- Nº Expediente ✎ ");
		System.out.println("▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫");
		System.out.close();


	}
}