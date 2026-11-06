public class Cancelado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Não é possível pagar: pedido cancelado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Não é possível enviar: pedido cancelado");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Não é possível cancelar: pedido já cancelado");
    }
}