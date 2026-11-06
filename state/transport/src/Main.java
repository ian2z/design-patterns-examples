public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------");
        Pedido pedido = new Pedido();
        pedido.enviar();
        pedido.pagar();
        pedido.pagar();
        pedido.enviar();
        pedido.cancelar();

        System.out.println("\n--------------------");
        Pedido outro = new Pedido();
        outro.cancelar();
        outro.pagar();
    }
}