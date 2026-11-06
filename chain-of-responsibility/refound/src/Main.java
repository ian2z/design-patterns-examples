public class Main {
    static void main() {
        Pedido pedido = new Pedido();

        ReembolsoHandler supervisor = new SupervisorHandler();
        ReembolsoHandler gerente = new GerenteHandler();
        ReembolsoHandler diretor = new DiretorHandler();

        supervisor.setProximo(gerente);
        gerente.setProximo(diretor);

        pedido.setValor(200);
        supervisor.processarPedido(pedido);
        pedido.setValor(1500);
        supervisor.processarPedido(pedido);
        pedido.setValor(20000);
        supervisor.processarPedido(pedido);
        pedido.setValor(80000);
        supervisor.processarPedido(pedido);
    }
}
