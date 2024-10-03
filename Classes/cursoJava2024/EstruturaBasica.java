package cursoJava2024;

import java.util.Scanner;

public class EstruturaBasica {
// Metodo principal  - ponto  de entrada  do programa
	public static void main(String[] args) {
//Declaraçao  de variavel numero
		int numero;
		 
 Scanner scanner = new Scanner (System.in);
 System.out.println("Digite um numero para verificar se é primo: ");
 numero = scanner.nextInt();
 
  if (isPrime(numero)) {
System.out.println(numero + " é primo.");	  
  } else {
	  System.out.println(numero + " não é primo.");
  }
   scanner.close();
	}

private static boolean isPrime(int numero) {
	// TODO Auto-generated method stub
	return false;
}

}
