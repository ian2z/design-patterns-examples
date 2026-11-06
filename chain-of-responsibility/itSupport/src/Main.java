public class Main {
    static void main() {
        Chamado chamado = new Chamado();

        SuporteHandler estagiario = new EstagiarioHandler();
        SuporteHandler tecnico = new TecnicoHandler();
        SuporteHandler coord = new CoordenadorHandler();

        estagiario.setProximo(tecnico);
        tecnico.setProximo(coord);

        chamado.setNivel(1);
        estagiario.processarChamado(chamado);
        chamado.setNivel(2);
        estagiario.processarChamado(chamado);
        chamado.setNivel(3);
        estagiario.processarChamado(chamado);
    }
}
