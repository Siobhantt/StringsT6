package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej7 {
	/*
	 * Realizar un programa que lea una frase del teclado y nos indique si es
	 * palíndroma, es decir, que la frase sea igual leyendo de izquierda a derecha,
	 * que de derecha a izquierda, sin tener en cuenta los espacios. Un ejemplo de
	 * frase palíndroma es: “Dábale arroz a la zorra el abad”. Las vocales con tilde
	 * hacen que un algoritmo tome una frase palíndroma como si no lo fuese. Por
	 * esto, supondremos que el usuario introduce la frase sin tildes.
	 */

	public static void main(String[] args) {

		String frase;
		int longitud;
		char tablaFrase[];

		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca la frase a verificar: ");
		frase = lee.nextLine(); //leemos la frase
		frase = frase.replace(" ", ""); //reemplazamos los espacios en blanco por espacios vacios
		longitud = frase.length(); //tomamos la longitud de la frase

		char[] alReves = new char[longitud]; //a la tabla que pondremos al reves le damos la longitud de la frase
		tablaFrase = frase.toCharArray(); //y en tabla frase guardaremos la frase pero dividida en caracteres individuales
		for (int i = 0; i < longitud; i++) { //hacemos un for donde va a iterar la cantidad que se la longitud de la frase
			alReves[i] = tablaFrase[longitud - 1 - i]; //y en la tabla al reves iremos guardando el ultimo elemento de la tabla principal
		}
		System.out.println(Arrays.toString(tablaFrase));
		System.out.println(Arrays.toString(alReves));
		System.out.println(Arrays.equals(tablaFrase, alReves) ? "La frase es palindromo" : "La frase NO es palindromo");

		lee.close();
	}

}
