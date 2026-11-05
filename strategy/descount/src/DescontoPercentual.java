public class DescontoPercentual implements Desconto {
    @Override
    public double realizaDesconto(double valor){
        return valor - (valor * 0.10);
    }
}
