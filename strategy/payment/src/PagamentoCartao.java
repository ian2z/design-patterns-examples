public class PagamentoCartao implements Pagamento{
    @Override
    public String realizaPagamento (double valor){
        String s = "Valor: "+(valor+(valor*0.05))+" debitado";
        return s;
    }
}
