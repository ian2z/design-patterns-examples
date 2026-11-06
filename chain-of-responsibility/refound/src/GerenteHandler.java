public class GerenteHandler extends BaseReembolsoHandler{
    @Override
    public void processarPedido(Pedido pedido) {
        if (pedido.getValor() > 5000){
            super.processarPedido(pedido);
        }else {
            System.out.println("Gerente aprovou o pedido de R$ " + pedido.getValor());
        }
    }

}
