 package cursoJava2024;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        // Passo 1: Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Passo 2: Solicitar ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Passo 3: Fechar o scanner
        scanner.close();

        // Passo 4: Verificar se o número é par ou ímpar
        if (numero % 2 == 0) {
            // Se o número for divisível por 2, ele é par
            System.out.println("O número é par.");
        } else {
            // Caso contrário, o número é ímpar
            System.out.println("O número é ímpar.");
        }
    }
}
