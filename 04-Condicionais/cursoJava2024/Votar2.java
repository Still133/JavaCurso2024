package cursoJava2024;

import java.util.Scanner;

public class Votar2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedindo a idade da pessoa
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        // Verificando se pode ou não dirigir
        if (idade < 16) {
            System.out.println("Você ainda não pode Dirigir.");
        } else if (idade >= 18 && idade <= 70) {
            System.out.println(" Você já pode Dirigir! .");
       ;
        }

        scanner.close();
    }
}