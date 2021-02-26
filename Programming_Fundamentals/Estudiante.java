package delgado.ricardo;
import java.util.Scanner;

/**
 * CLASE Estudiante.
 * Encargada de la realización de las operaciones matemáticas
 * necesarias que serán devueltas y mostradas por pantalla en
 * la clase EstudianteDemo.
 * Esta CLASE se divide en 1 MÉTODO: {evalua}
 **/

public class Estudiante {

	/**
	 * MÉTODO evalua.
	 * Método que recorre el dimensiona al array dependiendo
	 * de la cantidad de notas a promediar
	 * este recorre genera el array y da los valores por referencia
	 * por último calcula la media con operaciones matemáticas sencilla
	 **/

	public static double evalua() {

		//METODO PARA CALCULAR LA  MEDIA
		Scanner sc = new Scanner(System.in);
		int numnotas;
		double suma = 0;
		double media;
		do {
			System.out.println("¿Cuántas notas quieres promediar? (mínimo 3)");
			numnotas = sc.nextInt();
		} while (numnotas < 3);

		//DIMENSIONAMOS EL ARRAY CON EL VALOR PROPORCIONADO POR EL USUARIO
		double[] notas = new double[numnotas];

		//ENTRADA DE DATOS / ASIGNAMOS A CADA ELEMENTO DEL ARRAY
		//UNA NOTA INTRODUCIDA POR EL USUARIO
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Nota Número [" + (i + 1) +"] ➞  " );
			notas[i] = sc.nextDouble();	
		}

		//OPERACIONES MATEMÁTICAS NECESARIAS PARA CALCULAR LA MEDIA
		for (int i = 0; i < notas.length; i++) {
			suma = suma + notas[i];
		}

		media = suma / notas.length;

		//DEVUELVE EL DOUBLE "MEDIA" 
		System.out.println("");
		System.out.println("▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫▪▫");
		System.out.print(media);

		//FINALIZAMOS EL SCANNER
		sc.close();

		return media;

	}

}	

