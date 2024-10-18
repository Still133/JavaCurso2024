package cursoJava2024;


public class PagamentoCartao implements InterfacePagamento {
    private String numeroCartao;
    private String nomeTitular;
    private String status;

    public PagamentoCartao(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;''
        this.status = "PENDENTE"; // Status inicial
    }

    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com cartão de crédito.");
        this.status = "PAGO"; // Atualiza o status após o pagamento
    }

    public String obterStatus() {
        return status; // Retorna o status do pagamento
    }
}

