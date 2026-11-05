public class Main {
    static void main() {

        Desconto percentual = new DescontoPercentual();
        Desconto fixo = new DescontoFixo();
        Desconto progressivo = new DescontoProgressivo();

        Contexto compra = new Contexto();

        compra.setDesconto(percentual);
        System.out.println(compra.realizaDesconto(200));
        compra.setDesconto(fixo);
        System.out.println(compra.realizaDesconto(200));
        System.out.println(compra.realizaDesconto(20));
        compra.setDesconto(progressivo);
        System.out.println(compra.realizaDesconto(100));
        System.out.println(compra.realizaDesconto(200));
        System.out.println(compra.realizaDesconto(500));
        System.out.println(compra.realizaDesconto(600));
    }
}
