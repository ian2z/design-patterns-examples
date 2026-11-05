public class Main {
    static void main() {
        Contexto pagamento = new Contexto();
        Pagamento pix = new PagamentoPIX();
        Pagamento boleto = new PagamentoBOLETO();
        Pagamento cartao = new PagamentoCartao();

        pagamento.setPagamento(pix);
        System.out.println(pagamento.realizaPagamento(500));
        pagamento.setPagamento(boleto);
        System.out.println(pagamento.realizaPagamento(500));
        pagamento.setPagamento(cartao);
        System.out.println(pagamento.realizaPagamento(500));
    }
}
