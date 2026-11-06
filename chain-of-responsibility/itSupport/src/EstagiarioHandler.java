public class EstagiarioHandler extends BaseSuporteHandler {
    @Override
    public void processarChamado (Chamado chamado) {
        if (chamado.getNivel() == 1){
            System.out.println("Encaminhando chamado para um Estagiário...");
        } else {
            super.processarChamado(chamado);
        }
    }
}
