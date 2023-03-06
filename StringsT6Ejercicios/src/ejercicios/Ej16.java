package ejercicios;

import java.util.Scanner;

public class Ej16 {
/*El preprocesador del lenguaje C elimina los comentarios (/* … */// del código fuente antes de compilar. 
	//Diseña un programa que lea por teclado una sentencia en C, y elimine los comentarios:
//Sentencia: if (a==3) /* igual a tres */ a++; /* incrementamos a */
//Salida: if (a==3) a++;

	public static void main(String[] args) {
		Scanner lee = new Scanner (System.in);
		String frase;
		
		System.out.println("Por favor introduzca una sentencia en C: ");
		frase = lee.nextLine();
		frase= frase.replaceAll("\\/\\*.*?\\*\\/", "");
        System.out.println("Sentencia sin comentarios: " + frase);
		

	}

}
