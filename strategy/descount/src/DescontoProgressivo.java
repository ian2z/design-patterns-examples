public class DescontoProgressivo implements Desconto {
    @Override
    public double realizaDesconto (double valor) {
        if (valor <= 100){
            return valor;
        } else if (valor <= 500) {
            return valor - (valor * 0.05);
        } else if (valor > 500){
            return valor - (valor * 0.15);
        }else {
            return 0;
        }
    }
}
