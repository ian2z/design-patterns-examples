public class Main {
    static void main() {
        Arquivo arquivoBoleto = new Arquivo();
        arquivoBoleto.setNome("Boleto");
        arquivoBoleto.setValor(200);

        Arquivo arquivoPix = new Arquivo();
        arquivoPix.setNome("PIX");
        arquivoPix.setValor(1000);

        ProcessadorRetorno pix = new ProcessadorPIX();
        ProcessadorRetorno boleto = new ProcesadorCNBA();

        pix.abrirArquivo(arquivoPix);
        System.out.println("---------------------------------");
        boleto.abrirArquivo(arquivoBoleto);
    }
}
