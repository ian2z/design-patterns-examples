public class Pago implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Não é possível pagar: pedido já foi pago");
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Pedido enviado");
        pedido.setEstado(new Enviado());
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado");
        pedido.setEstado(new Cancelado());
    }
}