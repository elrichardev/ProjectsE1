package delgado.ricardo;

import java.util.Scanner;

/**
 * Calculadora Ecuación Cuadrática
 * @author RD.Fernández 
 * @version 23 Oct.2018
 */

public class FuncionCuadratica {

	//PRINCIPAL - MAIN

	public static void main(String[] args) {

		//Definidos variables e inicializamos la función Scanner
		Scanner scan = new Scanner(System.in);

		//Introducción por consola del programa
		System.out.println("");
		System.out.println("﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄");
		System.out.println("﹃﹄ CALCULADORA ECUACIÓN CUADRÁTICA ﹃﹄");
		System.out.println("﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄﹃﹄");
		System.out.println("");
		System.out.println("Bienvenido, con esta calculadora podrás realizar funciones cuadráticas");
		System.out.println("");

		//Ejecuto la función Menu
		//decide ue hacer según el usuario
		Menu(scan);
		
		//Finalizamos función Scanner	
		scan.close();
     
	}

	public static void Menu(Scanner scan) {
		//Variable necesaria para comprobar opción elegida
		int entrarsalir;
		System.out.println("");
		System.out.println("╔════════════════════════╗");
		System.out.println("║ ¿Qué desea realizar?   ║");
		System.out.println("║ ● OPERAR (Pulse 1)     ║");
		System.out.println("║ ● SALIR  (Pulse 2)     ║");
		System.out.println("╚════════════════════════╝");


		//Según el número introducido, tenemos dos opciones
		//con este switch podemos bloquear al usuario en el caso 
		//de que escriba un caracter no válido

		if (scan.hasNextInt()) {
			entrarsalir = scan.nextInt();
			switch(entrarsalir) {
			case 1:
				Datos(scan);
				break;
			case 2:
				System.out.println(" ➤ Programa finalizado con éxito");
				System.out.close();
				break;
			default:
				System.err.println("Número introducido no válido");
			}	
		}

		else {

			System.err.println("Caracter introducido no válido");

		}

	}


	public static void Datos(Scanner scan) {

		double a,b,c;

		//Pedimos al usuario que introduzca los valores correspondiente
		
		System.out.println("Escribe el primer término: ");	
        a = scan.nextDouble();

		System.out.println("Escribe el segundo término: ");
		b = scan.nextDouble();

		System.out.println("Escribe el tercer término: ");
		c = scan.nextDouble();

		System.out.format("Ecuación: %.1fx² + %.1fx + %.1f = 0",a,b,c);

		Opera(a,b,c,scan);	 
	}
		

	public static void Opera(double a,double b,double c,Scanner scan) {

		double resultx1, resultx2, discri;

		//DEPENDIENDO DE COMO SEA EL DISCRIMINANTE, TENEMOS VARIAS OPCIONES
		//SI ES DISCRINANTE ES IGUAL, MAYOR O MENOR

		discri = ((b*b)-(4*a*c));

		if (discri < 0) {

			//RESULTADO
			System.out.println("");
			System.out.println("La ecuación no tiene solución");
			Menu(scan);
		}

		if (discri == 0) {

			//OPERACIÓN
			resultx1 = (-b) / (2 * a);
			//RESULTADO
			System.out.println("");
			System.out.println("Solución única");
			System.out.println("x = " + resultx1);
			Menu(scan);

		}

		if (discri > 0) {

			//OPERACIÓN
			resultx1 = ( (-b) + Math.sqrt(discri) ) / (2*a);
			resultx2 = ( (-b) - Math.sqrt(discri) ) / (2*a);	 
			//RESULTADO
			System.out.println("");
			System.out.println("Solución Doble:");
			System.out.println("x1 = "+resultx1);
			System.out.println("x2 = "+resultx2);
			Menu(scan);
		}

	}

}








	
	
