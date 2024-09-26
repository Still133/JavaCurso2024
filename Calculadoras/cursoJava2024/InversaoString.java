package cursoJava2024;

import java.util.Scanner;

public class InversaoString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicite uma palavra ao usuario'
		System.out.println(" Digite uma palavra ");
		String palavra = scanner.nextLine();

		// Inverte a palavra
		String palavraInvertida = new StringBuilder(palavra).reverse().toString();

		// Exibe a palavra invertida
		System.out.println(" Palavra Invertida " + palavraInvertida);

		scanner.close();

	}

}
