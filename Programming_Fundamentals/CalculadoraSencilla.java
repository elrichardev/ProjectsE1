package delgado.ricardo;

import java.util.Scanner;

         /**
		 * Calculadora Sencilla
		 * @author RD.Fernández
		 * @version 9 Oct.2018
		 */

public class CalculadoraSencilla {
	
	//PRINCIPAL - MAIN

	public static void main(String[] args) {
		
		//Definidos variables e inicializamos la función Scanner
		 Scanner scan = new Scanner(System.in);
		 double x = 0;
		 double y = 0;
		 String operacion = null;
		 
		 //Introducción por consola del programa
	    System.out.println("―――――――――――――――――――――――――――――――――――");
	    System.out.println("│        -[ CALCULADORA ]-         │");
	    System.out.println("―――――――――――――――――――――――――――――――――――");
	    System.out.println("");
	    System.out.println("Bienvenido, con esta calculadora podrás realizar cualquier tipo de " +
	    "operacion mátematica. \n ➤ [ Suma, Resta, Multiplicación y División ]");
	    System.out.println("");
	    
	   //Ejecuto la funcion Menu
	    Menu (scan,operacion,x,y);
	   
	    //Finalizo Scanner 
	    scan.close();
	      
	}
	
	//FUNCION MENU
	public static void Menu(Scanner scan,String operacion,double x, double y) {
		//Variable necesaria para comprobar opción elegida
		int entrarsalir;
		System.out.println("╔════════════════════════╗");
		System.out.println("║ ¿Qué desea realizar?   ║");
		System.out.println("║ ● OPERAR (Pulse 1)     ║");
		System.out.println("║ ● SALIR  (Pulse 2)     ║");
		System.out.println("╚════════════════════════╝");
		entrarsalir = scan.nextInt();
		
		//Según el número introducido, tenemos dos opciones
		//con este switch podemos bloquear al usuario en el caso 
		//de que escriba un caracter no válido
		
		switch(entrarsalir) {
	    case 1:
	    	Op(operacion,x,y,scan,entrarsalir);
	    	break;
	    case 2:
	    	System.out.println(" ➤ Programa finalizado con éxito");
	    	System.out.close();
	    	break;
	    default:{ 
	    	System.err.println("Número introducido no válido");
	    	Menu (scan,operacion,x,y);
	    }
	  }
	}
	
	//FUNCION - OPERACIONES
	public static void Op(String operacion, double x,double y,Scanner scan,int entrarsalir) {
		
		//Con función Scanner leemos los valores con los que se realizarán las operaciones
		System.out.print("Introduce la operación a realizar: ");
		x = scan.nextDouble();
	    operacion = scan.next();
	    y = scan.nextDouble();
	    
       //Según la operación introducida por el usuario, a través de un Switch (Según), tomamos
	   //varias alternativas
		switch(operacion) {
	    case "+":
	    	System.out.print(x+y);
	    	break;
	    case "-":
	    	System.out.print(x-y);
	    	break;
	    case "*":
	    	System.out.print(x*y);
	    	break;
	    case "/":
	    	if (y==0) {                                                               
	    		System.err.println("Número no válido ( no puede ser 0 )");
	    		Menu (scan,operacion,x,y);
	    	}
	    	else {
	    	System.out.print(x/y);
	    	}
	    	break;
	    default: {
	    	
	    	System.err.println("No existe ese operador " +                   //En caso de que exista algún error de sintaxis
	        "prueba con +, -, / o *");                                       // el usuario volverá a ser llevado al Menú
	        Menu (scan,operacion,x,y);
	        
	    }
	    	
		 
	    
		  }
		
	}
	
	
   
}