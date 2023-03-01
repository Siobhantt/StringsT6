package ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ej13 {
/*Diseñar un algoritmo que lea del teclado una frase e indique, para la letras que aparecen en la frase, cuántas veces se repite cada una. 
 * Se consideran iguales las letras mayúsculas y las minúsculas para realizar la cuenta. Un ejemplo sería:
Frase : En un lugar de la Mancha .
Resultado :
a: 4 veces
d: 1 vez
e: 2 veces
. . .
*/

	public static void main(String[] args) {
		String frase;
		char []tablaFrase;
		char [] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		Scanner lee = new Scanner(System.in);
		int contadorLetra =0;
		
		System.out.println("Por favor introduzca una frase: ");
		frase = lee.nextLine().toLowerCase();
		frase = frase.replace(" ", "");
		tablaFrase =frase.toCharArray();
	
		for(int i=0;i<abecedario.length;i++) {
			for(int j=0;j<tablaFrase.length;j++) {
				if(abecedario[i] == tablaFrase[j]) {
					contadorLetra++;
				}//fin del if	
			}
			if(contadorLetra!=0) {
				System.out.println("La letra " +	abecedario[i] + " se repite " + contadorLetra);
			}
			contadorLetra =0;
		}
	
		lee.close();
	}//finn del main
}
