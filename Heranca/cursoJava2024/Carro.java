package cursoJava2024;

import javaCursoManha.Veiculo;

public class Carro extends Veiculo {
	private int numeroDePortas;

	public Carro(String marca, String modelo, int ano, int numeroDePortas) {
		super(marca, modelo, ano);
		this.numeroDePortas = numeroDePortas;
	}

	@Override
	public void exibirDetalhes() {
		super.exibirDetalhes();
		System.out.println("Número de Portas: " + numeroDePortas);
	}
}