package delgado.ricardo;
import java.util.Scanner;

/**--------------------------------|
|   @author (C) RD.Fernández       |
|   @version 23 Nov.2018           |
|   programa: JuegoSencillo.java   |
|--------------------------------**/

public class JuegoSencillo {
	
	
	/**
	 * FUNCIÓN MAIN
	 * Función con la que se introduce el juego y ejecuta la siguiente  
	 * función (Menu)
	 **/
	
	public static void main(String[] args) {

		//Introducción del programa
		System.out.println("");
		System.out.println("・ーーーーーーーーーーーーーーーーーーー・");
		System.out.println("《      PIEDRA, PAPEL O TIJERA   》");
		System.out.println("・ーーーーーーーーーーーーーーーーーーー・");

		//Llamamos a la función Menu
		//esta función llamará a la siguientes funciones sucesivamente
		menu();	
		
	}
	
	
	/**
	 * FUNCIÓN MENU 
	 * Función con un simple menu que permite al usario 
	 * jugar al juego o salir del mismo
	 **/
	
	public static void menu() {
		//Definimos las variables necesarias 
		Scanner scanner = new Scanner(System.in);
		
		//Variable necesaria para comprobar opción elegida
		int entrarsalir;                            
		System.out.println("╔════════════════════════╗");
		System.out.println("║ ¿Qué desea realizar?   ║");
		System.out.println("║ ● JUGAR  (Pulse 1)     ║");
		System.out.println("║ ● SALIR  (Pulse 2)     ║");
		System.out.println("╚════════════════════════╝");
		
		//Determinamos los pasos a serguir según el número introducido
		if (scanner.hasNextInt()) {
			entrarsalir = scanner.nextInt();
			switch(entrarsalir) {
			case 1:
				datosusuario();
				break;
			case 2:
				System.err.println("\n ➤ Programa finalizado con éxito");
				System.out.close();
				break;
			default:{
				System.out.println("Carácter introducido no válido");
				menu();
			  }
			}	
		} else {
			System.err.println("Carácter introducido no válido");
			menu();
		}
		scanner.close();
	}
	
	/**
	 * FUNCIÓN DATOSUSUARIO
	 * Función que gracias a un scanner, pregunta al usuario que decide elegir
	 * cualquiera de las tres opciones disponibles
	 **/
	
	public static void datosusuario() {
		
		//Definimos las variables necesarias
		Scanner scan = new Scanner(System.in);
		String deciuser; //Es lo que escribe el usuario, perteneciente al String
		int respuser;    //Es la respuesta del usuario pero traducida a números,
		                 //me servirá para comparar dos números en un futuro

		System.out.println("\nElige una de las opciones: ");
		System.out.println("[PIEDRA] 💎");
		System.out.println("[PAPEL] 📜 ");
		System.out.println("[TIJERA] ✂\n");


		deciuser = scan.next();       //El scanner lee el String  que ha introducido el usuario
		deciuser = deciuser.toUpperCase();  //Transformo el valor del String a mayúsculas

		System.out.println("");
		
		//Con este switch decidimoslo que hacemos dependiendo de la opción elegida por el usuario
		switch (deciuser) {                   
		case "PIEDRA":   
			System.out.println("🙇 ‍ Has elegido [PIEDRA] 💎");
			respuser = 1;
			datosordenador(respuser,deciuser);
			break;
		case "PAPEL":
			System.out.println("🙇‍  Has elegido [PAPEL] 📜  ");
			respuser = 2;
			datosordenador(respuser, deciuser);
			break;
		case "TIJERA":
			System.out.println("🙇‍  Has elegido [TIJERA] ✂ ");
			respuser = 3;
			datosordenador(respuser, deciuser);
			break;
		default: {
			System.err.println("Carácter introducido no válido");
			datosusuario();

		   }
		} 
		
		scan.close();
	}
	
	/**
	 * FUNCIÓN DATOSORDENADOR
	 * Función que gracias a Math.Random el ordenador elige una de las tres 
	 * opciones de manera aleatoria, estas serán utilizadas en la siguiente funcioón
	 **/
	
	public static void datosordenador(int respuser, String deciuser) {
      //Definimos las variable necesarias
		int respc;
		respc = (int) (Math.random()*3+1);

		switch (respc) {
		case 1:
			System.out.println("📺  Tu rival ha elegido [PIEDRA] 💎 ");
			comparador(respuser,respc);
			break;

		case 2: 
			System.out.println("📺  Tu rival ha elegido [PAPEL] 📜  ");
			comparador(respuser,respc);
			break;

		case 3: 
			System.out.println("📺  Tu rival ha elegido [TIJERA] ✂   ");
			comparador(respuser,respc);
			break;
		default: {
			System.err.println("Error de computación");
			menu();
		}
	  }
	}
	
	/**
	 * FUNCIÓN COMPARADOR 
	 * Función que compara mediante números la opcioón elegida por el usuario
	 * y la función aleatoria elegida por el ordenador
	 * este comparador muestra al mismo tiempo la solución 
	 * y nos da la posibilidad de volver al menu
	**/
	
	public static void comparador(int respuser, int respc) {
         
		//A través del uso de condicionales, comparo ambas decisiones
		// y decido quien es el ganador/perdedor o empate
		
		if (respuser == respc) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.println("            ✦  EMPATE ✦                        ");
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			menu();                   //En todas ellas doy la oportunidad de volver a jugar por eso vuelvo al Menu
		}
		else {
		}

		if (respuser == 1  &&  respc == 2) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.println("Lo siento! Has perdido el juego.");
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			menu();
		}
		else {
		}

		if (respuser == 1  &&  respc == 3) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.println("Enhorabuena! Has ganado el juego.");
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			menu();
		}
		else {
		}

		if (respuser == 2  &&  respc == 3) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.println("Lo siento! Has perdido el juego.");
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			menu();
		}
		else {
		}

		if (respuser == 2  &&  respc == 1) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.println("Enhorabuena! Has ganado el juego.");
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			menu();
		}
		else {
		}

		if (respuser == 3  &&  respc == 1) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.println("Lo siento! Has perdido el juego.");
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			menu();
		}
		else {
		}

		if (respuser == 3  &&  respc == 2) {
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			System.out.println("Enhorabuena! Has ganado el juego.");
			System.out.println("⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯⎯");
			menu();

		}
	}
}