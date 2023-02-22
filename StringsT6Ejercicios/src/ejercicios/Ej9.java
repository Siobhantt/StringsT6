package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {

		char conjunto1[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		char conjunto2[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		String palabra;
		String conjunto;
		String conjunto22;
		char caracter = ' ';
		Scanner lee = new Scanner(System.in);

		conjunto = String.valueOf(conjunto1);
		conjunto22 = String.valueOf(conjunto2);
		// conjunto2= String.valueOf(conjunto2);
		System.out.println("Por favor introduzca una palabra a codificar: ");
		palabra = lee.nextLine();

		for (int i = 0; i < palabra.length(); i++) {
			caracter = palabra.charAt(i);
			
			for(int j=0;j<conjunto.length();j++) {
			if (conjunto.charAt(j) == caracter) {
				caracter = FuncionEj9.codifica(conjunto1, conjunto2, caracter);
			}
			}
			System.out.print(caracter);
		}

		/*
		 * for(int i=0;i<palabra.length();i++) { if(conjunto.indexOf(i) ==
		 * palabra.charAt(i)) {
		 * 
		 * } }//fin del for
		 */
	}

}
