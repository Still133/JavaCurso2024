package cursoJava2024;

// Classe base
class Funcionario {
    protected String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

// Classe derivada
class Gerente extends Funcionario {
    public Gerente(String nome) {
        super(nome);
    }

    public String verificarCargo() {
        return getNome() + " é um gerente.";
    }
}

// Classe principal para teste
public class Funcionarios {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("João");
        Gerente gerente1 = new Gerente("Maria");

        System.out.println(gerente1.verificarCargo()); // Saída: Maria é um gerente.
        System.out.println(funcionario1.getNome() + " não é um gerente."); // Saída: João não é um gerente.
    }
}x