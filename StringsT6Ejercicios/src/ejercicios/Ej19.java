package ejercicios;

import java.util.Scanner;

public class Ej19 {
/*Implementa un programa que lea una frase y muestre todas sus palabras ordenadas de forma alfabética. 
 * Suponemos que cada palabra de la frase se separa de otra por un único espacio.*/
	public static void main(String[] args) {
		String frase;
		String[] tablaFrase;
		Scanner lee = new Scanner (System.in);
		System.out.println("Por favor introduzca una frase: ");
		frase = lee.nextLine();
		tablaFrase = frase.split(" ");
		String fraseFinal="";//auxiliar
		
		for (int i=0;i<tablaFrase.length;i++) {
			for(int j=i+1;j<tablaFrase.length;j++) {
				if (tablaFrase[i].compareTo(tablaFrase[j])>0) {
					fraseFinal = tablaFrase[i];
					tablaFrase[i]=tablaFrase[j]; 
					tablaFrase[j]=fraseFinal;
				}
			}
		}
		for (int i=0;i<tablaFrase.length;i++) {
			System.out.print(tablaFrase[i]+" ");
		}
	}//fin del main

}
