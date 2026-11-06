public class SupervisorHandler extends BaseReembolsoHandler {

    @Override
    public void processarPedido(Pedido pedido) {
        if (pedido.getValor() > 500){
            super.processarPedido(pedido);
        }else {
            System.out.println("Supervisor aprovou o pedido de R$ " + pedido.getValor());
        }
    }
}
