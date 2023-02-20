package ejercicios;

import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		String palabra;
		Scanner lee = new Scanner(System.in);
		System.out.println("Por favor introduzca la palabra que quiere poner al reves: ");
	palabra = lee.nextLine();
			
	
		System.out.println(FuncionEj4.alReves(palabra));

	}

}
