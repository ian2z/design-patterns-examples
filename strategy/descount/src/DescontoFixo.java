public class DescontoFixo implements Desconto {
    @Override
    public double realizaDesconto (double valor){
        if (valor <= 30){
            return 0;
        } else {
            return valor - 30;
        }
    }
}
