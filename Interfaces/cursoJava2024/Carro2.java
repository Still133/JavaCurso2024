package cursoJava2024;

public class Carro2 implements Veiculo {
    // Construtor sem parâmetros (necessário para a linha 'new Carro')
    public Carro2() {
        // Inicialização, se necessário
    }

    @Override
    public void acelerar() {
        System.out.println("O carro vai acelerar!");
    }

    @Override
    public void frear() {
        System.out.println("O carro vai frear!");
    }
}