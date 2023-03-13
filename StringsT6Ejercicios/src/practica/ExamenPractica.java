package practica;

import java.util.Scanner;

public class ExamenPractica {
	static Scanner lee = new Scanner(System.in);
	static String palabras[] = {"humanidad", "persona","hombre", "mujer","individuo", "cuerpo", "pierna", "cabeza", "brazo", "familia"};
	final int NUMINTENTOS=7;
	static String palabraSecreta; 
	static String palabraPista="";
	static String noAcertadas="";
	
	public static void generaPalabra() {
		int posAl;
		int longitud = palabras.length;
		posAl = (int)(Math.random()*longitud);
		palabraSecreta = palabras[posAl];
		
		for(int i=0;i<palabraSecreta.length();i++) {
			palabraPista+="_";
		}
	}
	
	public static int menu(){
		int opcionUser;
		System.out.println("Seleccione una de las siguientes opciones: " + "\n1.Introducir letra " + "\n2.Introducir palabra: ");
		opcionUser = lee.nextInt();
		return opcionUser;
	}
	
	public void compruebaLetra(String letra) {
		int posLetra = palabraSecreta.indexOf(letra);
		int posInicio =0;
		String letraMinuscula = letra.toLowerCase();
		if(posLetra<0) {
			noAcertadas +=letraMinuscula + " ";
		}//en caso de que el indexOf me devuelva un numero negativo significa que no esta entonces lo concateno seguido de un espacio a la variable de noAcertadas
		else {//esta parte tengo que entenderla bien
				while (posLetra>=0) {
					//la profesora ha jugado con los substrings
				}
		}
	}//fin del metodo
}
