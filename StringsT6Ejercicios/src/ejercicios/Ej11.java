package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej11 {
/*Leer una frase y encontrar la palabra de mayor longitud. El programa debe imprimir tanto la palabra como el número de caracteres de la misma.*/
	/*Lo que quiero hacer es dividir la frase en partes e ir anazlizando las cadenas guardadas en cada iteracion del array que se forma con el split
	 * una vez hecho eso analizar la longitud de lo que esta guardado en lai y lo que sea myor pues es la palabra mas grande*/
	public static void main(String[] args) {
		
		String frase;//la frase que va a introducir el usuario
		Scanner lee = new Scanner(System.in);
		String palabras[];//el array donde voy guardar la frase para asi dividirlo
		int longitud=0;//la longitud de las palabras para asi comparar cual tiene mayor cantidad de caracteres
		int maxCantLetras = Integer.MIN_VALUE; //la cantidad maxima de letras que tenga una palabra 
		String palabraMayor=""; //aqui vy a guardar la palabra con mas letras
		
		System.out.println("Por favor introduzca una frase: ");
		frase = lee.nextLine();
		//uso el split para separar la frase, el punto de separacion serán los espacios
		palabras = frase.split(" ");
		//recorro la tabla que contiene las palabras de la frase
		for(int i =0;i<palabras.length;i++) {
			longitud = palabras[i].length();//en esta variable guardo la longitud de la palabra que este guardada en i en esa iteracion
			//System.out.println(palabras[i] + ": "+ longitud);
			if(longitud>maxCantLetras) { //si la longitud de la palabra es mayor que la cantidad mayor de leras guardada
				palabraMayor = palabras[i]; //se establece como palabra mayor 
				maxCantLetras=longitud;//y la longitud de esa palabra se establece como el nuevo maximo
			}
		}
		System.out.println("La palabra más larga de la frase es: " + palabraMayor + " \ny la longitud de esa palabra es: "+ maxCantLetras);
		}
	}


