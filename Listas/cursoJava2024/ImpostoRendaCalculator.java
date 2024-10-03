package cursoJava2024;
import java.util.Scanner;

public class ImpostoRendaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário do cliente
        System.out.print("Digite seu salário mensal: R$ ");
        double salario = scanner.nextDouble();

        // Cálcular o imposto de renda com bases no salário
        double imposto = calcularImposto(salario);

        // Mostrar o resultado
        System.out.printf("Seu imposto de renda a pagar é: R$ %.2f%n", imposto);
        
        scanner.close();
    }

    private static double calcularImposto(double salario) {
        if (salario <= 1903.98) return 0; // Isento
        if (salario <= 2826.65) return (salario - 1903.98) * 0.075; // 7.5%
        if (salario <= 3751.05) return (salario - 2826.65) * 0.15 + 93.66; // 15%
        if (salario <= 4664.68) return (salario - 3751.05) * 0.225 + 207.86; // 22.5%
        return (salario - 4664.68) * 0.275 + 413.43; // 27.5%
    }
}

