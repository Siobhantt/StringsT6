
public class FuncionEj10 {
	public static char descodifica(char conjunto1[],char conjunto2[], char c) {
		//Paso los conjuntos a cadena
			String conj2 = String.valueOf(conjunto2);
			String conj1= String.valueOf(conjunto1);
			
			int indice;//El indice donde estará guardado el caracter
			char codificado=c;//el codificado al caracter
			indice = conj2.indexOf(c);//pido que me de el indice donde se encuentra la letra
			if(indice>=0) {//si el indice es mayor a 0 significa que esta, entonces
				//codificado es igual a lo que esta en el cojunto2 de ese mismo indice
				codificado = conj1.charAt(indice);
			}
		
			return codificado;//devuelvo el caractr codificado.
			
		}
}
