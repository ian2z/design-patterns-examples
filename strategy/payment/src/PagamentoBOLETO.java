public class PagamentoBOLETO implements Pagamento{
    @Override
    public String realizaPagamento(double valor){
        String s = "Valor: "+(valor + 3)+" debitado";
        return s;
    }
}
