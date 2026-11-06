public class AguardandoPagamento implements EstadoPedido {
    @Override
    public void pagar(Pedido pedido) {
        System.out.println("Pagamento confirmado");
        pedido.setEstado(new Pago());
    }

    @Override
    public void enviar(Pedido pedido) {
        System.out.println("Não é possível enviar: pague primeiro");
    }

    @Override
    public void cancelar(Pedido pedido) {
        System.out.println("Pedido cancelado");
        pedido.setEstado(new Cancelado());
    }
}