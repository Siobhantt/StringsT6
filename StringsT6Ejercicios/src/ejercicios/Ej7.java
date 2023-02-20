package ejercicios;

import java.util.Scanner;

public class Ej7 {
/*Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, 
 * es decir, que la frase sea igual leyendo de izquierda a derecha, que de derecha a izquierda, sin tener en cuenta los espacios. 
 * Un ejemplo de frase palíndroma es: “Dábale arroz a la zorra el abad”. 
 * Las vocales con tilde hacen que un algoritmo tome una frase palíndroma como si no lo fuese. 
 * Por esto, supondremos que el usuario introduce la frase sin tildes.*/
	
	public static void main(String[] args) {
	
		String frase[] = new String[0];
		String alReves[]=new String[0];
		Scanner lee = new Scanner(System.in);
		String cad1;
		String cad2;
		
		System.out.println("Por favor introduzca la frase a verificar: ");
		
		for(int i=0;i<frase.length-1;i++) {
			frase[i] = lee.next();
		}
		
		for(int i=0;i<alReves.length;i++) {
			alReves[i] = frase[frase.length-1];
		}
		
		cad1 = String.valueOf(frase);
		cad2 = String.valueOf(alReves);
		
		//System.out.println(cad1.equalsIgnoreCase(cad2) ? "La frase es palindromo" : "La frase no es palindromo");
	}

}
