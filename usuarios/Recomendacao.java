package usuarios;

public class Recomendacao{
    String usuario_inicial;
    String usuario_final;
    String recomendacao;
    public String getUsuario_inicial() {
        return usuario_inicial;
    }
    public void setUsuario_inicial(String usuario_inicial) {
        this.usuario_inicial = usuario_inicial;
    }
    public String getUsuario_final() {
        return usuario_final;
    }
    public void setUsuario_final(String usuario_final) {
        this.usuario_final = usuario_final;
    }
    public String getRecomendacao() {
        return recomendacao;
    }
    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }
    
    public Recomendacao(String usuario_inicial, String usuario_final, String texto) {
        this.usuario_inicial = usuario_inicial;
        this.usuario_final = usuario_final;
        this.recomendacao = texto;
    }
}