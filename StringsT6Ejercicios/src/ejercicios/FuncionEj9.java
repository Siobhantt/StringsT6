package ejercicios;

public class FuncionEj9 {
	
	
	public static char codifica(char conjunto1[],char conjunto2[], char c) {
		String conj1 = String.valueOf(conjunto1);
		String conj2= String.valueOf(conjunto2);
		
		int indice;
		char codificado;
		
		indice = conj1.indexOf(c);
		codificado = conj2.charAt(indice);
		
		
		return codificado;
		
	}

}
