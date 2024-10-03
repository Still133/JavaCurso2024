package cursoJava2024;

import java.util.Scanner;

public class IACCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar altura e peso do paciente
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        // Calcular o IAC
        double iac = ((altura * 100) - 100) / ((altura * 100) - (peso * 100) / 30);

        // Exibir resultado e classificação
        System.out.printf("Seu IAC é: %.2f%n", iac);
        System.out.println("Classificação: " + (iac < 0.8 ? "Magrelo" : (iac < 1.0 ? "Esbelto" : "Gordo baleia saco de areia")));

        scanner.close();
    }
}

