public class CoordenadorHandler extends BaseSuporteHandler {
    @Override
    public void processarChamado (Chamado chamado) {
        if (chamado.getNivel() == 3){
            System.out.println("Encaminhando chamado para um Coordenador...");
        } else {
            super.processarChamado(chamado);
        }
    }
}
