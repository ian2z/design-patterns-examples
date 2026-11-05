public class AlertaConsole implements Alerta{
    @Override
    public String realizaAlerta(String erro){
        return erro + "[URGENTE - LOCAL]";
    }
}
