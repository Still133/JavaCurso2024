package cursoJava2024;

import java.util.Scanner;

public class JurosSimples {
  public static void main(String[] args) {
     //Instanciando a Classe (usando a classe):
	  Scanner scanner = new Scanner(System.in);
	 
	  //Entrada de Valores:
	  System.out.println("---------------");
	  System.out.println("------- Calculadora de Juros Simples --------");
	  System.out.println("------- Hello, Tigrinho, vai pagar hoje?!--------");
	  System.out.println("Digite o capital: ");
	  double capital = scanner.nextDouble();
	  
	  System.out.println("Informe a taxa de Juros(%): ");
	  double taxa = scanner.nextDouble();
	
	  System.out.println("Informe o tempo(em anos): ");
	  int tempo = scanner.nextInt();
	  
	  // Calculando os Juros:
	  double juros = (capital * taxa * tempo )/100;
	  System.out.println("O valor dos juros são: "+juros);
	  
	  // resultado:
	  double total = capital + juros;
			  System.out.println("O total investido + juros é de "+total);
  scanner.close() ; }
  

}
