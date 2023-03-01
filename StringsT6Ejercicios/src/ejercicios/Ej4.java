package ejercicios;

import java.util.Scanner;

public class Ej4 {
/*Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida.
 *  Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”. 
 *  Recuerda probar la función en un main.*/
	public static void main(String[] args) {
		
		Scanner lee = new Scanner(System.in);
		String palabra; //Donde se guardará la palabra introducida por el usuario
		String invertido; //Donde se guadrá la palabra modificada
		
		//Leemos la palabra
		System.out.println("Por favor introduzca la frase que quiere poner al reves: ");
		palabra = lee.nextLine();
		//Utilizamos la funcion
		invertido = FuncionEj4.alReves(palabra);
		//imprimimos el resultado
		System.out.println("La palabra invertida es "+invertido);
		lee.close();
	}

}
