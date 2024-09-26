package cursoJava2024;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        // Passo 1: Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Passo 2: Solicitar ao usuário que insira a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Passo 3: Fechar o scanner
        scanner.close();

        // Passo 4: Verificar se a idade é maior ou igual a 18
        if (idade >= 18) {
            // Se a idade for 18 ou mais, a pessoa é maior de idade
            System.out.println("Você é maior de idade.");
        } else {
            // Caso contrário, a pessoa é menor de idade
            System.out.println("Você é menor de idade.");
        }
    }
}
