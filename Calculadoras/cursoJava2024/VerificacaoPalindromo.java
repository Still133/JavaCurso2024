package cursoJava2024;

import java.util.Scanner;

public class VerificacaoPalindromo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Solicita Palavra ao Usuario
		System.out.println("Digite uma palavra: ");
		String palavra = scanner.nextLine();
		
		// Remove espaços e transforma minusculas para comparação
		String palavraLimpa = palavra.replaceAll("\\s+", "").toLowerCase();
		
		//Inverta a Palavra
		String	palavraInvertida = new StringBuilder(palavraLimpa).reverse().toString();
		
		//Verifica  se a palavra é um palindromo
		if (palavraLimpa.equals(palavraInvertida)) {
			System.out.println(	palavra + " é um palindromo. ");
		} else {
			System.out.println("nao é um palindromo.");
			
		}
			scanner.close();
			
	
		

	}

}
