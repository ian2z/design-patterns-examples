public class Enviado implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Não é possível pagar: pedido já foi enviado");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Não é possível enviar: pedido já foi enviado");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Não é possível cancelar: pedido já foi enviado");
    }
}