package cursoJava2024;

import java.util.Scanner; // ] a classe Scanner para ler a entrada do usuário

    public class Calculadora {
    
    public static void main(String[] args) {
        // Criando o Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Solicitando o peso e a altura ao usuário
        System.out.println("Digite o seu peso (em kg): ");
        double peso = scanner.nextDouble();
        
        System.out.println("Digite a sua altura (em metros): ");
        double altura = scanner.nextDouble();
        
        // Verificando se o peso e a altura são válidos
        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso e altura devem ser positivos e maiores que zero.");
        } else {
            // Calculando o IMC
            double imc = peso / (altura * altura);
            
            // Exibindo o resultado do IMC
            System.out.printf("Seu IMC é: %.2f\n", imc);
            
            // Classificação do IMC de acordo com a tabela da OMS
            if (imc < 18.5) {
                System.out.println("Classificação: Abaixo do peso 18,05");
            } else if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Classificação: Peso normal18,05 e 24,09");
            } else if (imc >= 25 && imc <= 29.9) {
                System.out.println("Classificação: Sobrepeso 25 e 29,09");
            } else if (imc >= 30 && imc <= 34.9) {
                System.out.println("Classificação: Obesidade grau 1 30 e 34,09");
            } else if (imc >= 35 && imc <= 39.9) {
                System.out.println("Classificação: Obesidade grau 2 35 e 39,09");
            } else {
                System.out.println("Classificação: Obesidade grau 3 (mórbida) 40 ou mais");
            }
        }
        
        // Fechando o scanner
        scanner.close();
    }
}