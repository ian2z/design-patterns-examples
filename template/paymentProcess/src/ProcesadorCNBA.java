public class ProcesadorCNBA extends ProcessadorRetorno {
    @Override
    protected void validarArquivo(Arquivo arquivo){
        System.out.println("Validando contagem de linhas CNBA...");
    }

    protected void processarArquivo(Arquivo arquivo){
        System.out.println("Processando arquivo de Boleto de R$ " + arquivo.getValor());
    }
}
