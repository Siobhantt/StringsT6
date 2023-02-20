package ejercicios;

import java.util.Scanner;

public class Ej6 {
	/*
	 * Diseñar un programa que solicite al usuario una frase y una palabra. A
	 * continuación buscará cuántas veces aparece la palabra en la frase.
	 */
	public static void main(String[] args) {

		String palabra;
		String frase;
		int contadorPalabra = 0;
		int inicio = 0;
		Scanner lee = new Scanner(System.in);
		int posicion;

		System.out.println("Por favor introduzca la frase a verificar: ");
		frase = lee.nextLine();

		System.out.println("Por favor introduzca la palabra a buscar: ");
		palabra = lee.next();

		posicion = frase.indexOf(palabra, inicio);
		
		while (posicion >= 0) {
			contadorPalabra++;
			inicio += posicion + palabra.length();
		posicion = frase.indexOf(palabra, inicio);
		}

		System.out.println(palabra + " se encuentra en la frase introducida, " + contadorPalabra + " veces.");
		
		lee.close();
	}

}
