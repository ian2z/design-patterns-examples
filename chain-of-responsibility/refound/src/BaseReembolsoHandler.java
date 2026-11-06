public abstract class BaseReembolsoHandler implements ReembolsoHandler{
    ReembolsoHandler proximo;

    @Override
    public void setProximo(ReembolsoHandler proximo) {
        this.proximo = proximo;
    }

    public void processarPedido (Pedido pedido){
        if (this.proximo != null){
            this.proximo.processarPedido(pedido);
        } else {
            System.out.println("Pedido de R$ "+ pedido.getValor()+" Rejeitado, nenhum supervisor disponível;");
        }
    }
}
