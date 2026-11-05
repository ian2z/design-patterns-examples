public class AlertaTelegram implements Alerta {
    @Override
    public String realizaAlerta(String erro) {
        return erro + "[TELEGRAM BOT - NOTIFICAÇÃO PUSH]";
    }
}
