package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		
		String frase1;
		String frase2;
		int indice=0;
		int indiceA=0;
		int longitud;
		
		char[] palabraDesordenada;
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca la palabra o frase: ");
		frase1 = lee.nextLine();
		longitud = frase1.length();
		palabraDesordenada = new char[longitud];
		Arrays.fill(palabraDesordenada, 'º');
		
		
		System.out.println(Arrays.toString(palabraDesordenada));
		

	}

}
