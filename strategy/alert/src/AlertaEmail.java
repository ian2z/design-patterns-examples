public class AlertaEmail implements Alerta {
    @Override
    public String realizaAlerta(String erro) {
        return erro + "[EMAIL DISPARADO]";
    }
}
