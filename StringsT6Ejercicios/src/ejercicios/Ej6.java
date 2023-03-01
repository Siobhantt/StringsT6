package ejercicios;

import java.util.Scanner;

public class Ej6 {
	/*
	 * Diseñar un programa que solicite al usuario una frase y una palabra. A
	 * continuación buscará cuántas veces aparece la palabra en la frase.
	 */
	public static void main(String[] args) {

		String palabra;//Aqui guardaremos las palabras
		String frase;//aqui se guardarán las frase
		int contadorPalabra = 0; //El contador de las palabras
		int inicio = 0;//Para controlar el bucle
		Scanner lee = new Scanner(System.in);
		int posicion;

		System.out.println("Por favor introduzca la frase a verificar: ");
		frase = lee.nextLine();

		System.out.println("Por favor introduzca la palabra a buscar: ");
		palabra = lee.next();
		//En la posicion guardaremos donde empiece la palabra en la frase
		posicion = frase.indexOf(palabra, inicio);
		
		while (posicion >= 0) {//mientras la posicion sea mayor a 0 se aumenta el contador de la palabra
			contadorPalabra++;
			inicio += posicion + palabra.length(); //y luego al inicio se le suma la posicion de donde empieza mas la longitud de la palabra para que avance en la frase
		posicion = frase.indexOf(palabra, inicio); 
		}

		System.out.println(palabra + " se encuentra en la frase introducida, " + contadorPalabra + " veces.");
		
		lee.close();
	}

}
