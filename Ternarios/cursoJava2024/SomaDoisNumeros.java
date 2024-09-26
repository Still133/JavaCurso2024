package cursoJava2024;
import java.util.Scanner;

public class SomaDoisNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();

        int soma = n1 + n2;

        System.out.println("O Total é " + soma);

        scanner.close();
    }
}

