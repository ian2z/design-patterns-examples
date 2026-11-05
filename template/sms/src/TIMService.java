public class TIMService extends SMSservice {
    @Override

    protected void autenticarSMS(SMS sms){
        System.out.println("Autenticando servoços da TIM...");
    }

    protected  void formatarSMS(SMS sms){
        System.out.println("Formatamdo serviços da TIM...");
    }

    protected void dispararSMS(SMS sms){
        System.out.println("Disparando SMS da TIM...");
        System.out.println("TEXTO DA MENSAGEM: " + sms.getTexto());
    }

    protected void encerarConcexao(SMS sms){
        System.out.println("Encerrando conexão da TIM...");
    }
}
