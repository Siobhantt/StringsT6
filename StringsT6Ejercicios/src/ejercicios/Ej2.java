package ejercicios;

import java.util.Scanner;

import examples.Utils;

public class Ej2 {
/*Diseña el juego “Acierta la contraseña”. 
 * La mecánica del juego es la siguiente: el primer jugador introduce la contraseña; a continuación,
 *  el segundo jugador debe teclear palabras hasta que la acierte.
 *  El juego debe indicar si la palabra introducida es mayor o menor alfabéticamente que la contraseña.
VERSIÓN AVANZADA: El juego, en vez de indicar si la palabra es mayor o menor alfabéticamente que la contraseña, 
debe mostrar una cadena con los caracteres acertados en sus lugares respectivos y asteriscos en los no acertados.
*/
	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		
		String jugador1;
		String jugador2;
		
		System.out.println("Jugador 1, por favor introduzca la contraseña: ");
		jugador1=lee.next();
		Utils.clearConsole2(); //fincion de la profe
		System.out.println("Jugador2, es su turno de adivinar la contraseña. ");
		do {
			jugador2=lee.next();
			System.out.println(jugador1.compareTo(jugador2)==0 ? "Has ganado, adivinaste la contraseña!" : "Mejor intentalo de nuevo");
		} while (jugador1.compareTo(jugador2)!=0);
		//preguntar a la profe que pasa con los espacios
		lee.close();
	}//fin del main

}
