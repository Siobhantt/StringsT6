package ejercicios;

public class FuncionLimpiaAcentos {
	public static String limpiaCadena(String frase) {
		String copia;
		copia = frase.toLowerCase(); 
		if(frase.contains("á")) {
			copia = frase.replaceAll("á", "a");
		}
		if(frase.contains("é")) {
			copia = frase.replaceAll("é", "e");
		}
		if(frase.contains("í")) {
			copia = frase.replaceAll("í", "i");
		}
		if(frase.contains("ó")) {
			copia = frase.replaceAll("ó", "o");
		}
		if(frase.contains("ú")) {
			copia = frase.replaceAll("ú", "u");
		}
		if(frase.contains("ü")) {
			copia = frase.replaceAll("ü", "u");
		}
		return copia;
	}
}
