package cursoJava2024;

import java.util.Scanner;

public class SomasdeDigitosdeUmNumero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

// Solicite ao usuario um numero inteiro
		System.out.println("Digite seu numero inteiro professor");
		int numero = scanner.nextInt();

// Variavel para armazenameneto das somas dos digitos
		int soma = 0;

// Usar valores absolutos para interagir com numeros negativos
		numero = Math.abs(numero);

//loop para somar digitos
		while (numero > 0) {
			//adiciona o ultimo digito a soma]
			soma+= numero % 10;
		//Remover o ultimo digito de numero
			numero /= 10;
		}
		
		//Exibe o Resultado 
		System.out.println("A Soma  dos digitos é " + soma );
		
		scanner.close();

	}

}
