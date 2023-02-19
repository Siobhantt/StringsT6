package ejercicios;

import java.util.Scanner;

public class Ej1 {
	/*
	 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es
	 * decir, la que contiene menos caracteres.
	 */
	public static void main(String[] args) {
		String palabra1;
		String palabra2;
		Scanner lee = new Scanner(System.in);
		// solicitamos las palabras a comparar
		System.out.println("Por favor introduzca la primera palabra a comparar: ");
		palabra1 = lee.nextLine();

		System.out.println("Por favor introduzca la segunda palabra a comparar: ");
		palabra2 = lee.nextLine();
		// cubrimos el caso de que las palabras tengan la misma cantidad de caracteres
		if (palabra1.length() == palabra2.length()) {
			System.out.println("Las palabras introducidas tiene la misma longitud.");
		} else {//en todos lo demas vcasos usamos un ternario para enviar el mensaje deseado segun la longitud de cada palabra
			System.out.println(palabra1.length() > palabra2.length() ? "La palabra " + palabra2 + " es mas corta"
					: "La palabra " + palabra1 + " es mas corta");
		}
//cerramos el scanner
		lee.close();
	}

}
