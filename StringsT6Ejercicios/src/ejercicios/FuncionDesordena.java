package ejercicios;

import java.util.Arrays;

public class FuncionDesordena {
	public static String desordena(String frase) {
		int indice = 0;//indice para controlar el flujo de la palabra
		int indiceAleatorio = 0;//donde se guardará el indice aleatorio
		String desordenada = ""; //La palabra desordenada
		char[] tablaDesorden = new char[frase.length()]; //donde vamos a desordenar la frase o palabra
		Arrays.fill(tablaDesorden, 'º'); //llenamos toda la tabla de ºººººº

		while (indice < frase.length()) {//mientras la palabra no termine o sea, mientras el indice sea menor a la longitud
			indiceAleatorio = (int) (Math.random() * (frase.length()));//generamos un indice aleatorio y lo guardamos en la variable
			if (tablaDesorden[indiceAleatorio] == 'º') {//si lo que este guardado en el indice aleatorio de la tabla es igual a ººº entonces esa posicion esta vacia
				tablaDesorden[indiceAleatorio] = frase.charAt(indice);//Por ende guardamos la letra
				indice++;//aumentamos el indice del recorrido de la plabra para que avance
			}
		} // fin del while
		desordenada = String.valueOf(tablaDesorden);//en desordenada guardamos la tranformacion del array a cadena
		return desordenada;//devolvemos el desorden
	}
}
