package cursoJava2024;

class PagamentoPaypal implements InterfacePagamento {
    private String email;
    private String senha;
    private String status;

    public PagamentoPaypal(String email, String senha) {
        this.email = email;
        this.senha = senha;
        this.status = "PENDENTE"; // Status inicial
    }

    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via PayPal.");
        this.status = "PAGO"; // Atualiza o status após o pagamento
    }

    public String obterStatus() {
        return status; // Retorna o status do pagamento
    }
}
