package cursoJava2024;

import java.util.Scanner;

// Interface Pagamento
public interface InterfacePagamento {
    void pagar(double valor); // Método para realizar o pagamento
    String obterStatus(); // Método para obter o status do pagamento
}

// Implementação da classe PagamentoCartao
class PagamentoCartao implements InterfacePagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String status;

    public PagamentoCartao(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.status = "PENDENTE"; // Status inicial
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão de crédito.");
        this.status = "PAGO"; // Atualiza o status após o pagamento
    }

    @Override
    public String obterStatus() {
        return status; // Retorna o status do pagamento
    }
}

// Implementação da classe PagamentoPayPal
class PagamentoPayPal implements InterfacePagamento {
    private String email;
    private String senha;
    private String status;

    public PagamentoPayPal(String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.status = "PENDENTE"; // Status inicial
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via PayPal.");
        this.status = "PAGO"; // Atualiza o status após o pagamento
    }

    @Override
    public String obterStatus() {
        return status; // Retorna o status do pagamento
    }
}

// Implementação da classe PagamentoBoleto
class PagamentoBoleto implements InterfacePagamento {
    private String codigoBarras;
    private String nomeBeneficiario;
    private String status;

    public PagamentoBoleto(String codigoBarras, String nomeBeneficiario) {
        this.codigoBarras = codigoBarras;
        this.nomeBeneficiario = nomeBeneficiario;
        this.status = "PENDENTE"; // Status inicial
    }

    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com boleto.");
        this.status = "PAGO"; // Atualiza o status após o pagamento
    }

    @Override
    public String obterStatus() {
        return status; // Retorna o status do pagamento
    }


// Classe Main para executar o programa
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pagamento via Cartão de Crédito
        System.out.print("Digite o número do cartão de crédito: ");
        String numeroCartao = scanner.nextLine();
        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();
        System.out.print("Digite o valor a ser pago (Cartão): ");
        double valorCartao = scanner.nextDouble();

        InterfacePagamento pagamentoCartao = new PagamentoCartao(numeroCartao, nomeTitular);
        pagamentoCartao.pagar(valorCartao);
        System.out.println("Status do pagamento (Cartão): " + pagamentoCartao.obterStatus());

        scanner.nextLine(); // Limpa o buffer do scanner

        // Pagamento via PayPal
        System.out.print("Digite o e-mail do PayPal: ");
        String email = scanner.nextLine();
        System.out.print("Digite a senha do PayPal: ");
        String senha = scanner.nextLine();
        System.out.print("Digite o valor a ser pago (PayPal): ");
        double valorPayPal = scanner.nextDouble();

        InterfacePagamento pagamentoPayPal = new PagamentoPayPal(email, senha);
        pagamentoPayPal.pagar(valorPayPal);
        System.out.println("Status do pagamento (PayPal): " + pagamentoPayPal.obterStatus());

        scanner.nextLine(); // Limpa o buffer do scanner

        // Pagamento via Boleto
        System.out.print("Digite o código de barras do boleto: ");
        String codigoBarras = scanner.nextLine();
        System.out.print("Digite o nome do beneficiário: ");
        String nomeBeneficiario = scanner.nextLine();
        System.out.print("Digite o valor a ser pago (Boleto): ");
        double valorBoleto = scanner.nextDouble();

        InterfacePagamento pagamentoBoleto = new PagamentoBoleto(codigoBarras, nomeBeneficiario);
        pagamentoBoleto.pagar(valorBoleto);
        System.out.println("Status do pagamento (Boleto): " + pagamentoBoleto.obterStatus());

        scanner.close(); // Fecha o scanner
    }
}
