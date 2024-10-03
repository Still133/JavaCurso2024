package cursoJava2024;

public class Main {

	public static void main(String[] args) {
   //Criação de uma conta com saldo inicial de R$ 1000,00
		ContaBancaria conta = new ContaBancaria(5000.00);
   
    //Exibir Saldo Inicial:
   System.out.println("Saldo inicial: "+ conta.getSaldo());
   
   // Realizando um deposito de R$ 500,00:
   conta.sacar(2500);
   
   System.out.println("Saldo Restante: "+ conta.getSaldo());
   
        }		
  	 	}