package ejercicios;

import java.util.Scanner;

public class Ej8 {
/*Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases con “Javalín, javalón”
 * , para después hacer una pausa más o menos larga (la pausa se representa mediante espacios en blanco o tabuladores) y a continuación expresan el mensaje.
 *  Existe un dialecto que no comienza sus frases con la muletilla anterior,
pero siempre las terminan con un silencio, más o menos prolongado y la coletilla “javalén, len, len”. 
Se pide diseñar un traductor que, en primer lugar, nos diga si la frase introducida está escrita en el idioma de Javalandia (en cualquiera de sus dialectos),
 y en caso afirmativo, nos muestre solo el mensaje sin muletillas.
*/
	//Acentos, mayusculas, separar los caminos del empieza y termina
	public static void main(String[] args) {
		String frase;
		Scanner lee = new Scanner(System.in);
		boolean empieza;//creo un booleano para guadar si es true o false que empieza con el prefijo del idioma
		boolean termina;//creo un booleano para guadar si es true o false que termina con el prefijo del idioma
		String prefijo = "Javalin, javalon"; //guardo en una variable el prefijo
		String sufijo = "javalen, len, len";//guardo en una variable el sufijo
		String fraseTraducida;//una variable para guardar la ffrase traducida
	
		System.out.println("Introduzca la frase a verificar: ");
		frase = lee.nextLine();
		
		empieza = frase.startsWith(prefijo);//verfifico que la frase empiece con lo que esta guardado en la variable prefijo
		termina = frase.endsWith(sufijo);//verfifico que la frase TERMINE con lo que esta guardado en la variable sufijo
		
		if(empieza || termina) { //en caso de que la frase contenga el prefijo O el sufijo
			//significa que esta en el idioma de javalandia
			System.out.print("La frase esta escrita en el idioma de Javalandia y la traduccion es: ");
			//Para devolver la traduccion voy a reemplazar el prefijo y el sufijo por una cadena vacia
			fraseTraducida = frase.replaceAll(prefijo, "");
			
			fraseTraducida = frase.replaceAll(sufijo, "");
			System.out.println(fraseTraducida);//devuelvo la frase ttraducida
		}
		else {//en caso que no se lo comunico al usuario
			System.out.println("La frase introducida no esta en el idioma de Javalandia");
		}//fin del if
		lee.close();
	}

}
