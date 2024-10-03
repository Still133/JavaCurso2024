package cursoJava2024;
import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o peso do usuário
        System.out.print("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        // Solicita a altura do usuário
        System.out.print("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o resultado
        System.out.printf("Seu IMC é: %.2f%n", imc);
}
} 