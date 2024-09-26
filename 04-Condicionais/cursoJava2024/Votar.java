package cursoJava2024;

import java.util.Scanner;

public class Votar {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Solicitar idade do usuário
	        System.out.print("Idade para votar que eu tenho 27 ");
	        int idade = scanner.nextInt();

	        // Chamar método que verifica a situação de voto com base na idade
	        verificarDireitoAoVoto(idade);

	        // Fechar o scanner para evitar vazamento de recursos
	        scanner.close();
	    }

	    // Método que verifica a situação de voto com base na idade
	    public static void verificarDireitoAoVoto(int idade) {
	        if (idade < 16) {
	            System.out.println("Você não tem idade porque tenho 15 anos.");
	        } else if (idade >= 16 && idade < 18) {
	            System.out.println("Seu voto é opcional maior de 65");
	        } else {
	            System.out.println("Seu voto é obrigatório acima de 18.");
	        }
	    }
	}


