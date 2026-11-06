public interface ReembolsoHandler {
    public void setProximo(ReembolsoHandler proximo);
    public void processarPedido (Pedido pedido);
}
