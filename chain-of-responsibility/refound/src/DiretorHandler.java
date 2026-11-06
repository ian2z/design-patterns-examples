public class DiretorHandler extends BaseReembolsoHandler{
    @Override
    public void processarPedido(Pedido pedido) {
        if (pedido.getValor() > 50000){
            super.processarPedido(pedido);
        }else {
            System.out.println("Diretor aprovou o pedido de R$ " + pedido.getValor());
        }
    }
}
