public class ClaroService extends SMSservice {
    @Override
    protected void autenticarSMS(SMS sms){
        System.out.println("Autenticando servoços da CLARO...");
    }

    protected  void formatarSMS(SMS sms){
        System.out.println("Formatamdo serviços da CLARO...");
    }

    protected void dispararSMS(SMS sms){
        System.out.println("Disparando SMS da CLARO...");
        System.out.println("TEXTO DA MENSAGEM: " + sms.getTexto());
    }

    protected void encerarConcexao(SMS sms){
        System.out.println("Encerrando conexão da CLARO...");
    }
}
