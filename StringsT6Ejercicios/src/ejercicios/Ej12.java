package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej12 {
/*Un anagrama es un palabra, o frase, que resulta de la transposición de otra palabra o frase. 
 * Ejemplos de anagramas para la palabra roma son: amor, ramo o mora. 
 * Construir un programa que solicite al usuario dos palabras e indique si son anagramas una de otra.*/
	public static void main(String[] args) {
		String palabra1;
		String palabra2;
		char[] tablaPalabra1;
		char[] tablaPalabra2;
		Scanner lee = new Scanner(System.in);
		/* Dicho de otra forma, una palabra es anagrama de otra si las dos tienen las mismas letras, con el mismo número de apariciones, pero en un orden diferente.*/
		
		System.out.println("Por favor introduzca la primera palabra a verificar: ");
		palabra1 = lee.nextLine();
		System.out.println("Por favor introduzca la siguiente palabra a verificar: ");
		palabra2 = lee.nextLine();
		
		/*Tengo que virificar que ambas cadenas tengan la misma longitud, luego pasarlo a array, ordenarlo con un sort y 
		 * si los dos arrays son iguales pues la palabra e suna anagrama (:*/
		//Verifico que las dos palabras tengan la misma longitud
		if(palabra1.length()==palabra2.length()) { //en caso de que si
			tablaPalabra1 = palabra1.toCharArray();//paso ambas cadenas a array
			tablaPalabra2 = palabra2.toCharArray();
			Arrays.sort(tablaPalabra1);//las ordeno
			Arrays.sort(tablaPalabra2);
			//en caso de que ordenadas sean iguales significa que son un anagrama
			System.out.println(Arrays.equals(tablaPalabra1, tablaPalabra2) ? "Las palabras introducidas son un anagrama una de la otra" : "Las palabras introducidas no son un anagrama"); 
		}
		else {//En caso de que no tengan la misma longitud no son un anagrama
			System.out.println("Las palabras introducidas no son una anagrama la una de la otra");
		}
		lee.close();
		}
	}


