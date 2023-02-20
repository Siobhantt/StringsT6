package ejercicios;

import java.util.Scanner;

public class Ej5 {
/*Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras introducidas con espacios en blanco. 
 * Terminar de leer la frase cuando alguna de las palabras introducidas sea la cadena “fin”
 *  escrita con cualquier combinación de mayúsculas/minúsculas. 
 * La cadena “fin” no aparecerá en la frase final.*/
	public static void main(String[] args) {
		String palabra; //aqui leeremos la palabra que se va añadfir en la frase
		String frase = ""; //iniciamos frase en cadena vacia para ir concatenando las palabras que introduzca el user
		String fin = "fin"; //la palabra fin para finalizar el bucle
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca una frase palabra por palabra: ");
		//Iniciamos un do while para que entre por lo menos una vez
		do {
			palabra = lee.next();//leemos la palabra y en caso de que sea distina a fin concatenamos con la variable frase
			if(palabra.equalsIgnoreCase(fin)==false) {
				frase += palabra + " ";
			}
		} while (fin.equalsIgnoreCase(palabra)==false); //todo esto mientras se compruebe que la palabra no sea fin
		System.out.print(frase);//imprimimos la frase final
	
		lee.close();
	}

}
