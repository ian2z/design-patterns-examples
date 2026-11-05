public class PagamentoPIX implements Pagamento{
    public String realizaPagamento(double valor){
        String s = "Valor: "+(valor-(valor*0.10))+" debitado";
        return s;
    }
}


