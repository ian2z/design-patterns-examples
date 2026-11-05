public class Contexto {
    private Alerta alerta;

    public void setAlerta(Alerta alerta){
        this.alerta = alerta;
    }

    public String realizarAlerta(String erro){
        return alerta.realizaAlerta(erro);
    }
}
