package ejercicios;
/*Diseñar una función a la que se le pase una cadena de caracteres y la devuelva invertida. 
 * Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”. 
 * Recuerda probar la función en un main.*/
public class FuncionEj4 {

	public static String alReves(String palabra) {
		String cadenaInvertida = "";
			for(int i=palabra.length()-1;i>=0;i--) {
				cadenaInvertida += palabra.charAt(i);
			}
			return cadenaInvertida;
	}
}
