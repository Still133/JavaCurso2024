package cursoJava2024;

public class ContaBancaria {
	// Atributo privado:
	private double saldo;

	// Construtor para inicializar o saldo:
	public ContaBancaria(double saldoInicial) {
		this.saldo = saldoInicial;
	}

	// Metodo publico para sacar sua GRANA:
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			//saldo = saldo - valor;
			System.out.println("Saque de R$ " + valor + " realizado com sucesso! ");
		} else {
			System.out.println("Saque inválido. Saldo insuficiente ou valor negativo!");
		}
	}

	// Método publico para consultar o saldo(getter):
	public double getSaldo() {
		return saldo;
	}
}