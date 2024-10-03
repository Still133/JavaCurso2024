package cursoJava2024;

import java.util.Scanner; // Corrigido: "Scanner" deve começar com letra maiúscula

public class NumerosDivisores {

    public static void main(String[] args) {
        int numero;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para verificar se é primo:");
        numero = scanner.nextInt(); // Corrigido: "next.Int()" deve ser "nextInt()"

        // Verifica se o número é primo e imprime o resultado
        if (isPrime(numero)) {
            System.out.println(numero + " é primo.");
        } else {
            System.out.println(numero + " não é primo.");
        }

        scanner.close(); // Corrigido: deve estar fora do bloco condicional
    }

    // Método para verificar se é primo
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        
        int divisores = 0; // Contador de divisores
        // Conta os divisores do número
        for (int i = 1; i <= n; i++) { // Corrigido: "i" deve começar em 1
            if (n % i == 0) {
                divisores++; // Incrementa contador se "i" for divisor
            }
        }

        // Se o número de divisores for maior que 2, não é primo
        return divisores == 2;
    }
}
