public class ProcessadorPIX extends ProcessadorRetorno{
    @Override
    protected void validarArquivo(Arquivo arquivo){
        System.out.println("Validando arquivo JSON...");
    }

    protected void processarArquivo(Arquivo arquivo){
        System.out.println("Processando arquivo de PIX de R$: " + arquivo.getValor());
    }
}
