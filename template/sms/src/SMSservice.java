public abstract class SMSservice {

    // O final tranca a ordem do algoritmo. Isto é o coração do padrão.
    public final void enviarSMS(SMS sms) {
        System.out.println("Iniciando envio para: " + sms.getDestino());
        autenticarSMS(sms);
        formatarSMS(sms);
        dispararSMS(sms);
        encerarConcexao(sms);
    }

    protected abstract void autenticarSMS(SMS sms);
    protected abstract void formatarSMS(SMS sms);
    protected abstract void dispararSMS(SMS sms);
    protected abstract void encerarConcexao(SMS sms);
}