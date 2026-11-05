public class Main {
    static void main() {
        Alerta console = new AlertaConsole();
        Alerta telegram = new AlertaTelegram();
        Alerta email = new AlertaEmail();
        Contexto erro = new Contexto();
        
        erro.setAlerta(console);
        System.out.println(erro.realizarAlerta("CPU muito quente "));
        erro.setAlerta(telegram);
        System.out.println(erro.realizarAlerta("ERROR 404"));
        erro.setAlerta(email);
        System.out.println(erro.realizarAlerta("Erro de compilacao "));
    }
}
