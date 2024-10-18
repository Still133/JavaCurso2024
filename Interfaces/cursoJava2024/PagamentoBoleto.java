package cursoJava2024;

// Implements da classe PagamentoBoleto
public class PagamentoBoleto implements InterfacePagamento {
    private String codigoBarras;
    private String nomeBeneficiario;
    private String status;

    public PagamentoBoleto(String codigoBarras, String nomeBeneficiario) {
        this.codigoBarras = codigoBarras;
        this.nomeBeneficiario = nomeBeneficiario;
        this.status = "PENDENTE"; // Status inicial
    }

    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com boleto.");
        this.status = "PAGO"; // Atualiza o status após o pagamento
    }

    public String obterStatus() {
        return status; // Retorna o status do pagamento
    }
}
