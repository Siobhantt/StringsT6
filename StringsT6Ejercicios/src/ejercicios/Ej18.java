package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej18 {
	/*
	 * Escribe una aplicación que convierte una frase (que puede estar escrita con
	 * cualquier combinación de mayúsculas y minúsculas) en el nombre de una
	 * variable que utilice la nomenclatura Camel. Por ejemplo, la frase “Me GUsta
	 * merenDAR gaLLEtas”, se convertirá en “meGustaMerendarGalletas”. Supondremos
	 * que cada palabra que compone la frase está separada por un único espacio en
	 * blanco. NOTA: Puedes hacer uso de las funciones estáticas toLowerCase y
	 * toUpperCase definidas en la clase Character.
	 */
	public static void main(String[] args) {
		Scanner lee = new Scanner(System.in);
		String fraseUser = ""; // aqui se guarda la frase del usuario
		String[] frase;// la tabla para modidficar las cosas de la frase
		System.out.println("Guarda una palabra");
		fraseUser = lee.nextLine().toLowerCase(); // lo ponemos todo en minuscula
		frase = fraseUser.split(" "); // guardamos las PALABRAS de la frase en un array
		for (int i = 0; i < frase.length; i++) {// recorremos el array
			if (i != 0) { // si el indice es distinto de 0 entonces
				System.out.print(Character.toUpperCase(frase[i].charAt(0))
						/* <--- el character to uppercase selecciona solo 1 caracter */ + frase[i].substring(1));// le
																													// concatenamos
			} else {// se imprime la frase unicamente
				System.out.print(frase[i]);
			}
		}

		/*
		 * letra = palabra.substring(0, 1).toUpperCase(); letra += palabra.substring(1,
		 * palabra.length()); System.out.println(palabra); System.out.println(letra);
		 */

		/*
		 * String fraseUser; Scanner lee = new Scanner(System.in); String[] auxFrase;
		 * String fraseCamel="";
		 * 
		 * System.out.println("Por favor introduzca una frase: "); fraseUser =
		 * lee.nextLine(); auxFrase = fraseUser.toLowerCase().split(" "); for (int
		 * i=0;i<auxFrase.length;i++) { fraseCamel = auxFrase[i].substring(0,
		 * 1).toUpperCase(); fraseCamel += fraseCamel.concat(auxFrase[i].substring(1));
		 * System.out.print(fraseCamel); }
		 */
		// cerramos el scanner
		lee.close();
	}// fin del main

}
