package cursoJava2024;

import java.util.Scanner;

public class ContagemVogais {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicita ao usuario uma frase
		System.out.println("Digite sua Frase Professor");
		String frase =  scanner.nextLine();

		// Contador de vogais abaixo
		int contagemvogais = 0;

		// Converta frase para letras minusculas para simplificar a contagem
		frase = frase.toLowerCase();

		// percorre cada caractere da frase
		for (char c : frase.toCharArray()) {
			// Verifica se o caractere é uma Vogal
			if ("aeiou".indexOf(c) != -1) {
				contagemvogais++;

			}
		}

		// Exibe resultado
		System.out.println("A Frase Contem " + contagemvogais + "vogais");

		scanner.close();
	  }
	}
	

