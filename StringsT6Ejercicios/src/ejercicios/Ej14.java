package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej14 {
/*Implementar el juego del anagrama, que consiste en que un jugador escribe una palabra o frase, 
 * y la aplicación muestra un anagrama (transposición de los caracteres) del texto introducido generado al azar. 
 * A continuación otro jugador tiene que acertar cuál es el texto original. 
 * La aplicación no debe permitir que el texto introducido por el jugador 1 sea la cadena vacía.
 *  Por ejemplo, si el jugador 1 escribe “teclado”, la aplicación muestra como pista un anagrama al azar: “etcloda”. 
 *  Puedes usar una función que realice la desordenación del texto.*/
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
	}//fin del main
}
