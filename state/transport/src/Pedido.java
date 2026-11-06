public class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        this.estado = new AguardandoPagamento();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void pagar() {
        estado.pagar(this);
    }

    public void enviar() {
        estado.enviar(this);
    }

    public void cancelar() {
        estado.cancelar(this);
    }
}