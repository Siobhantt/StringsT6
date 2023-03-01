package ejercicios;

import java.util.Scanner;

public class Ej10Descodificador {

	public static void main(String[] args) {
		
		char conjunto1[] = { 'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's' };
		char conjunto2[] = { 'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v' };
		String palabra;// donde voy a guardar lo que introduzca el usuario
		String palabraCodificada = ""; // Donde guardare lo que se va codificar cracter a caracter
		char codificado;// el caracter codificado
		char caracter = ' ';// el caracter seleccionado a codificar
		Scanner lee = new Scanner(System.in);

		// conjunto2= String.valueOf(conjunto2);
		System.out.println("Por favor introduzca una palabra a codificar: ");
		palabra = lee.nextLine();
		// Recorremos la palabra
		for (int i = 0; i < palabra.length(); i++) {
			// Busco el caracter que está en el indice de la iteracion
			caracter = palabra.charAt(i);
			// en la variable codificado ejecuto la funcion que me devuelve el caracter
			// codificado o el caracter normal
			codificado = FuncionEj10.descodifica(conjunto1, conjunto2, caracter);
			// CONCATENO EL CARACTER A LA PALABRA
			palabraCodificada += codificado;
		}//fin del for
		System.out.println("La palabra codificada es: " + palabraCodificada);
		lee.close();
	}

}
