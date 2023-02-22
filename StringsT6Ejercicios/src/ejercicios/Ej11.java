package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej11 {
/*Leer una frase y encontrar la palabra de mayor longitud. El programa debe imprimir tanto la palabra como el número de caracteres de la misma.*/
	/*Lo que quiero hacer es dividir la frase en partes e ir anazlizando las cadenas guardadas en cada iteracion del array que se forma con el split
	 * una vez hecho eso analizar la longitud de lo que esta guardado en lai y lo que sea myor pues es la palabra mas grande*/
	public static void main(String[] args) {
		
		String frase;
		Scanner lee = new Scanner(System.in);
		String palabras[];
		int longitud;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		String mayor="";
		
		System.out.println("Por favor introduzca una frase: ");
		frase = lee.nextLine();
		
		palabras = frase.split(" ");
		
		for(int i =0;i<palabras.length;i++) {
			longitud = palabras[i].length();
				if (longitud > max) {
					mayor = palabras[i];
					
				}
			}
		System.out.println(mayor);
	
		}
		
		
	}


