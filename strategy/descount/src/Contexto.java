public class Contexto {

    private Desconto desconto;

    public void setDesconto(Desconto desconto){
        this.desconto = desconto;
    }
    public double realizaDesconto(double valor){
        return desconto.realizaDesconto(valor);
    }
}
