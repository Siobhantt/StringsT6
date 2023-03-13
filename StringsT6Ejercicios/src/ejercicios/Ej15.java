package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		String frase1;//frase del jugador 1
		String frase2;//frase del jugador2
		String desorden;//palabra desordenada
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Jugador1, por favor introduzca la palabra o frase: ");
		frase1 = lee.nextLine();
		desorden = FuncionDesordena.desordena(frase1);//utlizamos la funcion para desordenar la frase
		System.out.println("Jugador2, adivina el anagrama guardado en la siguiente frase: "+ desorden);
		do {//un do while para que se mantenga preguntando mientras la frase 1 y la frase 2 no sean iguales
			frase2 = lee.nextLine();
			
			System.out.println(frase1.equals(frase2) ? "Felicidades, acertaste!" : "Intentalo de nuevo :("); //en caso que si, una felicitacion, que no, animo para un nuevo intento
		}while(!frase1.equals(frase2));
		lee.close();
	}
	public static String desordena2(String frase) {
		int indice = 0;//indice para controlar el flujo de la palabra
		int indiceAleatorio = 0;//donde se guardará el indice aleatorio
		String desordenada = ""; //La palabra desordenada
		char[] tablaDesorden = new char[frase.length()]; //donde vamos a desordenar la frase o palabra
		Arrays.fill(tablaDesorden, 'º'); //llenamos toda la tabla de ºººººº

		while (indice < frase.length()) {//mientras la palabra no termine o sea, mientras el indice sea menor a la longitud
			indiceAleatorio = (int) (Math.random() * (frase.length()));//generamos un indice aleatorio y lo guardamos en la variable
			
			if (tablaDesorden[indiceAleatorio] == 'º') {//si lo que este guardado en el indice aleatorio de la tabla es igual a ººº entonces esta vacio
				tablaDesorden[indiceAleatorio] = frase.charAt(indice);//Por ende guardamos la letra
				indice++;//aumentamos el indice del recorrido de la palabra para que avance
			}
		} // fin del while
		desordenada = String.valueOf(tablaDesorden);//en desordenada guardamos la tranformacion del array a cadena
		return desordenada;//devolvemos el desorden
	}
	
}
