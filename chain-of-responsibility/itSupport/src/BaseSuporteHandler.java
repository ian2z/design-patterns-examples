public abstract class BaseSuporteHandler implements SuporteHandler{
    protected SuporteHandler proximo;

    @Override
    public void setProximo(SuporteHandler proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processarChamado(Chamado chamado) {
        // Se eu não puder tratar, e existir um próximo na fila, passo a bola!
        if (this.proximo != null) {
            this.proximo.processarChamado(chamado);
        }
    }
}
