package cursoJava2024;

public class DepositoBancario {
    private double saldo;

    // Construtor
    public DepositoBancario(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método público para depositar dinheiro na conta
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + "  Deposito  Realizado com sucesso.");
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método para obter o saldo
    public double getSaldo() {
        return saldo;
    }


    public static void main(String[] args) {
    	
        DepositoBancario conta = new DepositoBancario(1000.00); // Exemplo de saldo inicial
        conta.depositar(200.00); 
        System.out.println("Saldo atual: R$ " + conta.getSaldo());
    }
}
