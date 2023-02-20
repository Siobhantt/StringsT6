package ejercicios;

import java.util.Scanner;

public class Ej3 {
/*Diseña una aplicación que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.*/
	public static void main(String[] args) {
		
		Scanner lee = new Scanner(System.in);
		String	fraseUser;
		int cuentaEsp=0;
		
		System.out.println("Por favor introduzca una frase: ");
		fraseUser=lee.nextLine();//DEBO LEER LAS FRASES CON NEXTLINE PORQUE EL NEXT SOLO LEE UNA PALABRA
		//recorro la frase con un for, en caso de que alguno de los caracteres sea un espacio aumento el contador
		for(int i=0;i<fraseUser.length();i++) {
		if (fraseUser.charAt(i)== ' ') {
			cuentaEsp++;
		}
		}//fin del for
		
		System.out.println("La cantidad de espacios que contiene la frase es = " + cuentaEsp);
		
		lee.close();
		}
		
		
		
	}


