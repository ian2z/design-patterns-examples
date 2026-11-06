public class TecnicoHandler extends BaseSuporteHandler{
    @Override
    public void processarChamado (Chamado chamado) {
        if (chamado.getNivel() == 2){
            System.out.println("Encaminhando chamado para um Técnico...");
        } else {
            super.processarChamado(chamado);
        }
    }
}
