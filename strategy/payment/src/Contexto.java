public class Contexto {
    private Pagamento pagamento;

    public void setPagamento (Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public String realizaPagamento (double valor) {
        return pagamento.realizaPagamento(valor);
    }
}
