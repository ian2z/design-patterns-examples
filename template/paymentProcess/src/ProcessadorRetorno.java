public abstract class ProcessadorRetorno {

    protected final void moverArquivo(Arquivo arquivo) {
        System.out.println("Movendo arquivo para os arquivos processados...");
    }

    public final void abrirArquivo (Arquivo arquivo) {
        System.out.println("Abrindo arquivo do tipo: " + arquivo.getNome());
        validarArquivo(arquivo);
        processarArquivo(arquivo);
        moverArquivo(arquivo);
    }

    protected abstract void validarArquivo(Arquivo arquivo);
    protected abstract void processarArquivo(Arquivo arquivo);


}
