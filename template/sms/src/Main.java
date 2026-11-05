public class Main {
    static void main() {

        SMS smsDaClaro = new SMS();
        SMS smsDaTim = new SMS();

        SMSservice tim = new TIMService();
        SMSservice claro = new ClaroService();

        smsDaClaro.setDestino("Claro");
        smsDaClaro.setTexto("Olá, Mundo da Claro.");

        smsDaTim.setDestino("TIM");
        smsDaTim.setTexto("Olá, Mundo da TIM.");

        claro.enviarSMS(smsDaClaro);
        System.out.println("--------------------");
        tim.enviarSMS(smsDaTim);
    }
}
