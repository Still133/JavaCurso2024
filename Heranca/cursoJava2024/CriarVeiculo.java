package cursoJava2024;

public class CriarVeiculo {

	public static void main(String[] args) {
		//Criar carros
		Carro carro1 = new Carro("Toyota","Corolla", 2000, 4);
		Carro carro2 = new Carro("Lamborghini.","350 GT",1964, 2);
		Carro carro3 = new Carro("Ferrari","812", 2023, 2);
		//Criar motos
		Moto moto1 = new Moto("Yamaha","YZF R-3 ABS", 2024, true);
		Moto moto2 = new Moto("Kawasaki","Ninja 400", 2018, false);
		Moto moto3 = new Moto("Kawasaki","Ninja 650R", 2011, false);
		// Exibindo o carro:
		System.out.println("Detalhes do Carros 1");
		carro1.exibirDetalhes();
		System.out.println("Detalhes do Carros 2");
		carro2.exibirDetalhes();
		System.out.println("Detalhes do Carros 3");
		carro3.exibirDetalhes();
		// Exibindo detalhes da moto
		System.out.println("Detalhes da Moto 1");
		moto1.exibirDetalhes();
		System.out.println("Detalhes da Moto 2");
		moto2.exibirDetalhes();
		System.out.println("Detalhes da Moto 3");
		moto3.exibirDetalhes();
		
	}

}