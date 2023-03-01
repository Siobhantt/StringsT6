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
		String frase;//Aqui se va a guardar la frase
		char []tablaFrase; //Aqui guardaremos la frase convertida a array
		char [] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
		Scanner lee = new Scanner(System.in);
		int contadorLetra =0; //contador de letra
		
		System.out.println("Por favor introduzca una frase: ");
		frase = lee.nextLine().toLowerCase();//leemos la frase y lo pasamos todo a minusculas
		frase = frase.replace(" ", "");//reemplazamos los espacios por la nada
		tablaFrase =frase.toCharArray(); //guardamos la frase dividida en array
	//recorremos el abecedario  
		for(int i=0;i<abecedario.length;i++) {
			//por cada letra del abecedario recorremos las que estan en la frase
			for(int j=0;j<tablaFrase.length;j++) {
				if(abecedario[i] == tablaFrase[j]) { //si en el indice de ambas tablas se encuentra la misma letra aumentamos el contador
					contadorLetra++;
				}//fin del if	
			}
			if(contadorLetra!=0) { //si el contador es distinto de cero imprimimos la letra y el contador
				System.out.println("La letra " +	abecedario[i] + " se repite " + contadorLetra);
			}
			contadorLetra =0; //reiniciamos el contador en cada vuelta
		}
	
		lee.close();
	}//finn del main
}
