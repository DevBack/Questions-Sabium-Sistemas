/**
	Escreva um programa que seja capaz de identificar se uma palavra é palíndromo ou não. Uma palavra palíndromo é a palavra que é
 	possível se ler da esquerda para a direita e da direita para esquerda e tem o mesmo significado. Exemplo: ovo, reviver
**/

public class Question01 {

	public static void main(String[] args) {
		
		String palavra = "reviver";
		 
		verificadorDePalindromo (palavra);
			
	}

	private static void verificadorDePalindromo(String palavra) {
		
		//Armazena a palavra de Entrada
		String palavraOriginal = palavra;
		
		// Armazena a seguencia de caracteres invertida da palavra de entrada.
		char[] palavraModificada = new char[palavraOriginal.length()];
		
		// Linhas 21-30 realizam a inversão da sequencia de caracteres da palavra de entrada.
		int cont = (palavraOriginal.length()-1);
		String resultado;
		
		for(int i = 0; i < palavraOriginal.length(); i++) {
			
			char letra = palavraOriginal.charAt(i);
			palavraModificada[cont] = letra;
			cont--;
		
		}	
	
		// Tranforma o vetor de caracteres da variável "palavraInvertida" em String.
		resultado = String.valueOf(palavraModificada);
		
		System.out.println("Palavra Original: " + palavraOriginal);
		System.out.println("Palavra Invertida: " + String.valueOf(palavraModificada));
		System.out.println("A Palavra Digitada é Palíndromo? " + palavraOriginal.contentEquals(resultado));
		
	}
	
}
